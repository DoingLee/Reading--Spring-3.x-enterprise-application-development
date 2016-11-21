package com.baobaotao.ws.server.springws;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import com.baobaotao.ws.client.springws.BbtForumServiceEncClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:com/baobaotao/ws/server/springws/applicationContext.xml",
		"classpath:com/baobaotao/ws/server/springws/springws-server-context.xml",
		"classpath:com/baobaotao/ws/client/springws/springws-client-context.xml",
		// "classpath:com/baobaotao/ws/server/springws/dummy-message-sender.xml"
		// })
		"classpath:com/baobaotao/ws/client/springws/message-sender.xml" })
public class BbtForumServiceIntegrationTest {

	@Autowired
	private BbtForumServiceEncClient bbtForumServiceEncClient;

	@Test
	public void getRefinedTopicCount() throws Exception {
		Calendar startDate = Calendar.getInstance();
		startDate.clear();
		startDate.set(2010, Calendar.MAY, 1);
		Calendar endDate = Calendar.getInstance();
		endDate.clear();
		endDate.set(2011, Calendar.MAY, 31);
		String topicType = "T8";
		assertEquals(888, bbtForumServiceEncClient.getRefinedTopicCount(topicType,startDate,endDate));
	}
}