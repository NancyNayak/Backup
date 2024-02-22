package Restassured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class parsingjsonResponseData {
    //approch 3 is very imp
    @Test
    void testjsonResponse(){
        //approch1
//        given().
//                contentType("ContentType.JSON").
//                when().get("http://api.zippopotam.us/us/90210");

       // approch2//- using jspothin assert
//        given().
//                contentType("ContentType.JSON").
    //                when().get("http://api.zippopotam.us/us/90210");
//        Response rs=given().
//                contentType("ContentType.JSON").
//        when().get("http://api.zippopotam.us/us/90210");
//              String state=  rs.jsonPath().get("places[0].state").toString();
//
//        Assert.assertEquals(state,"California");

        //approch 3-  where index will not use
        Response rs=given().
                contentType(ContentType.JSON).
        when().get("https://api.zippopotam.us/CZ/100 00");
        JSONObject JO =new JSONObject(rs.asString());
        boolean status=false;
        for (int i=0;i< JO.getJSONArray("places").length();i++) {
            String state = JO.getJSONArray("places").getJSONObject(i).get("place name").toString();
            System.out.println(i);
            if (state.equals("Žižkov (část)")) {
                status = true;
                break;

//           }
//       String s= rs.jsonPath().get("places[1].longitude");
//        System.out.println(s);


// Assert.assertEquals(status,true);
            }

        }}}



