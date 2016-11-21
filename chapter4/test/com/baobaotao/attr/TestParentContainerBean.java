package com.baobaotao.attr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestParentContainerBean {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext pFactory = new ClassPathXmlApplicationContext(
				new String[]{"com/baobaotao/attr/beans1.xml"});
		ApplicationContext factory = new ClassPathXmlApplicationContext(
		new String[]{"com/baobaotao/attr/beans2.xml"},pFactory);
		Boss boss = (Boss)factory.getBean("boss");
		System.out.println(boss.getCar().toString());
	}
}
