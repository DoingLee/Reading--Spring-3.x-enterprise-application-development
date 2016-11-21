package com.baobaotao.dao.mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.Forum;

@Repository
public class ForumMybatisTemplateDao{
   
   @Autowired
   private SqlSessionTemplate sessionTemplate;
   
   public Forum getForum(int forumId){
	   return (Forum)sessionTemplate.selectOne(
			   "com.baobaotao.dao.mybatis.ForumMybatisDao.getForum",
			   forumId);  
   }
   
   public Forum getForum2(int forumId){
	   ForumMybatisDao forumMybatisDao =
		   sessionTemplate.getMapper(ForumMybatisDao.class);
	   return forumMybatisDao.getForum(forumId);
   }
}
