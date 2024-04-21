package com.skoti.learning.response;

import java.util.List;

import com.skoti.learning.model.City;
import com.skoti.learning.model.User;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponse {

	private String userFirstName;
	
	private List<City> userCities;
	
	public static UserResponse build(User user) {
		
		return UserResponse.builder()
				.userFirstName(user.getUserName())
				.userCities(user.getCities()).build();
		
	}
}
