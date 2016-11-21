package com.baobaotao.placeholder;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlaceHolderTest {

	public static void main(String[] args) throws Throwable {
		String resourceFile = "com/baobaotao/placeholder/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resourceFile);
		DataSource ds = ctx.getBean(DataSource.class);
		Connection conn = ds.getConnection();
		
		System.out.println(ctx.getBean(MyDataSource.class));
	}
}
