package com.ncscyber.bigdt.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zq.foo.entity.Address;
import com.zq.foo.entity.User;
import com.zq.foo.service.AddressService;


public class AddressServiceTest {
	private ClassPathXmlApplicationContext context;
	private AddressService addressService;
	
	@Before
	public void init(){
		context = new ClassPathXmlApplicationContext("classpath:spring_config/applicationContext.xml");
		addressService = (AddressService)context.getBean("addressService");
	}
	
	@Test
	public void insertAddress(){
		Address addr = new Address();
		User u = new User();
		u.setUid(1L);
		addr.setAddress("beijing");
		addr.setPostCode("100000");
//		addr.setAid(100L);
		addr.setUser(u);
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("address", addr);
//		map.put("uid", 1L);
		addressService.insertAddress(addr);
		System.out.println(addr.getAid());
	}
}









