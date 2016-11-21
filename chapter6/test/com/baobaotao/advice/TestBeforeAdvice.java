package com.baobaotao.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeAdvice {
	public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        BeforeAdvice  advice = new GreetingBeforeAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.setInterfaces(target.getClass().getInterfaces());
        pf.setOptimize(true);
        pf.setTarget(target);
        pf.addAdvice(advice);

        Waiter proxy = (Waiter)pf.getProxy(); 
        proxy.greetTo("John");
        proxy.serveTo("Tom");
	}
}
