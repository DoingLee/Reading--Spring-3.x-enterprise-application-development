package com.baobaotao.editor;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.editor.Boss;

public class TestCustomerEditor extends TestCase {
	public ApplicationContext ctx = null;

	private static String[] CONFIG_FILES = { "com/baobaotao/editor/beans.xml" };

	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);
	}
	
	public void testCustomerCarEditor(){
		Boss boss = (Boss) ctx.getBean("boss");
		assertNotNull(boss);
	    System.out.println(boss);
	} 
	
}
