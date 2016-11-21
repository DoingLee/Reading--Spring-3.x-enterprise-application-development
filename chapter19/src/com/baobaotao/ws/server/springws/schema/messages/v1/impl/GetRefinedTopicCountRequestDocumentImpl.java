/*
 * An XML document type.
 * Localname: getRefinedTopicCountRequest
 * Namespace: http://www.baobaotao.com/ws/server/springws/schema/messages/v1
 * Java type: com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.baobaotao.ws.server.springws.schema.messages.v1.impl;
/**
 * A document containing one getRefinedTopicCountRequest(@http://www.baobaotao.com/ws/server/springws/schema/messages/v1) element.
 *
 * This is a complex type.
 */
public class GetRefinedTopicCountRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRefinedTopicCountRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREFINEDTOPICCOUNTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v1", "getRefinedTopicCountRequest");
    
    
    /**
     * Gets the "getRefinedTopicCountRequest" element
     */
    public com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest getGetRefinedTopicCountRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest)get_store().find_element_user(GETREFINEDTOPICCOUNTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRefinedTopicCountRequest" element
     */
    public void setGetRefinedTopicCountRequest(com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest getRefinedTopicCountRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest)get_store().find_element_user(GETREFINEDTOPICCOUNTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest)get_store().add_element_user(GETREFINEDTOPICCOUNTREQUEST$0);
            }
            target.set(getRefinedTopicCountRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getRefinedTopicCountRequest" element
     */
    public com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest addNewGetRefinedTopicCountRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest)get_store().add_element_user(GETREFINEDTOPICCOUNTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML getRefinedTopicCountRequest(@http://www.baobaotao.com/ws/server/springws/schema/messages/v1).
     *
     * This is a complex type.
     */
    public static class GetRefinedTopicCountRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetRefinedTopicCountRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTDATE$0 = 
            new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v1", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$2 = 
            new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v1", "endDate");
        
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$0);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlDate startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$0);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$2);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlDate endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$2);
                }
                target.set(endDate);
            }
        }
    }
}
