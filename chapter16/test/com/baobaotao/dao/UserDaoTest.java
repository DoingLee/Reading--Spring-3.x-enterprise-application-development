package com.baobaotao.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

import sample.unitils.dataset.util.XlsDataSetBeanFactory;

import com.baobaotao.domain.User;

@SpringApplicationContext( {"baobaotao-dao.xml" })
public class UserDaoTest extends UnitilsJUnit4 {

	@SpringBean("jdbcUserDao")
	private UserDao userDao;


	@Test
	@DataSet("BaobaoTao.Users.xls")//准备数据 
	public void findUserByUserName() {
		User user = userDao.findUserByUserName("tony");
		assertNull("不存在用户名为tony的用户!", user);
		user = userDao.findUserByUserName("jan");
		assertNotNull("Jan用户存在！", user);
		assertEquals("jan", user.getUserName());
		assertEquals("123456",user.getPassword());
		assertEquals(10,user.getCredits());
	}

	// 验证数据库保存的正确性
	@Test
	@ExpectedDataSet("BaobaoTao.ExpectedSaveUser.xls")// 准备验证数据
	public void saveUser()throws Exception  {
		/**
		硬编码创建测试实体
		User u = new User();
		u.setUserId(1);
		u.setUserName("tom");
		u.setPassword("123456");
		u.setLastVisit(getDate("2011-06-06 08:00:00","yyyy-MM-dd HH:mm:ss"));
		u.setCredits(30);
		u.setLastIp("127.0.0.1");
		**/
		//通过XlsDataSetBeanFactory数据集绑定工厂创建测试实体
		User u  = XlsDataSetBeanFactory.createBean("BaobaoTao.SaveUser.xls", "t_user", User.class);
		userDao.save(u);  //执行用户信息更新操作
	}
	
	//验证数据库保存的正确性
	@Test
	@ExpectedDataSet("BaobaoTao.ExpectedSaveUsers.xls")// 准备验证数据
	public void saveUsers()throws Exception  {
		List<User> users  = XlsDataSetBeanFactory.createBeans("BaobaoTao.SaveUsers.xls", "t_user", User.class);
		for(User u:users){
		     userDao.save(u);
		}
	}

}
