package com.epam;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class BaseTest {
    @BeforeClass
    public  void setup(){
        RestAssured.requestSpecification=new RequestSpecBuilder().setBaseUri("http://api.zippopotam.us").setContentType("application/json").build();
        RestAssured.responseSpecification=new ResponseSpecBuilder().expectStatusCode(200).expectResponseTime(lessThan(1400L)).expectContentType("application/json")
    .build();
    }

@Test
    public  void Test(){
        get("/us/90210").then().
                body("country",equalTo("United States"))
                .body("'country abbreviation'", equalTo("US"))
                .body("places[0].state",equalTo("California"));

    }



}
