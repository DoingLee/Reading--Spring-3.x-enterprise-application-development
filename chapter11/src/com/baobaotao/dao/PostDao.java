package com.baobaotao.dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.LobRetrievalFailureException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.jdbc.support.lob.*;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.util.FileCopyUtils;
import org.springframework.jdbc.core.support.AbstractLobStreamingResultSetExtractor;

import com.baobaotao.domain.Post;

@Repository
public class PostDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private LobHandler lobHandler;
	
	@Autowired
	private DataFieldMaxValueIncrementer incre; 

	public void addPost(final Post post){
    	String sql = " INSERT INTO t_post(post_id,user_id,post_text,post_attach)"
			       + " VALUES(?,?,?,?)";
    	jdbcTemplate.execute(sql,new AbstractLobCreatingPreparedStatementCallback(this.lobHandler) {
	      protected void setValues(PreparedStatement ps,LobCreator lobCreator)
                  throws SQLException {
		    	    //1：固定主键
				    //ps.setInt(1,1);
		    	  
		    	    //2：通过自增键指定主键值    	  
		    	    ps.setInt(1, incre.nextIntValue());
					ps.setInt(2, post.getUserId());	
					lobCreator.setClobAsString(ps, 3, post.getPostText());
					lobCreator.setBlobAsBytes(ps, 4, post.getPostAttach());
				}
			});

    };

	public void getNativeConn() {
	};

	public List<Post> getAttachs(final int userId) {
		String sql = " SELECT post_id,post_attach FROM t_post where user_id =? and post_attach is not null ";
		return jdbcTemplate.query(sql, new Object[] { userId },
				new RowMapper<Post>() {
					public Post mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						int postId = rs.getInt(1);
						byte[] attach = lobHandler.getBlobAsBytes(rs, 2);
						Post post = new Post();
						post.setPostId(postId);
						post.setPostAttach(attach);
						return post;
					}
				});
 
	};

	@SuppressWarnings("unchecked")
	public OutputStream getAttach(final int postId) {
		final OutputStream os = null;
		String sql = "SELECT post_attach FROM t_post WHERE post_id=? ";
		jdbcTemplate.query(sql, new Object[] {postId},
			new AbstractLobStreamingResultSetExtractor() {			
				protected void handleNoRowFound() throws LobRetrievalFailureException {
						System.out.println("Not Found result!");
					}
	                   
				public void streamData(ResultSet rs) throws SQLException,IOException {
						InputStream is = lobHandler.getBlobAsBinaryStream(rs, 1);
						if (is != null) {
							FileCopyUtils.copy(is, os);
						}
				}
			}
		);
		return os;
	};
}
