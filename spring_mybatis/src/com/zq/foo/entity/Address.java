package com.zq.foo.entity;

public class Address {
	private Long aid;
	private String address;
	private String postCode;
	private User user;
	public Long getAid() {
		return aid;
	}
	public void setAid(Long aid) {
		this.aid = aid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
//		user.getAddrs().add(this);
	}
	public Address(Long aid, String address, String postCode) {
		this.aid = aid;
		this.address = address;
		this.postCode = postCode;
	}
	public Address(String address, String postCode) {
		this.address = address;
		this.postCode = postCode;
	}
	public Address() {
	}
	
}
