package com.baobaotao.web;


import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;

//①标注成为一个Spring MVC的Controller
@Controller
public class LoginController{
	
	@Autowired
	private UserService userService;
    
     //②负责处理/index.html的请求
	@RequestMapping(value = "/index.html")
	public String loginPage(){
		return "login";
	}
	
     //③负责处理/loginCheck.html的请求
	@RequestMapping(value = "/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request){
		User user = new User();
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));

		boolean isValidUser = 
			   userService.hasMatchUser(user.getUserName(),
					   user.getPassword());
		if (!isValidUser) {
			return new ModelAndView("login", "error", "用户名或密码错误。");
		} else {
		   user = userService.findUserByUserName(user
					.getUserName());
			user.setLastIp(request.getLocalAddr());
			user.setLastVisit(new Date());
			userService.loginSuccess(user);
			request.getSession().setAttribute("user", user);
			return new ModelAndView("main");
			//ModelAndView mv = new ModelAndView("xStreamMarshallingView");
			//mv.addObject(user);
			//return mv;
		}
	}
}
