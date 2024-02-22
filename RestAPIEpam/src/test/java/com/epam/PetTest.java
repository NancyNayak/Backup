package com.epam;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import model.Category;
import model.Pet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PetTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ("https://petstore.swagger.io");
        RestAssured.basePath = ("/v2/");
        RestAssured.requestSpecification = new RequestSpecBuilder().setContentType("application/json").build();
    }


    @Test
    public void getTest() {
        get("/pet/12345").then().statusCode(200);

    }

    @Test
    public void DeleteTest() {
        delete("/pet/12345").then().statusCode(200);

    }

    @Test
    public void PostTest() {

        Category category = new Category(123, "lion1");
        Pet p = new Pet(123456, "Lion", category, "pending");
        Response response = given().body(p).post("/pet/");

        String id = response.path("id").toString();
        System.out.println("id of the  New Pet " + id);


    }

    @Test
    public void getTest1() {
        Pet Pet = get("/pet/123456").as(Pet.class);
        System.out.println("name" + Pet.getName());
    }

    @Test
    public void getPut() {
        Category category = new Category(123, "lion1");
        Pet p = new Pet(123456, "Lion", category, "available");
        Response response = given().body(p).put("/pet/");

        String status = response.path("status").toString();
        System.out.println(p.getStatus());


    }
}