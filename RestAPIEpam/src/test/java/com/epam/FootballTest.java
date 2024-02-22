package com.epam;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class FootballTest {

    @BeforeClass
    public  void setup(){
        RestAssured.baseURI="https://api.football-data.org";
        RestAssured.basePath="/v2/";
        RestAssured. requestSpecification =new RequestSpecBuilder().setContentType("application/json").addHeader("X-Auth-Token","969af72f3e4949368c3df7108e9f34e0").build();

    }
@Test
    public  void ResponseTest(){
        Response response=get("/teams/66");
            String name=   response.path("teams[0].name");
        System.out.println(name);
    //Assert.assertEquals(name,"Arsenal FC");
    List<Map<String,?>> teamdate= response.path("teams");
    Map<String ,?>team=teamdate.get(0);
    System.out.println(team.get(name));
    }

}
