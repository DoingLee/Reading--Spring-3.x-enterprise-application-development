package sample.unitils.spring;

import org.junit.Test;
import org.unitils.spring.annotation.SpringBean;
import org.unitils.spring.annotation.SpringBeanByName;
import org.unitils.spring.annotation.SpringBeanByType;
import com.baobaotao.service.UserService;
import static org.junit.Assert.*;

public class SimpleUserServiceTest extends BaseServiceTest {
	
	//Spring容器中加载Id为"userService"的Bean
	@SpringBean("userService")
	private UserService userService1;
	//从Spring容器中加载与UserService相同类型的Bean
	@SpringBeanByType
	private UserService userService2;
	//从Spring容器中加载与userService相同名称的Bean
	@SpringBeanByName
	private  UserService userService;
	
	@Test
	public void testApplicationContext(){
		assertNotNull(applicationContext);
	}
	
	@Test
	public void testUserService(){
		assertNotNull(userService);
		assertNotNull(userService1);
		assertNotNull(userService2);
		assertEquals("john123",userService.findUserByUserName("john123").getUserName());
		assertEquals("john123",userService1.findUserByUserName("john123").getUserName());
		assertEquals("john123",userService2.findUserByUserName("john123").getUserName());
	}
}
