package com.baobaotao.ws.server.springws;

import com.baobaotao.ws.client.springws.BbtForumServiceGatewayClient;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/baobaotao/ws/server/springws/applicationContext.xml",
        "classpath:com/baobaotao/ws/server/springws/springws-server-context.xml",
        "classpath:com/baobaotao/ws/client/springws/springws-client-context.xml",
        "classpath:com/baobaotao/ws/client/springws/memory-message-sender.xml" })
public class BbtForumServiceTest {
	@Autowired
	private BbtForumServiceGatewayClient bbtForumServiceClient;
	@Test
	public void getRefinedTopicCount() throws Exception {
        Calendar startDate = Calendar.getInstance();
        startDate.clear();
        startDate.set(2010, Calendar.MAY, 1);
        Calendar endDate = Calendar.getInstance();
        endDate.clear();
        endDate.set(2011, Calendar.MAY, 31);
		assertEquals(88, bbtForumServiceClient.getRefinedTopicCount(startDate,endDate));
	}
}