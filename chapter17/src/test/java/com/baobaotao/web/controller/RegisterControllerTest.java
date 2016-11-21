package com.baobaotao.web.controller;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import org.unitils.spring.annotation.SpringBeanByType;
import com.baobaotao.web.RegisterController;

public class RegisterControllerTest extends BaseWebTest {
	@SpringBeanByType
	private RegisterController controller;

	@Test
	public void register() throws Exception {
		request.setRequestURI("/register.html");
		request.setMethod("POST");
		request.addParameter("userName", "test"); 
		request.addParameter("password", "1234"); 

		// 向控制发起请求 
		ModelAndView mav = handlerAdapter.handle(request, response, controller);
		assertNotNull(mav);
	}
	

}
