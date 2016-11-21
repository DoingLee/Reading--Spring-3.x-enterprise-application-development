/*
 * An XML document type.
 * Localname: getRefinedTopicCountRequest
 * Namespace: http://www.baobaotao.com/ws/server/springws/schema/messages/v2
 * Java type: com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.baobaotao.ws.server.springws.schema.messages.v2.impl;
/**
 * A document containing one getRefinedTopicCountRequest(@http://www.baobaotao.com/ws/server/springws/schema/messages/v2) element.
 *
 * This is a complex type.
 */
public class GetRefinedTopicCountRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRefinedTopicCountRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREFINEDTOPICCOUNTREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v2", "getRefinedTopicCountRequest");
    
    
    /**
     * Gets the "getRefinedTopicCountRequest" element
     */
    public com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest getGetRefinedTopicCountRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest)get_store().find_element_user(GETREFINEDTOPICCOUNTREQUEST$0, 0);
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
    public void setGetRefinedTopicCountRequest(com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest getRefinedTopicCountRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest)get_store().find_element_user(GETREFINEDTOPICCOUNTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest)get_store().add_element_user(GETREFINEDTOPICCOUNTREQUEST$0);
            }
            target.set(getRefinedTopicCountRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getRefinedTopicCountRequest" element
     */
    public com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest addNewGetRefinedTopicCountRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest target = null;
            target = (com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest)get_store().add_element_user(GETREFINEDTOPICCOUNTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML getRefinedTopicCountRequest(@http://www.baobaotao.com/ws/server/springws/schema/messages/v2).
     *
     * This is a complex type.
     */
    public static class GetRefinedTopicCountRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v2.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetRefinedTopicCountRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TOPICTYPE$0 = 
            new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v2", "topicType");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v2", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v2", "endDate");
        
        
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
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$2);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(STARTDATE$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
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
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$4);
                }
                target.set(endDate);
            }
        }
    }
}
