package com.example.SB_BookMyShow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookMyShow")
public class BookingController {

    @GetMapping("/getBooking")
    public String getBookingDetails() throws InterruptedException {
        System.out.println("entered getBooking");
        return "Your ticket is booked";
    }
}
