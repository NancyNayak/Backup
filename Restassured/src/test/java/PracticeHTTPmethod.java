import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PracticeHTTPmethod {
@Test
    public void getMethod(){
        given()
                .when().get("https://reqres.in/api/users?page=2").
                then().statusCode(200).body("page",equalTo(2));

    }

    @Test
    public void postMethod(){
        JSONObject data= new JSONObject();
        data.put("name","morpheus");
        data.put("job","leader");

    given().contentType("application/json").body(data.toString()).
            then().statusCode(201).body("name",equalTo("morpheus")).log().all();
    }

}
