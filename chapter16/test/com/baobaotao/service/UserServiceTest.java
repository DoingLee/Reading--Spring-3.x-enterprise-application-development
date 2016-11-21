package com.baobaotao.service;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.springframework.test.util.ReflectionTestUtils;
import org.unitils.UnitilsJUnit4;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;
import org.junit.Before;
import org.junit.Test;
import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.User;
import static org.mockito.Mockito.*;

@SpringApplicationContext( {"baobaotao-service.xml", "baobaotao-dao.xml" })
public class UserServiceTest extends UnitilsJUnit4 {
	@SpringBean("userService")
	private UserService userService;
	
	private UserDao userDao;
	
	private LoginLogDao loginLogDao;
	
	@Before
	public void init(){
		userDao = mock(UserDao.class);
		loginLogDao = mock(LoginLogDao.class);

	}
	
	//@Test
	public void hasMatchUser() {
		 User user = new User();
		 user.setUserName("tom");
		 user.setPassword("1234");
		 user.setCredits(100);
		 doReturn(1).when(userDao).getMatchCount("tom", "1234"); 
		 UserServiceImpl userService = new UserServiceImpl();
		 ReflectionTestUtils.setField(userService, "userDao", userDao);
		
		 boolean isMatch = userService.hasMatchUser("tom", "1234"); 
		 assertThat(isMatch,is(true));
	     verify(userDao,times(1)).getMatchCount("tom", "1234");
	}
	
	//@Test
	public void findUserByUserName() {
		 User user = new User();
		 user.setUserName("tom");
		 user.setPassword("1234");
		 user.setCredits(100);
		 doReturn(user).when(userDao).findUserByUserName("tom"); 
		 UserServiceImpl userService = new UserServiceImpl();
		 ReflectionTestUtils.setField(userService, "userDao", userDao);   

		
		 User u = userService.findUserByUserName("tom");
		 assertNotNull(u);
		 assertThat(u.getUserName(),equalTo(user.getUserName()));
	     verify(userDao,times(1)).findUserByUserName("tom");
	}
	
	
	@Test
	@DataSet("BaobaoTao.SaveUsers.xls")// 准备验证数据
	public void loginSuccess() {
		User user = userService.findUserByUserName("tom");
		Date now = new Date();
		user.setLastVisit(now);
		userService.loginSuccess(user);
	    User u = userService.findUserByUserName("tom");
	    assertThat(u.getCredits(),is(105));
	}	
	
}
