package com.baobaotao.service.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.dao.mybatis.ForumMybatisDao;
import com.baobaotao.dao.mybatis.PostMybatisDao;
import com.baobaotao.dao.mybatis.TopicMybatisDao;
import com.baobaotao.domain.Forum;
import com.baobaotao.domain.Post;
import com.baobaotao.domain.Topic;

@Transactional
@Service
public class BbtForumSerive{
	
	@Autowired
	private ForumMybatisDao forumDao;
	
	@Autowired
	private TopicMybatisDao topicDao;
	
	@Autowired
	private PostMybatisDao postDao;
	
	public void addForum(Forum forum) {
		forumDao.addForum(forum);
	}
	public void addTopic(Topic topic) {
		topicDao.addTopic(topic);
	}
	public void addPost(Post post) {
		postDao.addPost(post);
	}

	public Forum getForum(int forumId) {
		return forumDao.getForum(forumId);
	}
	public void updateForum(Forum forum) {
		forumDao.updateForum(forum);
	}
	public long getForumNum() {
		return forumDao.getForumNum();
	}
	public List<Forum> findForumByName(String forumName) {
		return forumDao.findForumByName(forumName);
	}
	public Post getPost(int postId) {
		return postDao.getPost(postId);
	}

}
