package com.baobaotao.schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.NaiveWaiter;
import com.baobaotao.Seller;
import com.baobaotao.SmartSeller;
import com.baobaotao.Waiter;

public class SchemaAspectTest {
	public static void main(String[] args) {
		String configPath = "com/baobaotao/schema/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
		Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");	
		Seller seller = (Seller) ctx.getBean("seller");
//		naiveWaiter.greetTo("John");
//		naughtyWaiter.greetTo("Tom");
		
		//后置增强
//		((SmartSeller)seller).sell("Beer","John");
		
		//环境增强
//		naiveWaiter.serveTo("John");
		
		//抛出异常增强
//		((SmartSeller)seller).checkBill(1);
		
		//final增强
//		naiveWaiter.greetTo("John");
		
		//引入增强
//		((Seller)naiveWaiter).sell("Beer","John");
//		((NaiveWaiter)naiveWaiter).smile("John", 2);
		
		//advisor
		naiveWaiter.greetTo("John");
		
	}
}
