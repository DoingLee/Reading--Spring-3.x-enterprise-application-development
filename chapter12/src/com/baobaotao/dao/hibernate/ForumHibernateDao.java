package com.baobaotao.dao.hibernate;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.Forum;

@Repository
public class ForumHibernateDao extends BaseDao {

	public void addForum(Forum forum) {
		getHibernateTemplate().save(forum);
	}

	public void updateForum(Forum forum) {
		getHibernateTemplate().update(forum);
	}

	public Forum getForum(int forumId) {
		return getHibernateTemplate().get(Forum.class, forumId);
	}

	public long getForumNum() {
		Object obj = getHibernateTemplate().iterate(
				"select count(f.forumId) from Forum f").next();
		return (Long) obj;
	}

	public long getForumNum2() {
		Long forumNum = getHibernateTemplate().execute(
				new HibernateCallback<Long>() {
					public Long doInHibernate(Session session)
							throws HibernateException, SQLException {
						Object obj = session.createQuery("select count(f.forumId) from Forum f")
								.list()
								.iterator()
								.next();
						return (Long) obj;
					}
				});
		return forumNum;
	}

	public List<Forum> findForumByName(String forumName) {
		return (List<Forum>) getHibernateTemplate().find(
				"from Forum f where f.forumName like ?", forumName + "%");
	}
}
