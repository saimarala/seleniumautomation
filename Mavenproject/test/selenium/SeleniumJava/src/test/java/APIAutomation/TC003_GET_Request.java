package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_GET_Request {

    @Test
    void headerValidation(){
        RestAssured.baseURI="http://dummy.restapiexample.com";
        RequestSpecification httpRequest=RestAssured.given();

        Response response=httpRequest.request(Method.GET,"/api/v1/employee/2");
        String responseBody=response.getBody().asString();
        System.out.println(responseBody);

        //Validating headers
        String contentType=response.header("Content-Type");
        System.out.println("Content-Type is"+contentType);
        Assert.assertEquals(contentType,"application/json");

        String server=response.header("Server");
        System.out.println("Server :"+server);
        Assert.assertEquals(server,"nginx");

        String responseCode=response.header("Response");
        System.out.println("Response :"+responseCode);
        Assert.assertEquals(responseCode,200);


    }
}
