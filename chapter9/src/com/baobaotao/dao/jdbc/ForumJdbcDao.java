package com.baobaotao.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.baobaotao.dao.ForumDao;
import com.baobaotao.domain.Forum;

public class ForumJdbcDao extends JdbcDaoSupport implements ForumDao {
	public void addForum(final Forum forum) {
		final String sql = "INSERT INTO t_forum(forum_name,forum_desc) VALUES(?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();
		getJdbcTemplate().update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection conn)
					throws SQLException {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, forum.getForumName());
				ps.setString(2, forum.getForumDesc());
				return ps;
			}
		}, keyHolder);
		forum.setForumId(keyHolder.getKey().intValue());
	}
	public Forum getForum(final int forumId) {
		String sql = "SELECT forum_name,forum_desc FROM t_forum WHERE forum_id=?";
		final Forum forum = new Forum();
		getJdbcTemplate().query(sql, new Object[]{forumId},
				new RowCallbackHandler() {
					public void processRow(ResultSet rs) throws SQLException {
						forum.setForumId(forumId);
						forum.setForumName(rs.getString("forum_name"));
						forum.setForumDesc(rs.getString("forum_desc"));
					}
				});
		return forum;
	}

	public int getForumNum() {
		String sql = "SELECT forum_id FROM t_forum ";
		return getJdbcTemplate().queryForInt(sql);
	}
	public void updateForum(final Forum forum) {
		final String sql = "UPDATE  t_forum SET forum_name=?,forum_desc=? WHERE forum_id=?";
		Object[] params = new Object[]{forum.getForumName(),forum.getForumDesc(),forum.getForumId()};
		getJdbcTemplate().update(sql,params);		
	}
}
