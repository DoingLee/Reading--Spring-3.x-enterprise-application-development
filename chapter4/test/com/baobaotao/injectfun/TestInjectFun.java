package com.baobaotao.injectfun;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjectFun  extends TestCase {
	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = { "com/baobaotao/injectfun/beans.xml" };
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
		
	}
	
	public void testLookup(){
		MagicBoss mboss = (MagicBoss) factory.getBean("magicBoss");
		assertNotSame(mboss.getCar(),mboss.getCar());
	}
	public void testReplace(){
		MagicBoss mboss = (MagicBoss) factory.getBean("magicBoss_1");
		assertEquals(mboss.getCar().getBrand(),"美人豹");
	}
	
}
