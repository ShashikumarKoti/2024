package com.example.SB_profiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Value("${max.limit}")
    private String profileName;

    @GetMapping("profile")
    public String getProfile() {
        return profileName + " is active";
    }
}
