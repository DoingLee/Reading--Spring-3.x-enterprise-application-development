package sample.unitils.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

import com.baobaotao.service.UserService;

import static org.junit.Assert.*;

public class UserServiceTest extends UnitilsJUnit4 {
	@SpringApplicationContext({"baobaotao-service.xml", "baobaotao-dao.xml"})
	private ApplicationContext applicationContext;
	
	@SpringBean("userService")
	private UserService userService;
	
	@Test
	public void testLoadSpringBean(){
		assertNotNull(applicationContext);
		assertNotNull(userService.findUserByUserName("tom"));
	}
}
