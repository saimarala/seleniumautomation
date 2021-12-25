package APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC006_GET_ExtractValuesOfEachNodeInJson {

    @Test
    void extractValuesOfEachNodeInJson(){
        RestAssured.baseURI="http://dummy.restapiexample.com";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET,"/api/v1/employee/2");

        JsonPath js=response.jsonPath();
      //  System.out.println(js.get("ggg"));




    }
}
