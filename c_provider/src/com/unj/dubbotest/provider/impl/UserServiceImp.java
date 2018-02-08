package com.unj.dubbotest.provider.impl;

import com.unj.dubbotest.provider.User;
import com.unj.dubbotest.provider.UserService;

public class UserServiceImp implements UserService{

	@Override
	public void userInfo() {
		User cpp = new User();
		cpp.setAge(18);
		cpp.setName("cpp");
		cpp.setSex("-----");
		System.out.println(cpp.toString());
	}

}
