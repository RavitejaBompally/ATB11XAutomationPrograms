package com.thetestingacademy.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab_07NonBDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test

    public void test_POST_Non_BDD_Style() {

        //URL,Method,Payload,Body,Headers
        //Auth?

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        System.out.println("--------Part 1--------");

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println("------Part 2------");

        response = r.when().log().all().post();

        vr = response.then().log().all();
        vr = vr.statusCode(200);


    }
}
