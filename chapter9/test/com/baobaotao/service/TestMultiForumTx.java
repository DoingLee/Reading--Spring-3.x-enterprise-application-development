package com.baobaotao.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.domain.Post;
import com.baobaotao.domain.Topic;

public class TestMultiForumTx{
	public static void main(String[] args) throws Throwable{
		String configPath = "classpath:applicationContext-multi.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		MultiForumService forumService = ctx.getBean(MultiForumService.class);
		System.out.println("begin");
		forumService.addTopic(null);
		System.out.println("end");
		
		System.out.println("begin");
		forumService.updateForum(null);
		System.out.println("end");
    	
    }
}
