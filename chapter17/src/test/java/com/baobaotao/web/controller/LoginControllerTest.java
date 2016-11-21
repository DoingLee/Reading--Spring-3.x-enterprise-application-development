package com.baobaotao.web.controller;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import org.unitils.spring.annotation.SpringBeanByType;
import com.baobaotao.cons.CommonConstant;
import com.baobaotao.domain.User;
import com.baobaotao.web.LoginController;


public class LoginControllerTest extends BaseWebTest {
	@SpringBeanByType
	private LoginController controller;

	@Test
	public void loginCheckByMock() throws Exception {
		request.setRequestURI("/login/doLogin.html");
		request.addParameter("userName", "tom"); // ⑥ 设置请求URL及参数
		request.addParameter("password", "1234");

		// 向控制发起请求 ” /loginCheck.html”
		ModelAndView mav = handlerAdapter.handle(request, response, controller);
		User user = (User) request.getSession().getAttribute(CommonConstant.USER_CONTEXT);
	
		assertNotNull(mav);
		assertEquals(mav.getViewName(), "/success");
		assertNotNull(user);
		assertThat(user.getUserName(), equalTo("tom"));// ⑧ 验证返回结果
		assertThat(user.getCredit(), greaterThan(5));
	}
	

}
