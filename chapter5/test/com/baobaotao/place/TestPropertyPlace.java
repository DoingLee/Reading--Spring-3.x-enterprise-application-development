package com.baobaotao.place;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;


public class TestPropertyPlace extends TestCase {
	public ApplicationContext ctx = null;

	private static String[] CONFIG_FILES = { "com/baobaotao/place/beans.xml" };

	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);
		
	}
	
	public void testCustomerCarEditor(){
		Car car = (Car)ctx.getBean("car");
		assertNotNull(car);
		System.out.println("car:"+car);
	} 	
}
