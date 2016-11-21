package com.baobaotao.ws.client.springws;

import net.javacrumbs.springws.test.simple.WsMockControl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.oxm.xmlbeans.XmlBeansMarshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.WebServiceMessageSender;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class BbtForumServiceClientTest {
	private BbtForumServiceClient bbtForumServiceClient;
	private WebServiceTemplate webServiceTemplate;
	
	@Before
	public void setUp() throws Exception
	{
		bbtForumServiceClient = new BbtForumServiceClient();
		webServiceTemplate = new WebServiceTemplate();
		XmlBeansMarshaller marshaller = new XmlBeansMarshaller();
		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);
		bbtForumServiceClient.setWebServiceTemplate(webServiceTemplate);
	}

	@Test
	public void getRefinedTopicCount()
	{
		WsMockControl mockControl = new WsMockControl();
		WebServiceMessageSender mockMessageSender = mockControl
					.validateSchema("xsd/v1/forum_messages.xsd")
					.expectRequest("com/baobaotao/ws/server/springws/request_soap.xml")
					.returnResponse("com/baobaotao/ws/server/springws/response_soap.xml")
					.createMock();
		webServiceTemplate.setMessageSender(mockMessageSender);
         Calendar startDate = Calendar.getInstance();
        startDate.clear();
        startDate.set(2011, Calendar.MAY, 1);
        Calendar endDate = Calendar.getInstance();
        endDate.clear();
        endDate.set(2011, Calendar.MAY, 31);
		int count = bbtForumServiceClient.getRefinedTopicCount(startDate,endDate);
		assertEquals(88, count);
		mockControl.verify();
	}
	
}
