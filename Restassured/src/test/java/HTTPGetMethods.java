import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HTTPGetMethods {

    @Test
    public void getUser() {
        given()
        .when().get("https://reqres.in/api/users?page=2")
        .then().statusCode(200).body("page",equalTo(2)).log().all();

    }
    @Test
    public void PostUser() {
        JSONObject data = new JSONObject();
        data.put("name","morpheus");
        data.put("job","leader");

        given().contentType("application/json").body(data.toString())
                .when().post("https://reqres.in/api/users")
                .then().statusCode(201).body("name",equalTo("morpheus")).body("job",equalTo("leader")).log().all();
    }
    @Test
    public void putUser(){
        JSONObject data =new JSONObject();
        data.put("name","morpheus");
        data.put("job","zion resident");

        given().contentType("application/json").body(data.toString()).
                when().put("https://reqres.in/api/users/2").
                then().statusCode(200).body("name",equalTo("morpheus")).body("job",equalTo("zion resident")).log().all();
    }

@Test
    public void deteleUser(){
        when().delete("https://reqres.in/api/users/2")
                .then().statusCode(204);

}

}
