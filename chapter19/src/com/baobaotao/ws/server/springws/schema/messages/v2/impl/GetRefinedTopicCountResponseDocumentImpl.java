/*
 * An XML document type.
 * Localname: getRefinedTopicCountResponse
 * Namespace: http://www.baobaotao.com/ws/server/springws/schema/messages/v2
 * Java type: com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.baobaotao.ws.server.springws.schema.messages.v2.impl;
/**
 * A document containing one getRefinedTopicCountResponse(@http://www.baobaotao.com/ws/server/springws/schema/messages/v2) element.
 *
 * This is a complex type.
 */
public class GetRefinedTopicCountResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRefinedTopicCountResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREFINEDTOPICCOUNTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v2", "getRefinedTopicCountResponse");
    
    
    /**
     * Gets the "getRefinedTopicCountResponse" element
     */
    public com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse getGetRefinedTopicCountResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse)get_store().find_element_user(GETREFINEDTOPICCOUNTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRefinedTopicCountResponse" element
     */
    public void setGetRefinedTopicCountResponse(com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse getRefinedTopicCountResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse)get_store().find_element_user(GETREFINEDTOPICCOUNTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse)get_store().add_element_user(GETREFINEDTOPICCOUNTRESPONSE$0);
            }
            target.set(getRefinedTopicCountResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getRefinedTopicCountResponse" element
     */
    public com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse addNewGetRefinedTopicCountResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse)get_store().add_element_user(GETREFINEDTOPICCOUNTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getRefinedTopicCountResponse(@http://www.baobaotao.com/ws/server/springws/schema/messages/v2).
     *
     * This is a complex type.
     */
    public static class GetRefinedTopicCountResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountResponseDocument.GetRefinedTopicCountResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetRefinedTopicCountResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULT$0 = 
            new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v2", "result");
        
        
        /**
         * Gets the "result" element
         */
        public int getResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "result" element
         */
        public org.apache.xmlbeans.XmlInt xgetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "result" element
         */
        public void setResult(int result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULT$0);
                }
                target.setIntValue(result);
            }
        }
        
        /**
         * Sets (as xml) the "result" element
         */
        public void xsetResult(org.apache.xmlbeans.XmlInt result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RESULT$0);
                }
                target.set(result);
            }
        }
    }
}
