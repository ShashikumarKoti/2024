package com.example.demo.client;

import com.example.demo.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com",name = "USER-CLIENT")
public interface UsersClient {

  @GetMapping("/users")
  List<UserResponse> getAllUsers();
}
