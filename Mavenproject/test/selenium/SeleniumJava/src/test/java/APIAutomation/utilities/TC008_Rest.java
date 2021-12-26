package APIAutomation.utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC008_Rest {
    @Test
    void test_01(){
        Response response=RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
        System.out.println(response.body().asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getTime());
        Assert.assertEquals(response.getStatusCode(),200);

    }

    @Test
    void test_02(){
        RestAssured.given().get("http://reqres.in/api/users?page=2").then().statusCode(200);
    }


}
