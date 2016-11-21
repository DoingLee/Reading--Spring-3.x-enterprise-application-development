package com.baobaotao.ftl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.baobaotao.domain.User;

import freemarker.template.Template;

//@ContextConfiguration(locations = "classpath:com/baobaotao/ftl/applicationContext.xml" )
public class TestFreemarker extends  AbstractJUnit4SpringContextTests{

	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;
	
	@Test
	public void testFillPage() throws Throwable{
		Template tpl = freeMarkerConfigurer.getConfiguration().getTemplate("listUser.ftl");
		Map<String,List<User>> userMap = new HashMap<String,List<User>>();
		List<User> userList = new ArrayList<User>();
		User user1 = new User();
		user1.setUserName("tom");
		user1.setRealName("汤姆");
		User user2 = new User();
		user2.setUserName("john");
		user2.setRealName("约翰");
		userList.add(user1);
		userList.add(user2);
		userMap.put("userList", userList);
		String htmlText = FreeMarkerTemplateUtils.processTemplateIntoString(tpl,userMap); 
		System.out.println(htmlText);

	}

}
