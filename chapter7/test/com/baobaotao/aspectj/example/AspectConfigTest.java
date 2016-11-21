package com.baobaotao.aspectj.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.Waiter;

public class AspectConfigTest {
	public static void main(String[] args) {
		String configPath = "com/baobaotao/aspectj/example/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("John");
		waiter.serveTo("John");
		waiter.toString();
	}
}
