package com.epam;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Auth {

    @Test
    public void basicAuth(){
        given().auth().preemptive().basic("postman","password").when().get("https://postman-echo.com/basic-auth").then().statusCode(200);
    }
}
