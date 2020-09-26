package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

    public void weatherDetails() {
        //Specify base URI
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
        //Request object
        RequestSpecification httprequest = RestAssured.given();
        //Response object
        Response response = httprequest.request(Method.GET, "/Hyderabad");
        //print response in console window
        String responsebody = response.getBody().asString();
        System.out.println("response body :" + responsebody);

    }
}
