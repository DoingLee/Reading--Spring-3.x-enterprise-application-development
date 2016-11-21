package com.zq.foo.service.impl;

import java.util.List;
import java.util.Map;

import com.zq.foo.dao.AddressDao;
import com.zq.foo.dao.UserDao;
import com.zq.foo.entity.Address;
import com.zq.foo.entity.User;
import com.zq.foo.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	private AddressDao addressDao;
	
	public void deleteUser(Long uid) {
		userDao.deleteUser(uid);
	}

	/**
	 * 查询出全部的User。
	 * @param page 分页页码。
	 * @param pageCount 页数。
	 */
	public List<User> getAllUser(Integer page, Integer pageCount) {
		List<User> users = userDao.getAllUser(null);
		return users;
	}

	public User getOneUser(Long uid) {
		User user = userDao.getUser(uid);
		return user;
	}

	/**
	 * 通配查找需要的数据。
	 */
	public List<User> getUserNeeded(Map<String, Object> likeCondition) {
		List<User> users = userDao.getAllUser(likeCondition);
		return users;
	}

	/**
	 * 级联插入Address
	 */
	public User insertUser(User user) {
		userDao.insertUser(user);
		List<Address> addrs = user.getAddrs();
//		int a = 9 / 0;
		if(addrs != null && addrs.size()>0){
			for(Address addr : addrs){
				addr.setUser(user);
				addressDao.insertAddress(addr);
			}
		}
		return user;
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

}
