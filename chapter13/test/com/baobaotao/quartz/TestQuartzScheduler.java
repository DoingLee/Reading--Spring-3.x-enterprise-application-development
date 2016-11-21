package com.baobaotao.quartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-quartz.xml"})
public class TestQuartzScheduler{
	
	@Autowired
	private Scheduler scheduler;
	
	@Test
	public void testScheduler() throws Throwable{
		System.out.println("begin...");
		scheduler.start();
		Thread.currentThread().sleep(10000);
		System.out.println("end.");
	}
}
