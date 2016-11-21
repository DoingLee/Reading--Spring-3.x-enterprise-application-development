package com.baobaotao.dao.hibraw;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.Topic;

@Repository
public class TopicHibernateDao{
	@Autowired
	private SessionFactory sessionFactory;
	public void addTopic(Topic topic) {
		sessionFactory.getCurrentSession().save(topic);
	}
}
