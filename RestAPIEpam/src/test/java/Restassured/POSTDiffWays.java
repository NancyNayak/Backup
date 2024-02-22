package Restassured;
// 4 ways to pass pay load in req:
//1. usimg hashMap
//2. using  org.json library- by JSONObject
//3. POJO CLASS
//4. using json file -

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.given;

public class POSTDiffWays {
    //@Test
    public void createUserusingPOJO(){
        PojoClass data =new PojoClass();
        data.setName("morpheus");
        data.setJob("leader");

        given().contentType("application/json").body(data.toString())
                .when().post("https://reqres.in//api/users")
                .then().statusCode(201).log().all();
    }


        //@Test
        public void createUserusingJSONfile() throws FileNotFoundException {
          File f=new File(".//jsonMockData");
            FileReader fr= new FileReader(f);
            JSONTokener J= new JSONTokener(fr);
            JSONObject data = new JSONObject(J);


            given().contentType("application/json").body(data.toString())
                    .when().post("https://reqres.in//api/users")
                    .then().statusCode(201).log().all();
        }


}
