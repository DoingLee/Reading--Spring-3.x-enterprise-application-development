package com.baobaotao.ws.client.springws;

import com.baobaotao.ws.server.springws.schema.v2.GetRefinedTopicCountRequest;
import com.baobaotao.ws.server.springws.schema.v2.GetRefinedTopicCountResponse;
import org.springframework.ws.client.core.WebServiceOperations;
import javax.xml.datatype.DatatypeFactory;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BbtForumServiceEncClient {
    private WebServiceOperations webServiceTemplate;

	public int getRefinedTopicCount(String topicType, Calendar startDate, Calendar endDate)throws Exception
	{
		GetRefinedTopicCountRequest request = new GetRefinedTopicCountRequest();
		request.setTopicType(topicType);
        javax.xml.datatype.XMLGregorianCalendar xgc1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        javax.xml.datatype.XMLGregorianCalendar xgc2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
		request.setStartDate(xgc1);
		request.setEndDate(xgc2);
		GetRefinedTopicCountResponse response =	(GetRefinedTopicCountResponse) webServiceTemplate.marshalSendAndReceive(request);
		return response.getResult();
	}

	public WebServiceOperations getWebServiceTemplate() {
		return webServiceTemplate;
	}

	public void setWebServiceTemplate(WebServiceOperations webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}


}
