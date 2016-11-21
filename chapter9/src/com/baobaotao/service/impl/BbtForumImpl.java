package com.baobaotao.service.impl;

import java.sql.SQLException;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.dao.ForumDao;
import com.baobaotao.dao.PostDao;
import com.baobaotao.dao.TopicDao;
import com.baobaotao.domain.Forum;
import com.baobaotao.domain.Topic;
import com.baobaotao.service.BbtForum;

@Transactional
public class BbtForumImpl implements BbtForum {
	private ForumDao forumDao;
	private TopicDao topicDao;
	private PostDao postDao;
	public void addTopic(Topic topic) throws Exception {
		topicDao.addTopic(topic);
		//if(true) throw new PessimisticLockingFailureException("fail");
		postDao.addPost(topic.getPost());
	}
	@Transactional(readOnly=true)
	public Forum getForum(int forumId) {
		return forumDao.getForum(forumId);
	}
	public void updateForum(Forum forum) {
		forumDao.updateForum(forum);
	}
	public int getForumNum() {
		return forumDao.getForumNum();
	}	
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	public void setTopicDao(TopicDao topicDao) {
		this.topicDao = topicDao;
	}
}
