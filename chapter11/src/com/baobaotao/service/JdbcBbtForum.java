package com.baobaotao.service;

import com.baobaotao.dao.ForumDao;
import com.baobaotao.domain.Forum;

public class JdbcBbtForum implements BbtForum {
    private ForumDao forumDao;
    
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}

	public void addForum(Forum forum) {
		forumDao.addForum(forum);
	}
}
