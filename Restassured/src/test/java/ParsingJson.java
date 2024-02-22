import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ParsingJson {
    @Test
    public  void parsingJson(){
        boolean flag=false;

        Response rs=  given().
              contentType("ContentType.JSON").
              when().get("http://api.zippopotam.us/us/90210");
        JSONObject js= new JSONObject(rs.asString());
for(int i=0;i<js.getJSONArray("places").length()-1;i++){
     String state=js.getJSONArray("places").getJSONObject(i).get("state").toString();
     if(state.equals("California")){
         flag=true;
         break;
     }
    Assert.assertEquals(flag,true);

}


    }

}
