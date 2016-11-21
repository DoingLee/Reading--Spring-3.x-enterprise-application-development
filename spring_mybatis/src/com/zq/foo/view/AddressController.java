package com.zq.foo.view;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zq.foo.entity.Address;
import com.zq.foo.entity.User;
import com.zq.foo.service.AddressService;
import com.zq.foo.service.UserService;

@Controller
public class AddressController {
	@Resource
	private UserService userService;
	@Resource
	private AddressService addressService;
	
	@RequestMapping(value="addUserStepTwo", method=RequestMethod.POST)
	public void addUserStepTwo(HttpServletRequest req, HttpServletResponse resp, HttpSession session)
	  throws Exception{
		User user = (User)session.getAttribute("user");
		Address addr = new Address();
		addr.setAddress(req.getParameter("address"));
		addr.setPostCode(req.getParameter("postCode"));
		user.getAddrs().add(addr);
		userService.insertUser(user);
		session.removeAttribute("user");
		req.getRequestDispatcher("listUser.do").forward(req, resp);
	}
	
	@RequestMapping(value="toAddNewAddress", method=RequestMethod.GET)
	public String toAddNewAddress(@RequestParam Long uid, HttpServletRequest req){
		User user = userService.getOneUser(uid);
		req.setAttribute("user", user);
		return "addNewAddress";
	}
	
	@RequestMapping(value="addNewAddress", method=RequestMethod.POST)
	public String addNewAddress(@RequestParam Long uid, @RequestParam String address, @RequestParam String postCode){
		Address addr = new Address(address, postCode);
		User user = userService.getOneUser(uid);
		addr.setUser(user);
		addressService.insertAddress(addr);
		return "redirect:listUser.do";
	}
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public AddressService getAddressService() {
		return addressService;
	}
	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}
	
	
}
