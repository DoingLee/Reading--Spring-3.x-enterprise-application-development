package com.baobaotao.dao.hibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.User;

@Repository("hibernateUserDao")
public class HibernateUserDaoImpl  implements UserDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public User findUserByUserName(String userName) {
		String hql = " from User u where u.userName=?";
		List<User> users  =  this.getHibernateTemplate().find(hql, userName);
		if(users!=null && users.size()>0)
			return users.get(0);
		else 
			return null;
	}

	public int getMatchCount(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updateLoginInfo(User user) {
		// TODO Auto-generated method stub
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
