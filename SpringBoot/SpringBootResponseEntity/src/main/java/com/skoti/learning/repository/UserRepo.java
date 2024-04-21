package com.skoti.learning.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.skoti.learning.model.City;
import com.skoti.learning.model.User;
import com.skoti.learning.response.UserResponse;

@Repository
public class UserRepo {

	static Map<String, User> userMap = new HashMap<>();

	static List<User> userList = new ArrayList<>();
	static {
		userMap.put("Shashi",
				new User(111, "Shashi", "Koti", Arrays.asList(new City("11", "VijayNagar"), new City("99", "Bangalore"))));
		userMap.put("Shwetha", new User(112, "Shwetha", "A.H",
				Arrays.asList(new City("22", "Davangere"), new City("99", "Bangalore"))));
		userMap.put("Simba",
				new User(113, "Simba", "Koti", Arrays.asList(new City("99", "Bangalore"), new City("62", "UK"))));

		userList = Arrays.asList(
				new User(111, "Shashi", "Koti", Arrays.asList(new City("11", "Hospet"), new City("99", "Bangalore"))),
				new User(112, "Shwetha", "A.H",
						Arrays.asList(new City("22", "Davangere"), new City("99", "Bangalore"))),
				new User(113, "Simba", "Koti", Arrays.asList(new City("99", "Bangalore"), new City("62", "UK"))));
	}

	public List<User> getAllUsers() {
		return userList;
	}

	public User getUserByName(String userName) {
		return userMap.get(userName);
	}

	public UserResponse addUser(User user) {
		return UserResponse.build(user);
	}

}
