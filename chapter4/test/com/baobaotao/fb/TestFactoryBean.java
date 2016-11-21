package com.baobaotao.fb;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/com/baobaotao/fb/beans.xml"})
public class TestFactoryBean{
	
	@Autowired
	public ApplicationContext factory = null;

	@Test
    public void testCarFactoryBean(){
       Car car_1 = factory.getBean("car1",Car.class);
       Car car_2 = factory.getBean("car1",Car.class);
       Assert.assertNotNull(car_1);
       Assert.assertNotSame(car_1,car_2);
       System.out.println(car_1);
    }
    
	@Test
    public void testCollFactoryBean(){
        List list = factory.getBean("favoriteList",List.class);
        Set set = factory.getBean("favoriteSet",Set.class);
        Map map = factory.getBean("emails",Map.class);
        Properties props = (Properties)factory.getBean("emailProps");
        Assert.assertEquals(set.size(),3);
        Assert.assertEquals(list.size(),3);
        Assert.assertEquals(map.size(),2);
        Assert.assertEquals(props.size(),2);
    }
    
	@Test
    public void testFieldFactoryBean(){
    	Car car2 = (Car)factory.getBean("car2");
    	 Assert.assertNotNull(car2);
    	System.out.println(car2);
    }
    
	@Test
    public void testPropPathFactoryBean(){
    	Car car5 = (Car)factory.getBean("car5");
    	Car car6 = (Car)factory.getBean("car6");
    	 Assert.assertNotNull(car5);
    	 Assert.assertNotNull(car6);
    	System.out.println(car5);
    	System.out.println(car6);
    }    
}
