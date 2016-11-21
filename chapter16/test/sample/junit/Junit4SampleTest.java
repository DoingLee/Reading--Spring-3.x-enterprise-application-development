package sample.junit;
import com.baobaotao.domain.User;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Junit4SampleTest{
	private User user;

	// 测试前JUnit会调用setUp()建立和初始化测试环境
	@Before
	public void setUp() throws Exception {
		user = new User("Junit", "1234");
	}

	// 测试完成后JUnit会调用tearDown()清理资源，如释放打开的文件,关闭数据库连接等等
	@After
	public void tearDown() throws Exception {
		assertNull(null,user);
	}
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		
	}

	// 测试完成后JUnit会调用tearDown()清理资源，如释放打开的文件,关闭数据库连接等等
	@AfterClass
	public static void afterClass() throws Exception {
		
	}

	// 测试User用户及密码
	@Test
	public void testUser() {
		assertEquals("Junit", user.getUserName());
		assertEquals("1234", user.getPassword());// 在这里，会出现故障，应该把左边的参数改为10

	}

	// 测试Hello类中的division函数
	@Test(expected=Exception.class)
	public void testUserId() {
	    assertEquals(0, user.getUserId());
	}
  
}
