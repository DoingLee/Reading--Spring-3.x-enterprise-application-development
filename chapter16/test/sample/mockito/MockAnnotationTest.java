package sample.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.baobaotao.domain.User;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockAnnotationTest {
	//基于注释模拟类
    @Mock User mockUser;
    
    @Before 
    public void initMocks() {
    	//初始化当前测试类所有@Mock注释模拟对象
        MockitoAnnotations.initMocks(this);
    }

	//模拟User类测试
	@Test
	public void testMockUser() {
		when(mockUser.getUserId()).thenReturn(1);
		when(mockUser.getUserName()).thenReturn("tom");
		assertEquals(mockUser.getUserId(),1);
		assertEquals(mockUser.getUserName(), "tom");
	}
}
