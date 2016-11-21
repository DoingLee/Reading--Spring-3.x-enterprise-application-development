package com.baobaotao.service;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;

import com.baobaotao.dao.mybatis.ForumMybatisTemplateDao;
import com.baobaotao.domain.Forum;
import com.baobaotao.domain.Post;
import com.baobaotao.domain.Topic;
import com.baobaotao.service.mybatis.BbtForumSerive;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-mybatis.xml"})
@TransactionConfiguration(transactionManager="transactionManager")
@Transactional
public class TestMybatisBbtForum {
	
	@Autowired
	private BbtForumSerive bbtForumSerive;
	
	@Autowired
	private ForumMybatisTemplateDao forumMybatisTemplateDao;
	
	@Test
	public void testForumMethod(){	
		Forum forum = new Forum();
		forum.setForumId(99);
		forum.setForumName("name_99");
		forum.setForumDesc("desc");
		bbtForumSerive.addForum(forum);
		
		Forum forum1 = bbtForumSerive.getForum(99);
		Assert.assertEquals("name_99", forum1.getForumName());
		forum1.setForumName("forum99");
		bbtForumSerive.updateForum(forum1);
	} 
	
	@Test
	public void testTopicMethod(){
		Topic topic1 = new Topic();
		topic1.setTopicId(99);
		topic1.setTopicTitle("title99");
		topic1.setUserId(1);
		topic1.setTopicTime(new Date());
		Forum forum = new Forum();
		forum.setForumId(1);
		topic1.setForum(forum);
		bbtForumSerive.addTopic(topic1);
	}

	@Test
	public void testPostMethod() throws Throwable{
		Post post = new Post();
		post.setPostId(99);
		post.setPostText("post content...");
		post.setPostTime(new Date());
		post.setUserId(1);
		Topic topic = new Topic();
		topic.setTopicId(1);
		post.setTopic(topic);
		
		Resource resource = new ClassPathResource("temp.jpg");
        byte[] imgFile =FileCopyUtils.copyToByteArray(resource.getFile());
        post.setPostAttach(imgFile);    
        
        post.setPostAttach(imgFile);
        bbtForumSerive.addPost(post);
	}	
	
	@Test
	public void testTemplateDao(){
		Forum forum = forumMybatisTemplateDao.getForum(1);
		Assert.assertEquals("forum1", forum.getForumName());
	}
}
