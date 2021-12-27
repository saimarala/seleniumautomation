package APIAutomation.RestAssuredBDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo05_DELETE_Request {

    @Test
    void deleteEmpRecord(){
        RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/delete/23";
        Response response =RestAssured.given()
             .when()
             .delete()
             .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .log().all()
                .extract().response();
        String jsonAsString=response.asString();
        Assert.assertTrue(jsonAsString.contains("Successfully! Record has been deleted"));

    }
}
