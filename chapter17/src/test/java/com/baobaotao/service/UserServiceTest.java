package com.baobaotao.service;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.test.util.ReflectionTestUtils;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.User;
import com.baobaotao.exception.UserExistException;

/**
 * 测试用户管理器服务类的方法
 * 
 */
public class UserServiceTest extends BaseServiceTest {
	private UserDao userDao;
	private UserService userService;

	@Before
	public void init() {
		userDao = mock(UserDao.class);
	    userService = new UserService();
		ReflectionTestUtils.setField(userService, "userDao", userDao);
	}
	
	@Test
	public void register() throws UserExistException{
		User user = new User();
		user.setUserName("tom");
		user.setPassword("1234");
		
		doAnswer(new Answer<User>() {
			public User answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
				User user = (User) args[0];
				if (user != null) {
					user.setUserId(1);
				}
				return user;
			}
		}).when(userDao).save(user);
			
		userService.register(user);
		assertThat(user.getUserId(), equalTo(1));
		verify(userDao, times(1)).save(user);
	}
	

	/**
	 * 测试根据用户名模糊查询用户列表的方式
	 */
	@Test
	public void getUserByUserName() {
		User user = new User();
		user.setUserName("tom");
		user.setPassword("1234");
		user.setCredit(100);
		doReturn(user).when(userDao).getUserByUserName("tom");
		
		
		User u = userService.getUserByUserName("tom");
		assertNotNull(u);
		assertThat(u.getUserName(), equalTo(user.getUserName()));
		verify(userDao, times(1)).getUserByUserName("tom");
	}

	/**
	 * 测试锁定用户的服务方法
	 */
	@Test
	public void lockUser() {
		User user = new User();
		user.setUserName("tom");
		user.setPassword("1234");
		doReturn(user).when(userDao).getUserByUserName("tom");
		doNothing().when(userDao).update(user);

	    userService.lockUser("tom");
		User u = userService.getUserByUserName("tom");

		assertEquals(User.USER_LOCK, u.getLocked());
	}
    
	@Test
	public void unlockUser() {

		User user = new User();
		user.setUserName("tom");
		user.setPassword("1234");
		user.setLocked(User.USER_LOCK);
		doReturn(user).when(userDao).getUserByUserName("tom");
		doNothing().when(userDao).update(user);

		userService.unlockUser("tom");
		User u = userService.getUserByUserName("tom");
		assertEquals(User.USER_UNLOCK, u.getLocked());
	}

}
