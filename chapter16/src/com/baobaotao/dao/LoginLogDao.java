package com.baobaotao.dao;

import org.springframework.stereotype.Repository;

import com.baobaotao.domain.LoginLog;
@Repository
public interface LoginLogDao {
   void insertLoginLog(LoginLog loginLog);
}