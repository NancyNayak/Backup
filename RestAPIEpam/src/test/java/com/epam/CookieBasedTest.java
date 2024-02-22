package com.epam;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;

public class CookieBasedTest {

    @Test
    public void Test(){
        Map<String, String> data= new HashMap<>();
            data.put("username","myuser");
        data.put("password","mypassword");

     Response ResponseFromSessionAPI= given().header("Content-Type","application/json").
             body(data).
             post("http://jira-rmsis.optimizory.com:8090/jira/rest/auth/1/session");
        System.out.println(post().getStatusCode());
        System.out.println(post().getBody().prettyPrint());


        }


}
