package com.baobaotao.dao;

import java.util.List;

import com.baobaotao.domain.Forum;

public interface ForumDao {
	
   void addForum(Forum forum);
   
   void updateForum(Forum forum);
   
   Forum getForum(int forumId);
   
   int getForumNum();
}
