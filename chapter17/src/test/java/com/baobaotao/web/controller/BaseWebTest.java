package com.baobaotao.web.controller;

import org.junit.Before;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

@SpringApplicationContext( { "classpath:/applicationContext.xml",
"file:WebRoot/WEB-INF/baobaotao-servlet.xml" })
public class BaseWebTest extends UnitilsJUnit4  {
	
	@SpringBeanByType
	public AnnotationMethodHandlerAdapter handlerAdapter;


	//声明Request与Response模拟对象
	public MockHttpServletRequest request;
	public MockHttpServletResponse response;
	public MockHttpSession session;


	//执行测试前先初始模拟对象
	@Before
	public void before() {
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
		session = new MockHttpSession();
		request.setCharacterEncoding("UTF-8");
	}

}
