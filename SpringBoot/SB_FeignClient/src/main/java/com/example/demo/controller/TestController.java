package com.example.demo.controller;

import com.example.demo.client.UsersClient;
import com.example.demo.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

  @Autowired UsersClient usersClient;

  @GetMapping("/findAllUsers")
  public List<UserResponse> getUsers() {
    return usersClient.getAllUsers();
  }
}
