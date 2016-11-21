package com.baobaotao.ws.server.springws;

import net.javacrumbs.springws.test.helper.DefaultWsTestHelper;
import net.javacrumbs.springws.test.helper.WsTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.context.MessageContext;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/baobaotao/ws/server/springws/applicationContext.xml",
        "classpath:com/baobaotao/ws/server/springws/springws-server-context.xml",
        DefaultWsTestHelper.DEFAULT_CONFIG_PATH})
public class BbtForumServiceEndpointTest {
    @Autowired
	private WsTestHelper wsTestHelper;
    private String xmlPath = "com/baobaotao/ws/server/springws/";

    @Test
	public void testSoapPayload() throws Exception
	{
		MessageContext message = wsTestHelper.receiveMessage(xmlPath+"request_soap_payload.xml");
        assertNotNull(message);
		assertNotNull(message.getResponse().getPayloadSource());
		wsTestHelper.createMessageValidator(message.getResponse()).compare(xmlPath+
                                                   "response_soap.xml");
	}

	@Test
	public void testSoap() throws Exception
	{
		MessageContext message = wsTestHelper.receiveMessage("com/baobaotao/ws/server/springws/request_soap.xml");
        assertNotNull(message);
		assertNotNull(message.getResponse().getPayloadSource());
		wsTestHelper.createMessageValidator(message.getResponse()).compare("com/baobaotao/ws/server/springws/response_soap.xml");
	}
}