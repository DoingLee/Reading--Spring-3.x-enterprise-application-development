package com.baobaotao.dao.hibernate;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.dao.hibraw.ForumHibernateDao;
import com.baobaotao.domain.Forum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-hbt-raw.xml" })
@TransactionConfiguration
@Transactional
public class TestRawApiHibernateDao {

	@Autowired
	private ForumHibernateDao forumDao;
	
	@Test
	public void testAllMethod() {
		Forum forum = forumDao.getForum(1);
		Assert.assertNotNull(forum);
		
		List<Forum> forums = forumDao.findForumByName("forum");
		Assert.assertTrue(forums.size()>0);
	}	
		
}
