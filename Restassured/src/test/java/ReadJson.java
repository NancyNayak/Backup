import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*

public class ReadJson {
    @Test
    public void readjson(){
        given().
                when().get("http://api.zippopotam.us/us/90210").then().
                statusCode(200);

    }
}
