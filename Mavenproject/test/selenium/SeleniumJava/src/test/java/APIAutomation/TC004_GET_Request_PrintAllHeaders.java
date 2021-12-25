package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TC004_GET_Request_PrintAllHeaders {

    @Test
    void getAllHeader(){
        RestAssured.baseURI="http://dummy.restapiexample.com";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,"/api/v1/employees");

        String responseBody=response.body().asString();
        System.out.println(responseBody);
        System.out.println("time :"+response.getTime());

        Headers allHeaders=response.headers();
        for (Header header:allHeaders){
            System.out.println(header.getName()+":"+header.getValue());
        }

    }
}
