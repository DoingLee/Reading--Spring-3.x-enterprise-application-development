package com.baobaotao.scope;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/com/baobaotao/scope/beans.xml"})
public class TestScope {

	@Autowired
	@Qualifier("boss1")
	private Boss boss1;

	@Autowired
	@Qualifier("boss2")
	private Boss boss2;

	@Autowired
	@Qualifier("boss3")
	private Boss boss3;

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testInject() {
		Assert.assertNotSame(boss1.getCar(), boss2.getCar());
		Assert.assertNotSame(boss2.getCar(), boss3.getCar());
	}

	@Test
	public void testGetBean() {
//		Assert.assertNotSame(boss1.getCar(),applicationContext.getBean("car", Car.class));
		Assert.assertNotSame(applicationContext.getBean("car", Car.class),
				applicationContext.getBean("car", Car.class));
	}

}
