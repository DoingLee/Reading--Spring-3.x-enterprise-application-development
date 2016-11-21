package com.baobaotao.web;

import org.junit.*;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import com.baobaotao.domain.User;

@SpringApplicationContext( { "classpath:applicationContext.xml",
		"file:webapp/WEB-INF/baobaotao-servlet.xml" })
public class LoginControllerTest extends UnitilsJUnit4 {
	// ① 从Spring容器中加载AnnotationMethodHandlerAdapter
	@SpringBeanByType
	private AnnotationMethodHandlerAdapter handlerAdapter;

	// ② 从Spring容器中加载LoginController
	@SpringBeanByType
	private LoginController controller;

	@SpringBeanByType
	private RestTemplate restTemplate;

	// ③ 声明Request与Response模拟对象
	private MockHttpServletRequest request;
	private MockHttpServletResponse response;

	// ④ 执行测试前先初始模拟对象
	@Before
	public void before() {
		request = new MockHttpServletRequest();
		request.setCharacterEncoding("UTF-8");
		response = new MockHttpServletResponse();
	}

	//@Test
	public void loginCheck() {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("userName", "john");
		map.add("password", "1234");
		String result = restTemplate.postForObject(
				"http://localhost/chapter16/loginCheck.html", map, String.class);
		assertNotNull(result);
		assertThat(result, containsString("用户名或密码错误"));

		map.clear();
		map.add("userName", "tom");
		map.add("password", "1234");
	    result = restTemplate.postForObject(
				"http://localhost/chapter16/loginCheck.html", map, String.class);
		System.out.println(result);
	    assertNotNull(result);
		assertThat(result, containsString("tom,欢迎您进入宝宝淘论坛"));
	}

	// ⑤ 测试LoginController#loginCheck()方法
	@Test
	public void loginCheckByMock() throws Exception {
		request.setRequestURI("/loginCheck.html");
		request.addParameter("userName", "tom"); // ⑥ 设置请求URL及参数
		request.addParameter("password", "1234");

		// ⑦ 向控制发起请求 ” /loginCheck.html”
		ModelAndView mav = handlerAdapter.handle(request, response, controller);
		User user = (User) request.getSession().getAttribute("user");

	
		assertNotNull(mav);
		assertEquals(mav.getViewName(), "main");
		assertNotNull(user);
		assertThat(user.getUserName(), equalTo("tom"));// ⑧ 验证返回结果
		

		assertThat(user.getCredits(), greaterThan(5));
	}
	
	public void test(){
		User u = new User();
		String username = (String)ReflectionTestUtils.getField(u, "userName");
	}

}
