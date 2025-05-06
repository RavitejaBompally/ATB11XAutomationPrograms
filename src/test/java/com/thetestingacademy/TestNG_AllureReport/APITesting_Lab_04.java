package com.thetestingacademy.TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab_04 {

    String pincode = "504296";
    @Test
    public void test_Get_Positive_TC1() {
        pincode = "504296";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
      public void test_Get_Negative_TC2() {
          pincode = "";
          RestAssured
                  .given()
                  .baseUri("https://api.zippopotam.us")
                  .basePath("/IN/" + pincode)
                  .when()
                  .get()
                  .then()
                  .log().all().statusCode(200);
      }
     @Test
    public void test_Get_Negative_TC3() {
        pincode = "$";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }


    }
