package com.example.skoti.service;

import org.springframework.stereotype.Service;

@Service
public class MyMath {

   public int sum(int [] numbers) {
        int sum = 0;

        for(int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
