package sample.mockito;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baobaotao.domain.User;
import com.baobaotao.service.UserService;
import com.baobaotao.service.UserServiceImpl;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockMethodTest {
	//模拟接口
	UserService mockUserService = mock(UserService.class);
	//模拟实现类
	UserServiceImpl mockServiceImpl = mock(UserServiceImpl.class);
    
	@Test
	//模拟接口UserService测试
	public void testMockInterface() {
		//模拟测试数据
		when(mockUserService.findUserByUserName("tom")).thenReturn(
				new User("tom", "1234"));
		when(mockUserService.hasMatchUser("tom", "1234")).thenReturn(true);
		User user = mockUserService.findUserByUserName("tom");
		boolean isMatch = mockUserService.hasMatchUser("tom","1234");
		assertNotNull(user);
		assertEquals(user.getUserName(), "tom");
		assertEquals(isMatch, true);
		 //验证交互行为
		verify(mockUserService).findUserByUserName("tom");
		verify(mockUserService).hasMatchUser("tom", "1234");
	}

	//模拟实现类UserServiceImpl测试
	@Test
	public void testMockClass() {
		//模拟测试数据
		when(mockServiceImpl.findUserByUserName("tom")).thenReturn(new User("tom", "1234"));
		when(mockServiceImpl.hasMatchUser("tom", "1234")).thenReturn(true);
		User user = mockServiceImpl.findUserByUserName("tom");
		boolean isMatch = mockServiceImpl.hasMatchUser("tom","1234");
		assertNotNull(user);
		assertEquals(user.getUserName(), "tom");
		assertEquals(isMatch, true);
		//验证交互行为
		verify(mockServiceImpl).findUserByUserName("tom");
		verify(mockServiceImpl).hasMatchUser("tom", "1234");
	}


}
