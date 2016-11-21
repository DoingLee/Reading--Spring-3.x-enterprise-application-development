package com.baobaotao.ws.server.springws.service.impl;


import javax.jws.WebService;
import com.baobaotao.ws.server.springws.service.BbtForumService;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//论坛内部服务实现
@Service("bbtForumService")
public class BbtForum implements BbtForumService {

	public int getRefinedTopicCount(LocalDate startDate,
                             LocalDate endDate) {
        System.out.println("v1: getRefinedTopicCount:startDate="+startDate.toString()+":endDate="+endDate);
        return 88;
	}
    public int getRefinedTopicCount(String forumType,
                             LocalDate startDate,
                             LocalDate endDate) {
        System.out.println("getRefinedTopicCount:"+forumType+":startDate="+startDate.toString()+":endDate="+endDate);
        return 888;
	}
}
