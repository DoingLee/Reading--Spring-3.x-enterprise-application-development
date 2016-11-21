package com.baobaotao.impt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.baobaotao.fb.Car;

public class Test {

	  public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/impt/beans2.xml");
		 Car car = ctx.getBean("car1",Car.class);
		 System.out.println(car.getMaxSpeed());
	}
}
