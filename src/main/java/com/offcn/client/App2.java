package com.offcn.client;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import com.offcn.pojo.Users;

public class App2 {

	public static String REST_SERVICE_URI = "http://localhost:8080/demo-cxf-rest/ws/restUserServiceWS";
	RestTemplate restTemplate = new RestTemplate();

	@Test
	public void testGet() throws Exception {
		// 发出get请求
		Users user = restTemplate.getForObject(REST_SERVICE_URI + "/get/101", Users.class);
		System.out.println("get:" + user.getName());
	}

	@Test
	public void testPost() throws Exception {
		// 发出post请求
		Users user2 = new Users();
		user2.setId(102);
		user2.setName("Green");

		Users userpost = restTemplate.postForObject(REST_SERVICE_URI + "/post", user2, Users.class);
		System.out.println("post:" + userpost.getName());
	}
}
