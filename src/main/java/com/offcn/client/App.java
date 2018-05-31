package com.offcn.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.offcn.pojo.Users;
import com.offcn.service.UserService;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-restws-client.xml");
		UserService userService = (UserService) context.getBean("userService");
		Users user = userService.get(101+"");
		System.out.println("ÓÃ»§Ãû£º"+user.getName());
	}

}
