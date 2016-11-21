package com.baobaotao.ws.client.saaj;

import javax.xml.soap.*;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//基于SAAJ传输协议的服务客户
public class BbtForumServiceClient {
    public static final String NAMESPACE_URI_V1 = "http://www.baobaotao.com/ws/server/springws/schema/messages/v1";
    public static final String PREFIX = "forum";
    private SOAPConnectionFactory connectionFactory;
    private MessageFactory messageFactory;
    private URL url;

    public BbtForumServiceClient(String url) throws SOAPException, MalformedURLException {
        connectionFactory = SOAPConnectionFactory.newInstance();
        messageFactory = MessageFactory.newInstance();
        this.url = new URL(url);
    }
    private SOAPMessage createSOAPMessageRequest() throws SOAPException {
        SOAPMessage message = messageFactory.createMessage();
        SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
        Name requestName = envelope.createName("getRefinedTopicCountRequest", PREFIX, NAMESPACE_URI_V1);
        SOAPBodyElement requestElement = message.getSOAPBody().addBodyElement(requestName);
        Name startDate = envelope.createName("startDate", PREFIX, NAMESPACE_URI_V1);
        SOAPElement startDateElement = requestElement.addChildElement(startDate);
        startDateElement.setValue("2010-01-31");
        Name endDate = envelope.createName("endDate", PREFIX, NAMESPACE_URI_V1);
        SOAPElement endDateElement = requestElement.addChildElement(endDate);
        endDateElement.setValue("2011-01-31");
        return message;
    }

    public int getRefinedTopicCount() throws SOAPException, IOException, TransformerException {
        SOAPMessage request = createSOAPMessageRequest();
        SOAPConnection connection = connectionFactory.createConnection();
        SOAPMessage response = connection.call(request, url);
        if (!response.getSOAPBody().hasFault()) {
            SOAPBodyElement mileage = (SOAPBodyElement) response.getSOAPBody().getChildElements().next();
            return Integer.valueOf(mileage.getValue());
        } else {
            SOAPFault fault = response.getSOAPBody().getFault();
            throw new SOAPException(fault.getFaultString());
        }
    }
}
