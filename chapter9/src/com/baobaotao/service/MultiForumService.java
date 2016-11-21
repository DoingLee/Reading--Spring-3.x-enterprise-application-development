package com.baobaotao.service;

import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.ForumTransactional;
import com.baobaotao.TopicTransactional;
import com.baobaotao.dao.ForumDao;
import com.baobaotao.dao.PostDao;
import com.baobaotao.dao.TopicDao;
import com.baobaotao.domain.Forum;
import com.baobaotao.domain.Topic;

public class MultiForumService {
	private ForumDao forumDao;
	private TopicDao topicDao;
	private PostDao postDao;
	
//	@Transactional("topic")
	@TopicTransactional
	public void addTopic(Topic topic) throws Exception {
       System.out.println("topic tx");
	}
	
//	@Transactional("forum")
	@ForumTransactional
	public void updateForum(Forum forum) {
		System.out.println("forum tx");
	}
	
	public ForumDao getForumDao() {
		return forumDao;
	}
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}
	public TopicDao getTopicDao() {
		return topicDao;
	}
	public void setTopicDao(TopicDao topicDao) {
		this.topicDao = topicDao;
	}
	public PostDao getPostDao() {
		return postDao;
	}
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	
}
