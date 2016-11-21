/*
 * An XML document type.
 * Localname: topicType
 * Namespace: http://www.baobaotao.com/ws/server/springws/schema/messages/v2
 * Java type: com.baobaotao.ws.server.springws.schema.messages.v2.TopicTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.baobaotao.ws.server.springws.schema.messages.v2.impl;
/**
 * A document containing one topicType(@http://www.baobaotao.com/ws/server/springws/schema/messages/v2) element.
 *
 * This is a complex type.
 */
public class TopicTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v2.TopicTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICTYPE$0 = 
        new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v2", "topicType");
    
    
    /**
     * Gets the "topicType" element
     */
    public java.lang.String getTopicType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topicType" element
     */
    public com.baobaotao.ws.server.springws.schema.messages.v2.TopicDataType xgetTopicType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v2.TopicDataType target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v2.TopicDataType)get_store().find_element_user(TOPICTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "topicType" element
     */
    public void setTopicType(java.lang.String topicType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPICTYPE$0);
            }
            target.setStringValue(topicType);
        }
    }
    
    /**
     * Sets (as xml) the "topicType" element
     */
    public void xsetTopicType(com.baobaotao.ws.server.springws.schema.messages.v2.TopicDataType topicType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v2.TopicDataType target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v2.TopicDataType)get_store().find_element_user(TOPICTYPE$0, 0);
            if (target == null)
            {
                target = (com.baobaotao.ws.server.springws.schema.messages.v2.TopicDataType)get_store().add_element_user(TOPICTYPE$0);
            }
            target.set(topicType);
        }
    }
}
