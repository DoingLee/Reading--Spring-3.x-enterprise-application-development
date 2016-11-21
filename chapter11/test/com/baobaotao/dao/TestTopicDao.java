package com.baobaotao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.dao.ForumDao;
import com.baobaotao.dao.TopicDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration
@Transactional
public class TestTopicDao {
	@Autowired
	private TopicDao topicDao;

	@Test
	public void testGetReplyRate() {
		double rate = topicDao.getReplyRate(2);
		System.out.println("rate is:" + rate);
	}
    
	@Test
	public void testGetUserTopicNum() throws Throwable {
		int num = topicDao.getUserTopicNum(1);
		System.out.println("num is:" + num);
	}

	//
	// public void testGetUserTopicNum2() throws Throwable{
	// int num = topicDao.getUserTopicNum2(1);
	// System.out.println("num is:" + num);
	// }
	
	@Test
	public void testGetTopicRowSet() {
		SqlRowSet srs = topicDao.getTopicRowSet(1);
		while (srs.next()) {
			System.out.println(srs.getString("topic_id"));
		}
	}

}
