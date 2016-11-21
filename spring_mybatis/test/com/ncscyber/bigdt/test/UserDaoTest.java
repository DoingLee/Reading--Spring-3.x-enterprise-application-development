package com.ncscyber.bigdt.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zq.foo.dao.UserDao;
import com.zq.foo.entity.Address;
import com.zq.foo.entity.Pagination;
import com.zq.foo.entity.User;


public class UserDaoTest {
	private ClassPathXmlApplicationContext context;
	private UserDao userDao;
	
	 @Before
	public void init(){
		context = new ClassPathXmlApplicationContext("spring_config/applicationContext.xml");
		userDao = (UserDao)context.getBean("userDao");
	}
	 
 
	//INSERT INTO USER_INFO VALUES(1,'admin','123','1986-11-24',1,20);
	@Test
	public void testGetOneUser(){
		 
		System.out.println(userDao.getUser(1l).getName()+"---");
	}
	 
}
