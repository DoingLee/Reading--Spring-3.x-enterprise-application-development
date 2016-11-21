package com.baobaotao.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baobaotao.domain.User;

@Transactional
public interface UserService {
    boolean hasMatchUser(String userName,String password);
    User findUserByUserName(String userName);
    void loginSuccess(User user);
    void registerUser(User user);
}
