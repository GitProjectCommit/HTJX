package com.htjx.user.controller;

import com.htjx.user.entity.User;

public class UserController {

	public static void main(String[] args) {
		
		User user=new User();
		user.setAge(12);
		user.setId(12);
		user.setName("oneHTJX");

		
		System.out.println(user);
		System.out.println("commit");
	}
}
