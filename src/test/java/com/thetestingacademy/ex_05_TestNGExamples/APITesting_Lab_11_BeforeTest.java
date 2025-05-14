package com.thetestingacademy.ex_05_TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_Lab_11_BeforeTest {
    @BeforeTest
    public void getToken() {
        System.out.println("Before GET Token");
    }
    @BeforeTest
    public void getBookingID() {
        System.out.println("Before GET BookingID");
    }
    @Test
    public void test_PUT() {
        System.out.println("PUT Request");
    }
    @AfterTest
    public void close_allthings() {
        System.out.println("Close");
    }
}
