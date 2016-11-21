
package com.baobaotao.ws.xpath;

import org.springframework.xml.xpath.NodeMapper;
import org.springframework.xml.xpath.XPathExpression;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.annotation.Resource;

public class SpringXPath {
    private XPathExpression xpathExpression;
    public void doXPath(Node document) {
        xpathExpression.evaluateAsObject(document,
                new NodeMapper() {
                    public Object mapNode(Node node, int nodeNum) throws DOMException {
                        Element element = (Element) node;
                        Element startDate = (Element) element.getChildNodes().item(1);
                        Element endDate = (Element) element.getChildNodes().item(3);
                        System.out.println("开始日期：" + startDate.getTextContent());
                        System.out.println("结束日期：" + endDate.getTextContent());
                        return new Object();
                    }
                });
    }

    public XPathExpression getXpathExpression() {
        return xpathExpression;
    }

    public void setXpathExpression(XPathExpression xpathExpression) {
        this.xpathExpression = xpathExpression;
    }


}
