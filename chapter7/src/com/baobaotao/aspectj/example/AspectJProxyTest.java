package com.baobaotao.aspectj.example;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import com.baobaotao.NaiveWaiter;
import com.baobaotao.Waiter;

public class AspectJProxyTest {
	
	public static void main(String[] args)throws Exception{
		Waiter target = new NaiveWaiter();
		
		AspectJProxyFactory factory = new AspectJProxyFactory();
		
		factory.setTarget(target);
	
		factory.addAspect(PreGreetingAspect.class);
		
		Waiter waiter = factory.getProxy();
		
		waiter.greetTo("tom");
		waiter.serveTo("tom");
	}
}
