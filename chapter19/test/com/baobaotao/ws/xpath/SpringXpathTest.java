
package com.baobaotao.ws.xpath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/baobaotao/ws/xpath/xpath-context.xml"})
public class SpringXpathTest {
    @Autowired
	private SpringXPath springXPath;
	@Test
    public void doPath(){
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document doc = null;
		try {
			InputSource source = new InputSource( new StringReader(getStringXML()) );
			doc = factory.newDocumentBuilder().parse(source);
		} catch (Exception e) {
		}
        Node nodeSource = doc.getDocumentElement();
        springXPath.doXPath(nodeSource);
    }
    public String getStringXML() {
        String xml =
                "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                "<SOAP-ENV:Header/>" +
                "<SOAP-ENV:Body>" +
                "    <v1:getRefinedTopicCountRequest xmlns:v1=\"http://www.baobaotao.com/ws/server/springws/schema/messages/v1\">" +
                "        <v1:startDate>2010-05-01</v1:startDate>" +
                "        <v1:endDate>2011-05-31</v1:endDate>" +
                "    </v1:getRefinedTopicCountRequest>" +
                "</SOAP-ENV:Body>" +
                "</SOAP-ENV:Envelope>";
    	return xml;
    }
}
