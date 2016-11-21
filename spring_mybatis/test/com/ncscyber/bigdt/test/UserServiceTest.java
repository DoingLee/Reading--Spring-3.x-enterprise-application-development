package com.ncscyber.bigdt.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zq.foo.entity.Address;
import com.zq.foo.entity.User;
import com.zq.foo.service.UserService;

public class UserServiceTest {
	private ClassPathXmlApplicationContext context;
	private UserService userService;
	
	@Before
	public void init(){
		context = new ClassPathXmlApplicationContext("spring_config/applicationContext.xml");
		userService = (UserService)context.getBean("userService");
	}
	
	@Test
	public void testUserInsert(){
		User u = new User("zhaoq",23,"13833033003","111111");
		Address addr = new Address("beijing","100000");
		Address addr2 = new Address("baoding","071000");
		u.getAddrs().add(addr);
		u.getAddrs().add(addr2);
		u = userService.insertUser(u);
		System.out.println(u.getUid());
	}
	
	/**
	 * 
	 */
	@Test
	public void testDelete(){
//		User u = userService.getOneUser(2L);
		userService.deleteUser(2L);
//		userService.insertUser(u);
	}
	
	@Test
	public void testSelectAll(){
		Map<String,Object> likeCondition = new HashMap<String,Object>();
//		likeCondition.put("page", 1);
//		likeCondition.put("pageCount", 2);
		likeCondition.put("name", "%zh%");
//		likeCondition.put("phone", "%%");
//		likeCondition.put("age", "%23%");
		List<User> users = userService.getUserNeeded(likeCondition);
		for(User u : users){
			System.out.println(u.getName()+"  "+u.getPhone()+"  "+u.getAddrs().size());
		}
	}
	
	@Test
	public void allUsers(){
		List<User> users = userService.getUserNeeded(null);
		for(User u : users){
			System.out.println(u.getName()+"---"+u.getPhone());
		}
	}
	
	@Test
	public void testGetOneUser(){
		User u = userService.getOneUser(1L);
		System.out.println(u.getName()+"--"+u.getPhone());
	}
	
	@Test
	public void testUpdate(){
		User u = new User();
		u.setUid(1L);
		u.setPasswd("hasdasdhei");
		u.setAge(55);
		u.setPhone("12323132");
		u.setName("heasei");
		Address addr = new Address("beijing","100000");
		u.getAddrs().add(addr);
		userService.updateUser(u);
	}
}
