package com.rest.crud.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.rest.crud.model.User;

@Service
public class UserService {

	static List<User> users = new ArrayList<>();

	public User saveUser(User user) {
   for(int i = 0; i < users.size(); i++) {
	
	if(UserService.users.get(i).getFname().equals(user.getFname()))
			{
		this.deleteUser(user.getFname());
		UserService.users.add(user);
		return user;
			}
   }

		UserService.users.add(user);
		System.out.println(users);
		return user;
	}

	public List<User> getUsers() {

		return users;
	}

	public List<User> deleteUser(String firstName) {

		for (User user : users) {
			if (user.getFname().equals(firstName)) {
				users.remove(user);
				return users;
			}

		}
		return users;
	}

	public User getUser(String firstname) {

		for (User user : users) {
			if (user.getFname().equals(firstname)) {
				return user;

			}

		}
		return null;
	}

}
