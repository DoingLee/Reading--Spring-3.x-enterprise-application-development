/*
 * An XML document type.
 * Localname: getRefinedTopicCountRequest
 * Namespace: http://www.baobaotao.com/ws/server/springws/schema/messages/v1
 * Java type: com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.baobaotao.ws.server.springws.schema.messages.v1;


/**
 * A document containing one getRefinedTopicCountRequest(@http://www.baobaotao.com/ws/server/springws/schema/messages/v1) element.
 *
 * This is a complex type.
 */
public interface GetRefinedTopicCountRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRefinedTopicCountRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7F0DB3D7B7FFE9A3E7A59EB9D07840F7").resolveHandle("getrefinedtopiccountrequest6565doctype");
    
    /**
     * Gets the "getRefinedTopicCountRequest" element
     */
    com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest getGetRefinedTopicCountRequest();
    
    /**
     * Sets the "getRefinedTopicCountRequest" element
     */
    void setGetRefinedTopicCountRequest(com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest getRefinedTopicCountRequest);
    
    /**
     * Appends and returns a new empty "getRefinedTopicCountRequest" element
     */
    com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest addNewGetRefinedTopicCountRequest();
    
    /**
     * An XML getRefinedTopicCountRequest(@http://www.baobaotao.com/ws/server/springws/schema/messages/v1).
     *
     * This is a complex type.
     */
    public interface GetRefinedTopicCountRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRefinedTopicCountRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7F0DB3D7B7FFE9A3E7A59EB9D07840F7").resolveHandle("getrefinedtopiccountrequest2f4belemtype");
        
        /**
         * Gets the "startDate" element
         */
        java.util.Calendar getStartDate();
        
        /**
         * Gets (as xml) the "startDate" element
         */
        org.apache.xmlbeans.XmlDate xgetStartDate();
        
        /**
         * Sets the "startDate" element
         */
        void setStartDate(java.util.Calendar startDate);
        
        /**
         * Sets (as xml) the "startDate" element
         */
        void xsetStartDate(org.apache.xmlbeans.XmlDate startDate);
        
        /**
         * Gets the "endDate" element
         */
        java.util.Calendar getEndDate();
        
        /**
         * Gets (as xml) the "endDate" element
         */
        org.apache.xmlbeans.XmlDate xgetEndDate();
        
        /**
         * Sets the "endDate" element
         */
        void setEndDate(java.util.Calendar endDate);
        
        /**
         * Sets (as xml) the "endDate" element
         */
        void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest newInstance() {
              return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument.GetRefinedTopicCountRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument newInstance() {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.baobaotao.ws.server.springws.schema.messages.v1.GetRefinedTopicCountRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
