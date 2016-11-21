package com.baobaotao.auto;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire  extends TestCase {
	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = { "com/baobaotao/auto/beans.xml" };
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
		
	}
	
	public void testAutoByName(){
		Boss boss = (Boss) factory.getBean("boss");
		System.out.println("boss:"+boss);
	}
	
}
