package com.thetestingacademy.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab_08NonBDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void Test_PUT_NonBDD() {

        String token = "415541a821ba4b6";
        String bookingid = "4140";

        String payloadPUT = "{\n" +
                "  \"firstname\" : \"James\",\n" +
                "  \"lastname\" : \"Brown\",\n" +
                "  \"totalprice\" : 111,\n" +
                "  \"depositpaid\" : true,\n" +
                "  \"bookingdates\" : {\n" +
                "    \"checkin\" : \"2018-01-01\",\n" +
                "    \"checkout\" : \"2019-01-01\"\n" +
                "  },\n" +
                "  \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payloadPUT).log().all();

        response = r.when().put();

        vr = response.then().log().all();
        vr = vr.statusCode(200);
    }

}

