package com.offcn.service;

import com.offcn.pojo.Users;

public class UserServiceImpl implements UserService {

	@Override
	public Users get(String id) {
		System.out.println("get:��ѯ�û�");
		Users users = new Users();
		users.setId(Integer.parseInt(id));
		users.setName("jack");
		return users;
	}

	
	@Override
	public Users put(String id, Users u) {
		System.out.println("put������û�");
		return u;
	}

	@Override
	public Users post(Users u) {
		System.out.println("post������û�");
		System.out.println(u.getName());
		return u;
	}

	@Override
	public Users delete(String id) {
		System.out.println("delete��ɾ���û�");
		Users users = new Users();
		users.setId(Integer.parseInt(id));
		users.setName("jack");
		return users;
	}
	
	
}


