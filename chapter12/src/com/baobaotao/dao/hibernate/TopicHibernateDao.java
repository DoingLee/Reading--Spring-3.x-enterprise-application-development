package com.baobaotao.dao.hibernate;

import org.springframework.stereotype.Repository;

import com.baobaotao.domain.Topic;

@Repository
public class TopicHibernateDao extends BaseDao {
	public void addTopic(Topic topic) {
		getHibernateTemplate().save(topic);
	}
	
	public Topic getTopicById(int topicId){
		return getHibernateTemplate().get(Topic.class, topicId);
	}
}
