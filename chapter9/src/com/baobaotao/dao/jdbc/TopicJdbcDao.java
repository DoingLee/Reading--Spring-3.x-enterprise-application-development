package com.baobaotao.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.baobaotao.dao.TopicDao;
import com.baobaotao.domain.Topic;

public class TopicJdbcDao extends JdbcDaoSupport implements TopicDao {

	public void addTopic(final Topic topic) {
		final String sql = "INSERT INTO t_topic(topic_title) VALUES(?)";
        		
//		KeyHolder keyHolder = new GeneratedKeyHolder();
//		getJdbcTemplate().update(new PreparedStatementCreator() {
//			public PreparedStatement createPreparedStatement(Connection conn)
//					throws SQLException {
//				PreparedStatement ps = conn.prepareStatement(sql);
//				ps.setString(1, topic.getTopicTitle());
//				return ps;
//			}
//		}, keyHolder);
//		topic.setTopicId(keyHolder.getKey().intValue());
		
		Object[] params = new Object[]{topic.getTopicTitle()};
		getJdbcTemplate().update(sql, params);
	}
}
