package com.thetestingacademy.ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab_17_TestNG_AlwaysRun {

    @Test
    public void test001() {
        Assert.assertTrue(true);
    }
    @Test (alwaysRun = true, enabled = false)
    public void test002() {
        Assert.assertTrue(true);
    }
    @Test
    public void test003() {
        Assert.assertTrue(true);
    }
}
