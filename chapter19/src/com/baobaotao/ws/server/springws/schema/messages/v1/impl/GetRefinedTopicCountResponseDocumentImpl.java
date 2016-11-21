/*
 * An XML document type.
 * Localname: getRefinedTopicCountResponse
 * Namespace: http://www.baobaotao.com/ws/server/springws/schema/messages/v1
 * Java type: com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.baobaotao.ws.server.springws.schema.messages.v1.impl;
/**
 * A document containing one getRefinedTopicCountResponse(@http://www.baobaotao.com/ws/server/springws/schema/messages/v1) element.
 *
 * This is a complex type.
 */
public class GetRefinedTopicCountResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRefinedTopicCountResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREFINEDTOPICCOUNTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v1", "getRefinedTopicCountResponse");
    
    
    /**
     * Gets the "getRefinedTopicCountResponse" element
     */
    public int getGetRefinedTopicCountResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETREFINEDTOPICCOUNTRESPONSE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "getRefinedTopicCountResponse" element
     */
    public org.apache.xmlbeans.XmlInt xgetGetRefinedTopicCountResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GETREFINEDTOPICCOUNTRESPONSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "getRefinedTopicCountResponse" element
     */
    public void setGetRefinedTopicCountResponse(int getRefinedTopicCountResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETREFINEDTOPICCOUNTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETREFINEDTOPICCOUNTRESPONSE$0);
            }
            target.setIntValue(getRefinedTopicCountResponse);
        }
    }
    
    /**
     * Sets (as xml) the "getRefinedTopicCountResponse" element
     */
    public void xsetGetRefinedTopicCountResponse(org.apache.xmlbeans.XmlInt getRefinedTopicCountResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GETREFINEDTOPICCOUNTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(GETREFINEDTOPICCOUNTRESPONSE$0);
            }
            target.set(getRefinedTopicCountResponse);
        }
    }
}
