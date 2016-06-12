package com.htjx.user.controller;

import com.htjx.user.entity.User;

public class UserController {

	public static void main(String[] args) {
		
		User user=new User();
		user.setAge(12);
		user.setId(1);
		user.setName("yang006009001");
		
		System.out.println(user);
	}
}
