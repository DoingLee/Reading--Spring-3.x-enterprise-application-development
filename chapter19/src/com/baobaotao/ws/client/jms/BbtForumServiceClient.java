package com.baobaotao.ws.client.jms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.xml.transform.StringSource;
import javax.jms.JMSException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;

//基于JMS传输协议的服务客户
public class BbtForumServiceClient extends WebServiceGatewaySupport {

    private static final String PAYLOAD =
            "<fourm:getRefinedTopicCountRequest xmlns:fourm=\"http://www.baobaotao.com/ws/server/springws/schema/messages/v1\">" +
                   "<fourm:type>TT8888</fourm:type>" +  "<fourm:startDate>2011-01-31</fourm:startDate>" + "<fourm:endDate>2011-01-31</fourm:endDate>" +"</fourm:getRefinedTopicCountRequest>";

    public void getRefinedTopicCount() throws SOAPException, IOException, TransformerException, JMSException {
        getWebServiceTemplate().sendSourceAndReceiveToResult(new StringSource(PAYLOAD), new StreamResult(System.out));
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("jms-client-context.xml", BbtForumServiceClient.class);
        BbtForumServiceClient client = (BbtForumServiceClient) applicationContext.getBean("bbtForumServiceClient", BbtForumServiceClient.class);
        client.getRefinedTopicCount();
    }
}