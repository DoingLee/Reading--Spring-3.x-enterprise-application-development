package com.baobaotao.dao.hibraw;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.Post;

@Repository
public class PostHibernateDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addPost(Post post) {
		sessionFactory.getCurrentSession().save(post);
	}
	public Post getPost(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

}
