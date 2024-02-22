package Restassured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import static io.restassured.RestAssured.given;

public class checkingCoolkiesandHeadersInResponse {

    @Test
    public void getcookies(){
        Response rs=given().
                when().
                get("https://www.google.com/");
//  capture single  cookie
       String cookie= rs.getCookie("AEC");
        System.out.println( cookie);
        // Capture Multiple cookie
      Map<String, String> cookies=  rs.getCookies();
      Set <String>s= cookies.keySet();
       for (String k:cookies.keySet()){
           String cookie_value= rs.getCookie(k);
           System.out.println(k+"   "+cookie_value);
       }


    }
    @Test
    public void getheaders(){
        Response rs=given().
                when().
                get("https://www.google.com/");
//  capture single  cookie
       String header=rs.getHeader("Content-Type");
        System.out.println(header);

       Headers headers= rs.getHeaders();
       for(Header h:rs.getHeaders()){
           System.out.println(h.getName()+" "+h.getValue());
       }

    }

}
