package com.baobaotao.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class UserService {
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
	public void addCredits(){}
}
