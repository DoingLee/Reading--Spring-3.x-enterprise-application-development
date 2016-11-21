package com.baobaotao.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.domain.Forum;
import com.baobaotao.service.hibernate.BbtForumSerive;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-hbt.xml"})
@TransactionConfiguration(transactionManager="transactionManager")
@Transactional
public class TestHibernateBbtForum {
	
	@Autowired
	private BbtForumSerive bbtForumSerive;
	
	@Test
	public void testHibernateInit(){	
		Forum forum = new Forum();
		forum.setForumId(99);
		forum.setForumName("name 99");
		forum.setForumDesc("desc");
		bbtForumSerive.addForum(forum);
	}   

}
