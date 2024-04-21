package com.skoti.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skoti.learning.model.User;
import com.skoti.learning.response.UserResponse;
import com.skoti.learning.service.UserService;

@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<UserResponse> getUsers() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-NEXUS-USER-ID", "response-userID");
		headers.add("X-NEXUS-PARTNER-ID", "response-country");
		return userService.getAllUsers();
	}

	@GetMapping("/user/{userId}")
	public UserResponse getUser(@PathVariable("userId") String userId) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-NEXUS-USER-ID", "response-userID");
		headers.add("X-NEXUS-PARTNER-ID", "response-country");
//	return 	ResponseEntity.status(201).headers(headers).body(userService.getUserByName(userId)); // here headers is optional// return
		return userService.getUserByName(userId);
	}
	
	@PostMapping("/user")
	public UserResponse createUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}
