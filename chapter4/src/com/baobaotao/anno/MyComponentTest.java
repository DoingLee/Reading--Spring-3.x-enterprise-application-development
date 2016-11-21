package com.baobaotao.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class MyComponentTest {
	public static void main(String[] args) throws Throwable {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/baobaotao/anno/mycomponent.xml");
		MyComponent myComponent = ctx.getBean(MyComponent.class);
		System.out.println("pulgin.size:"+myComponent.getPlugins().size());
		
	}
}
