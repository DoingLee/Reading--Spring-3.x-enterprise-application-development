package com.baobaotao.schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.NaiveWaiter;
import com.baobaotao.NaughtyWaiter;
import com.baobaotao.Seller;
import com.baobaotao.SmartSeller;
import com.baobaotao.Waiter;                                                              
public class SchemaTest {
	public static void main(String[] args)throws Exception{
		String configString = "com/baobaotao/schema/beans.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(configString);
		
		//Waiter waiter = (NaiveWaiter)ac.getBean("naiveWaiter");
		NaiveWaiter nw = (NaiveWaiter)ac.getBean("naiveWaiter");
		//waiter.greetTo("Tom");
		Waiter naughtyWaiter = (NaughtyWaiter)ac.getBean("naughtyWaiter");
		naughtyWaiter.serveTo("---------------");
		
		nw.smile("kim", 101);
		((Seller)nw).sell("xxxxxx", "jtm");
		//SmartSeller seller = (SmartSeller)ac.getBean("seller");
		//seller.sell("goods", "kim");
		//seller.checkBill(1);
	}
}
