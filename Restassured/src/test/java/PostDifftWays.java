import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PostDifftWays {
   //using POJO
    @Test
    public void Post(){
        POJO data =new POJO();
        data.setName("morpheus");
        data.setJob("great");

        Response rs=given().contentType(ContentType.JSON).body(data)
                .when().post("https://reqres.in/");
//     String type= rs.jsonPath().get("job").toString();
//        System.out.println(type);
//        Assert.assertEquals(type,"leader");
        System.out.println(rs.getStatusCode());




    }
    // using jsonfile
    @Test
    public void PostFile() throws FileNotFoundException {
     File f =new File("src/test/resources/data.json");
        FileReader fileReader= new FileReader(f);
        JSONTokener js= new JSONTokener(fileReader);
        JSONObject data= new JSONObject(js);



        Response rs=given().contentType(ContentType.JSON).body(data.toString())
                .when().post("https://reqres.in/");
//        Assert.assertEquals(type,"leader");




    }


}
