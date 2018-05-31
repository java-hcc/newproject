package com.offcn.service;

import com.offcn.pojo.Users;

public class UserServiceImpl implements UserService {

	@Override
	public Users get(String id) {
		System.out.println("get:查询用户");
		Users users = new Users();
		users.setId(Integer.parseInt(id));
		users.setName("jack");
		return users;
	}

	
	@Override
	public Users put(String id, Users u) {
		System.out.println("put：添加用户");
		return u;
	}

	@Override
	public Users post(Users u) {
		System.out.println("post：添加用户");
		System.out.println(u.getName());
		return u;
	}

	@Override
	public Users delete(String id) {
		System.out.println("delete：删除用户");
		Users users = new Users();
		users.setId(Integer.parseInt(id));
		users.setName("jack");
		return users;
	}
	
	
}


