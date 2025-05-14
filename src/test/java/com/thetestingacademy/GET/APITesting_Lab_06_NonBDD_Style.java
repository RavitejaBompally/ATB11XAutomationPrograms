package com.thetestingacademy.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab_06_NonBDD_Style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_GET_NonBDD() {

        String pincode = "504296";

        //Given

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();

        System.out.println(response.asString());

        vr = response.then().log().all();
        vr.statusCode(200);

    }

    @Test
    public void test_GET_NonBDD_Negative() {

        String pincode = "@";

        //Given

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();

        System.out.println(response.asString());

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
