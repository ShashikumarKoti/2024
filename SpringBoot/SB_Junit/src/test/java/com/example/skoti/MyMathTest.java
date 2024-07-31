package com.example.skoti;

import com.example.skoti.service.MyMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {

    MyMath myMath = new MyMath();

    @BeforeEach
    public void before() {
        System.out.println("Before");
    }

    @AfterEach
    public void after() {
        System.out.println("After");
    }

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before Class");
    }


    @AfterAll
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Test
    void sum_with3numbers() {
        System.out.println("Test1");
        assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
    }

    @Test
    void sum_with1number() {
        System.out.println("Test2");
        assertEquals(3, myMath.sum(new int[] { 3 }));
    }
}
