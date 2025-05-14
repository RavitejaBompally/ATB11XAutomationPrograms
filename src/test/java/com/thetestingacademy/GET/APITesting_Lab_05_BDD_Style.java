package com.thetestingacademy.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab_05_BDD_Style {
    @Test
    public void test_Get_Positive() {
        String pincode = "504296";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                .when()
                     .log()
                     .all()
                     .get()
                .then()
                     .log().all()
                .statusCode(200);
    }
}
