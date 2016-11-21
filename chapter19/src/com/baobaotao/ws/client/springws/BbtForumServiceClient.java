package com.baobaotao.ws.client.springws;

import com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument;
import com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountResponseDocument;
import org.springframework.ws.client.core.WebServiceOperations;
import java.util.Calendar;

//基于Spring-WS服务操作模板客户瑞
public class BbtForumServiceClient {
    private WebServiceOperations webServiceTemplate;
    public int getRefinedTopicCount( Calendar startDate, Calendar endDate) {
        GetRefinedTopicCountRequestDocument requestDocument = GetRefinedTopicCountRequestDocument.Factory.newInstance();
        GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest request = requestDocument.addNewGetRefinedTopicCountRequest();
        request.setStartDate(startDate);
        request.setEndDate(endDate);
        GetRefinedTopicCountResponseDocument getRefinedTopicCountResponseDocument =
                (GetRefinedTopicCountResponseDocument) getWebServiceTemplate().marshalSendAndReceive("http://www.baobaotao.com",requestDocument);
        int count = getRefinedTopicCountResponseDocument.getGetRefinedTopicCountResponse();
        System.out.println("精华帖子数： " + count );
        return count;
    }


    public WebServiceOperations getWebServiceTemplate() {
		return webServiceTemplate;
	}

	public void setWebServiceTemplate(WebServiceOperations webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}
}
