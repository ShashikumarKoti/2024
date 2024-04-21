package com.skoti.learning.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skoti.learning.exception.NoSuchUserFoundException;
import com.skoti.learning.model.User;
import com.skoti.learning.repository.UserRepo;
import com.skoti.learning.response.UserResponse;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public List<UserResponse> getAllUsers() {
		List<UserResponse> userResponseList = new ArrayList<>();

		List<User> usersList = userRepo.getAllUsers();
		for (User custUser : usersList) {
			userResponseList.add(UserResponse.build(custUser));
		}
		return userResponseList;
	}

	public UserResponse getUserByName(String userName) {
		User user = Optional.ofNullable(userRepo.getUserByName(userName))
				.orElseThrow(() -> new NoSuchUserFoundException("User illo maraya"));
		return UserResponse.build(user);

	}

	public UserResponse addUser(User user) {
		return userRepo.addUser(user);
	}

}
