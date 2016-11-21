package com.zq.foo.dao;

import java.util.List;

import org.mybatis.spring.annotation.Mapper;

import com.zq.foo.entity.Address;
import com.zq.foo.entity.Pagination;

@Mapper("addressDao")
public interface AddressDao {
	public Integer insertAddress(Address addr);
	public void updateAddress(Address addr);
	public void deleteAddress(Long aid);
	public List<Address> allAddress(Pagination page);
	public Address getAddress(Long aid);
}
