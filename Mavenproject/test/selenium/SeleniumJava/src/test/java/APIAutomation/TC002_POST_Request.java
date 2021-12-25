package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_POST_Request {

    @Test
    void registrationSuccessful(){
        //specific base URI
        RestAssured.baseURI="http://dummy.restapiexample.com";
        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Request payload sending along with post request
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name","selenium");
        jsonObject.put("Salary","20");
        jsonObject.put("age",35);

        httpRequest.header("Content-Type","application/json");
        //attach above data to request
        httpRequest.body(jsonObject.toJSONString());

        //Response body
        Response response=httpRequest.request(Method.POST,"/api/v1/create");

        //print response on console
        String responseBody=response.getBody().asString();
        System.out.println(responseBody);
        int statusCode=response.getStatusCode();
        System.out.println("Status code :"+statusCode);
        Assert.assertEquals(statusCode,201);
        String successCode=response.jsonPath().get("status");
        System.out.println(successCode);
        Assert.assertEquals(successCode,"success");



    }
}
