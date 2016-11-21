package com.zq.foo.service.impl;

import com.zq.foo.dao.AddressDao;
import com.zq.foo.entity.Address;
import com.zq.foo.service.AddressService;

public class AddressServiceImpl implements AddressService{
	private AddressDao addressDao;
	
	public void insertAddress(Address addr) {
		Integer aid = addressDao.insertAddress(addr);
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

}
