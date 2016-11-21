package com.baobaotao.anno;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnoAutowire  extends TestCase {
	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = { "com/baobaotao/anno/beans.xml" };
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
		
	}
	
	public void testAutoByName(){
		Boss boss = (Boss) factory.getBean("boss");
//		System.out.println("boss.office:"+boss.getOffice());
//		System.out.println("boss.title:"+boss.getTitle());
//		System.out.println("boss.car:"+boss.getCar());
	}
	
}
