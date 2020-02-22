package com.rest.crud.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.crud.model.User;

@Service
public class UserService {

	static List<User> users =new ArrayList<>();
	
	public User saveUser(User user) {
		UserService.users.add(user);
		System.out.println(users);
		return user;
	}

	public List<User> getUsers() {
		
		return users;
	}

	public List<User> deleteUser(String firstName) {
		
		for (User user : users) {
			if(user.getFname().equals(firstName))
			{	users.remove(user);
			return users;
			}
			
		}
		return users;
	}

}
