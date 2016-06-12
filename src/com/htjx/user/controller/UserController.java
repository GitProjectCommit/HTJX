package com.htjx.user.controller;

import com.htjx.user.entity.User;

public class UserController {

	public static void main(String[] args) {
		
		User user=new User();
		user.setAge(12);
		user.setId(12);
//		user.setName("yang006009001");
		user.setName("why");

		
		System.out.println(user);
	}
}
