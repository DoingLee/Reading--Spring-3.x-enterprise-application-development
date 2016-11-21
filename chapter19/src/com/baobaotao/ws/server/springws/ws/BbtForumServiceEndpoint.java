
package com.baobaotao.ws.server.springws.ws;

import com.baobaotao.ws.server.springws.schema.v2.GetRefinedTopicCountResponse;
import com.baobaotao.ws.server.springws.service.BbtForumService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static com.baobaotao.ws.server.springws.ws.BbtForumConstants.*;
//服务瑞点，处理客户瑞服务请求
@Endpoint
public class BbtForumServiceEndpoint {

    private static final Log logger = LogFactory.getLog(BbtForumServiceEndpoint.class);
    private final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    @Autowired
    private final BbtForumService bbtForumService=null;

    //获取指定时间内精化帖子数
    @PayloadRoot(localPart = "getRefinedTopicCountRequest", namespace = MES_NS_V1)
    @Namespace(prefix = "m", uri = MES_NS_V1)
    @ResponsePayload
    public Element getRefinedTopicCount(@XPathParam("//m:startDate") String startDate,
                                         @XPathParam("//m:endDate") String endDate)
            throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("调用查询精华帖子数服务！");
        }
        LocalDate localStartDate = new LocalDate(startDate);
        LocalDate localEndDate = new LocalDate(endDate);
        //调用内部服务，获取精化帖子数
        int topicCount = bbtForumService.getRefinedTopicCount(localStartDate, localEndDate);
        //创建返回响应消息
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();
        Element response = document.createElementNS(MES_NS_V1, "getRefinedTopicCountResponse");
        response.setTextContent(Integer.toString(topicCount));
        return response;
    }
    
    //获取指定时间内某一类型主题的精化帖子数
    @PayloadRoot(localPart = "getRefinedTopicCountRequest", namespace = MES_NS_V2)
    @Namespace(prefix = "m", uri = MES_NS_V2)
    @ResponsePayload
    public GetRefinedTopicCountResponse getRefinedTopicCount(@XPathParam("//m:topicType") String topicType,
                                         @XPathParam("//m:startDate") String startDate,
                                         @XPathParam("//m:endDate") String endDate)throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("调用查询精华帖子数服务！");
        }
        LocalDate localStartDate = new LocalDate(startDate.substring(0,10));
        LocalDate localEndDate = new LocalDate(endDate.substring(0,10));
        //调用内部服务，获取精化帖子数
        int topicCount = bbtForumService.getRefinedTopicCount(topicType, localStartDate, localEndDate);
        //创建返回响应消息
        GetRefinedTopicCountResponse response = new GetRefinedTopicCountResponse();
        response.setResult(topicCount);
        return response;
    }

}
