package com.baobaotao.dao;

import org.springframework.stereotype.Repository;

import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.Post;

/**
 * Post的DAO类
 *
 */
@Repository
public class LoginLogDao extends BaseDao<LoginLog> {
	public void save(LoginLog loginLog) {
		this.getHibernateTemplate().save(loginLog);
	}

}
