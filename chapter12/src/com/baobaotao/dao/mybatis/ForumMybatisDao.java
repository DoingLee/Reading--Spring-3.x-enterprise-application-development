package com.baobaotao.dao.mybatis;

import java.util.List;

import com.baobaotao.domain.Forum;

public interface ForumMybatisDao{
	void addForum(Forum forum);	
	void updateForum(Forum forum) ;
	Forum getForum(int forumId) ;
	long getForumNum() ;
	List<Forum> findForumByName(String forumName);
}
