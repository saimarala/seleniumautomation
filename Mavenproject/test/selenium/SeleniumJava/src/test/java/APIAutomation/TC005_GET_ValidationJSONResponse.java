package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.testng.annotations.Test;



public class TC005_GET_ValidationJSONResponse {

    @Test
    void validationJSONResponse(){
        RestAssured.baseURI="http://dummy.restapiexample.com";
        RequestSpecification httpRequest=RestAssured.given();

        Response response=httpRequest.request(Method.GET,"/api/v1/employee/2");
        String responseBody=response.body().asString();
        System.out.println(responseBody);
        Assert.assertTrue(responseBody.contains("2"));

    }
}
