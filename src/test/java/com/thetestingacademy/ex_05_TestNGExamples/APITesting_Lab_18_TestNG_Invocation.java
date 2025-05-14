package com.thetestingacademy.ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab_18_TestNG_Invocation {
      @Test (invocationCount = 2)
    public void test01() {
        System.out.println("Hi");
    }
    @Test (invocationCount = 3)
    public void test02() {
        System.out.println("Bye");
    }
    @Test (invocationCount = 4)
    public void test03() {
        System.out.println("Bye");
    }

}
