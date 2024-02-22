package Restassured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
 import static org.hamcrest.Matchers.*;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class HTTPMethods {
    @Test
    public void getusers(){
        given()
                .when()
                .get("https://reqres.in//api/users?page=2")
                        .then()
                        .statusCode(404)
                        .body("page",equalTo(2))
                        .log().all();



    }

//@Test
    public void createUserUsingJSONLib(){
        JSONObject data =new JSONObject();
        data.put("name","morpheus");
                data.put("job","leader");

        given().contentType("application/json").body(data.toString())
                .when().post("https://reqres.in//api/users")
                        .then().statusCode(201).log().all();
}

    @Test
    public void UpdateUser(){
        JSONObject data =new JSONObject();
        data.put("name","morpheus");
        data.put("job","zion resident");

        given().contentType("application/json").body(data.toString())
                .when().put("https://reqres.in//api/users/2")
                .then().statusCode(200).body("name",equalTo("morpheus")).body("job",equalTo("zion resident"));
    }

    @Test
    public void deleteUser(){


        given()
                .when().delete("https://reqres.in//api/users/2")
                .then().statusCode(204).log().all();
    }


}
