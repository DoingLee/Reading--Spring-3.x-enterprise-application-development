package com.baobaotao.event;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMailSender extends TestCase {
	public ApplicationContext ctx = null;

	private static String[] CONFIG_FILES = {"com/baobaotao/event/beans.xml"};

	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);
	}

	public void testMailSender() {
       MailSender mailSender = (MailSender)ctx.getBean("mailSender");
       mailSender.sendMail("aaa@bbb.com");
	}
}
