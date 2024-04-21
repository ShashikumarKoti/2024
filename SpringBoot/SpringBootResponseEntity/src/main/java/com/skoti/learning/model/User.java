package com.skoti.learning.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Data
public class User {
	
	private int userId;
	
	private String userName;
	
	private String lastName;
	
	private List<City> cities;

}
