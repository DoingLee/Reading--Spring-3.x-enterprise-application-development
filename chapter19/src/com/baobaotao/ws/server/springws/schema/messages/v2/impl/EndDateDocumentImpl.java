/*
 * An XML document type.
 * Localname: endDate
 * Namespace: http://www.baobaotao.com/ws/server/springws/schema/messages/v2
 * Java type: com.baobaotao.ws.server.springws.schema.messages.v2.EndDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.baobaotao.ws.server.springws.schema.messages.v2.impl;
/**
 * A document containing one endDate(@http://www.baobaotao.com/ws/server/springws/schema/messages/v2) element.
 *
 * This is a complex type.
 */
public class EndDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.baobaotao.ws.server.springws.schema.messages.v2.EndDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDDATE$0 = 
        new javax.xml.namespace.QName("http://www.baobaotao.com/ws/server/springws/schema/messages/v2", "endDate");
    
    
    /**
     * Gets the "endDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$0);
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
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ENDDATE$0);
            }
            target.set(endDate);
        }
    }
}
