package com.baobaotao.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.dao.ForumDao;
import com.baobaotao.domain.Forum;
import com.baobaotao.service.BbtForum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration
@Transactional
public class TestForumDao {

	@Autowired
	private ForumDao forumDao;

	@Test
	public void testAddForums() throws Throwable {	
		List<Forum> forums = new ArrayList<Forum>();
		for(int i =0 ;i< 100000 ;i++){
			Forum f1 = new Forum();
			f1.setForumName("爱美妈妈");
			f1.setForumDesc("减肥、塑身、化妆品");	
			forums.add(f1);
		}
		forumDao.addForums(forums);
	}

	@Test
	public void testAddForum() {
		Forum forum = new Forum();
		forum.setForumName("1二手市场");
		forum.setForumDesc("1二手货物的交流论坛。");
		forumDao.addForum(forum);
		System.out.println(forum.getForumId());
	}
	
	@Test
	public void testAddForumByNamedParams() {
		Forum forum = new Forum();
		forum.setForumName("2二手市场");
		forum.setForumDesc("2二手货物的交流论坛。");
		forumDao.addForumByNamedParams(forum);
	}	

}
