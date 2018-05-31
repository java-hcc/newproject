package com.offcn.client;

import org.springframework.web.client.RestTemplate;

import com.offcn.pojo.Users;
import com.offcn.service.UserService;

public class App4 {
	
	public static void main(String[] args) {
		String rest = "http://localhost:8080/demo-cxf-rest/ws/restUserServiceWS";
	
		RestTemplate temp = new RestTemplate();
		Users u = temp.getForObject(rest+"/get/1",Users.class);
		System.err.println(u.getName());
	}
	
	
}
