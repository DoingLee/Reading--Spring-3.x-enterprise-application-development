package sample.junit;

import com.baobaotao.domain.User;

import junit.framework.TestCase;

public class Junit38SampleTest extends TestCase {
	private User user;

	// 测试前JUnit会调用setUp()建立和初始化测试环境
	protected void setUp() throws Exception {
		super.setUp(); // 注意：在Junit3.8.1中这里要调用父类的setUp()
		user = new User("Junit", "1234");
	}

	// 测试完成后JUnit会调用tearDown()清理资源，如释放打开的文件,关闭数据库连接等等
	protected void tearDown() throws Exception {
		super.tearDown(); // 注意：在Junit3.8.1中这里要调用父类的tearDown()
		if (user == null) {
			System.out.println("清理资源成功。。。");
		}
	}

	// 测试User用户及密码
	public void testUser() {
		assertEquals("Junit", user.getUserName());
		assertEquals("1234", user.getPassword());// 在这里，会出现故障，应该把左边的参数改为10

	}

	// 测试Hello类中的division函数
	public void testUserId() {
		try {
			assertEquals(0, user.getUserId());
			fail("用户ID为空！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
