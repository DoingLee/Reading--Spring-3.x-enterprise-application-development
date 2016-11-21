package com.baobaotao.ws.client.springws;
import com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument;
import com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountResponseDocument;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import java.util.Calendar;

public class BbtForumServiceGatewayClient extends WebServiceGatewaySupport {
    public int getRefinedTopicCount( Calendar startDate, Calendar endDate) {
        GetRefinedTopicCountRequestDocument requestDocument = GetRefinedTopicCountRequestDocument.Factory.newInstance();
        GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest getRefinedTopicCountRequest =
                requestDocument.addNewGetRefinedTopicCountRequest();
        getRefinedTopicCountRequest.setStartDate(startDate);
        getRefinedTopicCountRequest.setEndDate(endDate);
        GetRefinedTopicCountResponseDocument getRefinedTopicCountResponseDocument =
                (GetRefinedTopicCountResponseDocument) getWebServiceTemplate().marshalSendAndReceive(requestDocument);
        int count = getRefinedTopicCountResponseDocument.getGetRefinedTopicCountResponse();
        return count;
    }
}
