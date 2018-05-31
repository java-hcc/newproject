package com.offcn.client;

import javax.ws.rs.core.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.pojo.Users;
import com.offcn.service.UserService;

public class App3 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-restws-client.xml");
		UserService us = (UserService)context.getBean("userService");
		Users user = us.get(1+"");
		System.out.println(user.getName());
	}

}
