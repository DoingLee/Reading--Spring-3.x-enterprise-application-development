package com.baobaotao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.domain.Forum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration
@Transactional
public class TestForumOODao {

	@Autowired
	private ForumOODao forumDao;
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
    public void testGetForum(){
    	jdbcTemplate.execute(" insert into  t_forum(forum_name,forum_desc) "+
    			             " values('test','test')");
    	int forumId = jdbcTemplate.queryForInt("select max(forum_id) from t_forum"); 	
    	Forum forum = forumDao.getForum(forumId);
    	System.out.println(forum.getForumName());
    }
    
	@Test
    public void testAddForum(){
		Forum forum = new Forum();
		forum.setForumName("test2");
		forum.setForumDesc("desc 2");
    	forumDao.addForum(forum);
    }
    
	@Test
    public void testGetTopicNum(){
		int topicNum = forumDao.getTopicNum(1);
		System.out.println("topicNum:"+topicNum);
    }	
	
}
