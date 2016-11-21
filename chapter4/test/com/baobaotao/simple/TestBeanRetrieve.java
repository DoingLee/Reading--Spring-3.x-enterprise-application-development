package com.baobaotao.simple;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanRetrieve extends TestCase {

	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = {
			"com/baobaotao/simple/beans.xml"};

	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
	}
	
	public void testBeanRetrieve(){
		Car car = (Car)factory.getBean("#car1");
		assertNotNull(car);
	}
}
