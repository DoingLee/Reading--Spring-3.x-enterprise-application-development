package com.baobaotao.aspectj.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.Seller;
import com.baobaotao.Waiter;

public class DeclaredParentsTest {
	public static void main(String[] args) {
		String configPath = "com/baobaotao/aspectj/basic/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("John");
		Seller seller = (Seller)waiter;
		seller.sell("Beer", "John");
	}
}
