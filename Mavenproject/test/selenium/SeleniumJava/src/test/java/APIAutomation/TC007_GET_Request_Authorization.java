package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.PreemptiveAuthSpec;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC007_GET_Request_Authorization {

    @Test
    void authorization(){
        RestAssured.baseURI="http://postman-echo.com/basic-auth";

        PreemptiveBasicAuthScheme auth=new PreemptiveBasicAuthScheme();
        auth.setUserName("postman");
        auth.setPassword("password");
        RestAssured.authentication=auth;

        RequestSpecification httpRequest=RestAssured.given();

        Response response=httpRequest.request(Method.GET,"/");
        String responseBody=response.body().asString();
        System.out.println(responseBody);
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
