package com.epam;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CoopTest {
    @Test
    public  void Testoath2(){
        Response response=given().formParam("client_id","TestDemoApp").

                formParam("client_secret","f966422de951e1eef9c51dc5cd97ce4c").
                formParam("grant_type","client_credentials").
                post("http://coop.apps.symfonycasts.com/token");
        String accessToken=response.path("access_token");
        System.out.println(response.prettyPrint());
        Response response1=given().auth().oauth2(accessToken).
                post("http://coop.apps.symfonycasts.com/api/1871/chickens-feed");

        System.out.println(response1.prettyPrint());
    }
}
