package com.zq.foo.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationDataBaseInit implements ServletContextListener {
	private Connection con;
	{
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring_config/applicationContext.xml");
			DataSource dataSource = (DataSource)context.getBean("dataSource");
			con = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void contextDestroyed(ServletContextEvent event) {
		try {
			if(!con.isClosed()){
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void contextInitialized(ServletContextEvent event) {
		boolean notInit = true;
		DBEnvironmentListener db = new DBEnvironmentListener();
		try {
			notInit = db.isDataBaseInit(con);
			if(notInit){
				System.out.println("尚未创建数据库....");
				System.out.println("创建数据库...."+new Date());
				db.initDataBase(con);
				System.out.println("数据库创建完成...."+new Date());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
