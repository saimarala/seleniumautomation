package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_GET_Request {

    @Test
    public void weatherDetails() {
        //Specify base URI
        RestAssured.baseURI = "http://dummy.restapiexample.com";
        //Request object
        RequestSpecification httprequest = RestAssured.given();
        //Response object
        Response response = httprequest.request(Method.GET, "/api/v1/employee/2");
        //print response in console window
        String responsebody = response.getBody().asString();
        System.out.println("response body :" + responsebody);
        //status code validation
        int statusCode=response.getStatusCode();
        System.out.println("Status code is: "+statusCode);
        Assert.assertEquals(statusCode,200);
        ///status line verification
        String statusLine=response.getStatusLine();
        System.out.println("Status line is:"+statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
    }
}
