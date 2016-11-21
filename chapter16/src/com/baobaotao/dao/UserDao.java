package com.baobaotao.dao;

import org.springframework.stereotype.Repository;

import com.baobaotao.domain.User;
@Repository
public interface UserDao {
   int getMatchCount(String userName,String password);
   User findUserByUserName(String userName);
   void updateLoginInfo(User user);
   void save(User user);
}
