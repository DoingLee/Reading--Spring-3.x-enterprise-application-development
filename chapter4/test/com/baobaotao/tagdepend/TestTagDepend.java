package com.baobaotao.tagdepend;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTagDepend  extends TestCase {
	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = { "com/baobaotao/tagdepend/beans.xml" };
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
		
	}
	public void testInheritTag(){
		Car car3 = (Car)factory.getBean("car3");
		Car car4 = (Car)factory.getBean("car4");
		assertNotNull(car3);
		assertNotNull(car4);	
	}

	public void testReferenceTag(){
		Boss boss = (Boss)factory.getBean("boss");
		assertNotNull(boss);
		System.out.println(boss);
	}
}
