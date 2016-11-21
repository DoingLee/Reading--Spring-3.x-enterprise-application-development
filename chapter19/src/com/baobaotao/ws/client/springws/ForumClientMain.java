/**
 * @(#)com.baobaotao.ws.client.springws.ForumClientMain
 *
 * 版权声明 亿力科技 版权所有,违者必究

 * <br> Copyright：Copyright (c)  2011 
 * <br> Company: 亿力科技 
 * <br> Author: 林开雄
 * <br>  Date：11-5-27
 * <br> Version： 3.0
 *————————————————————————————————————
 * 修改记录
 *    修改者：
 *    修改时间：
 *    修改原因：
 *—————————————————————————————————————
 */
package com.baobaotao.ws.client.springws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class ForumClientMain {
     public static void main(String[] args)throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "com/baobaotao/ws/client/springws/springws-client-context.xml","com/baobaotao/ws/client/springws/message-sender.xml");
        BbtForumServiceGatewayClient getRefinedTopicCount = applicationContext
                .getBean("bbtForumServiceGatewayClient", BbtForumServiceGatewayClient.class);
        Calendar startDate = Calendar.getInstance();
        startDate.clear();
        startDate.set(2010, Calendar.MAY, 1);
        Calendar endDate = Calendar.getInstance();
        endDate.clear();
        endDate.set(2011, Calendar.MAY, 31);
        getRefinedTopicCount.getRefinedTopicCount(startDate,endDate);
    }
}
