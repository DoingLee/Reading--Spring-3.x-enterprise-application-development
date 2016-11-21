package com.baobaotao.timer;

import java.util.Timer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-timer.xml")
public class TestTimerScheduler {
	
	@Autowired
    private Timer timer;

	@Test
	public void testScheduler() throws Throwable{
		System.out.println("begin...");
		Thread.currentThread().sleep(10000);
		System.out.println("end.");
	}
}
