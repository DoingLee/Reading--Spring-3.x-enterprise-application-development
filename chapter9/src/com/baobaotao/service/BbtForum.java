package com.baobaotao.service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baobaotao.domain.Forum;
import com.baobaotao.domain.Topic;

public interface BbtForum {
	void addTopic(Topic topic) throws Exception;
	void updateForum(Forum forum);
	Forum getForum(int forumId);
	int getForumNum();
}
