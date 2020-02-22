package com.rest.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.crud.model.User;
import com.rest.crud.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public ResponseEntity<User> insertUser(@RequestBody User user) {

		User user1 = userService.saveUser(user);

		return new ResponseEntity<User>(user1, HttpStatus.OK);
	}

	@GetMapping("/user")
	public ResponseEntity<List<User>> getUser() {

		List<User> users = userService.getUsers();

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@DeleteMapping("/user/{firstName}")
	public ResponseEntity<List<User>> deleteUser(@PathVariable("firstName") String firstName) {

		List<User> users = userService.deleteUser(firstName);

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

}
