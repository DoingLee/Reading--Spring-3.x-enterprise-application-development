
package com.baobaotao.ws.client.springws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class ForumEncClientMain {
     public static void main(String[] args)throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "com/baobaotao/ws/client/springws/springws-client-context.xml");

        BbtForumServiceEncClient getRefinedTopicCountV2 = applicationContext
                .getBean("bbtForumServiceEncClient", BbtForumServiceEncClient.class);
          Calendar startDate = Calendar.getInstance();
        startDate.clear();
        startDate.set(2010, Calendar.MAY, 1);
        Calendar endDate = Calendar.getInstance();
        endDate.clear();
        endDate.set(2011, Calendar.MAY, 31);
        System.out.println(".............."+ getRefinedTopicCountV2.getRefinedTopicCount("TT8888",startDate,endDate));
    }
}
