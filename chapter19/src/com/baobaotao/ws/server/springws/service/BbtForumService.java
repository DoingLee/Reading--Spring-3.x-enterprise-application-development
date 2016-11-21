package com.baobaotao.ws.server.springws.service;

import org.joda.time.LocalDate;

import javax.jws.WebService;
//论坛内部服务接口
public interface BbtForumService {
    int getRefinedTopicCount(String forumType, LocalDate startDate,LocalDate endDate);
    int getRefinedTopicCount(LocalDate startDate,LocalDate endDate);
}
