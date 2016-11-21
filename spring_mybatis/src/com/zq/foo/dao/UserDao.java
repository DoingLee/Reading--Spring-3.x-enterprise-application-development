package com.zq.foo.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.Mapper;

import com.zq.foo.entity.User;

@Mapper("userDao")
public interface UserDao {
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(Long uid);
	/**
	 * 进行模糊查询
	 * @param likeCondition
	 * @param page
	 * @return
	 */
	public List<User> getAllUser(Map<String,Object> likeCondition);
	public User getUser(Long uid);
}
