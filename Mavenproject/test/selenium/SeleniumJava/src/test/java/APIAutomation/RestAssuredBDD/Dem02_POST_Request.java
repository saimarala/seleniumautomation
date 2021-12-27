package APIAutomation.RestAssuredBDD;

import APIAutomation.utilities.RestUtils;
import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.hamcrest.Matchers.*;

public class Dem02_POST_Request {
    public static JSONObject js=new JSONObject();

    @BeforeClass
    void posData(){
        js.put("name", RestUtils.empName());
        js.put("salary",RestUtils.empSal());
        js.put("age",RestUtils.empAge());

       // RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
      //  RestAssured.basePath="/create";
    }
    @Test(enabled = false)
    void testPost(){
        RestAssured.given().contentType("application/json")
                .body(js.toJSONString())
                .when()
                .post()
                .then()
                .statusCode(200)
                .and()
                //.body("name",contains("APIAutomation"))
                .body("status",equalTo("success"))
                .body("message",equalTo("Successfully! Record has been added."))
                .log().all();


    }

    @Test(enabled = false)
    void testPost1(){
        RestAssured.given()
                .body(js.toJSONString())
                .when().post("/create")
                .then()
                .statusCode(200)
                .and()
                .body("status",equalTo("success"))
                .body("message",equalTo("Successfully! Record has been added."))
                .log().all();

    }

    @Test
    void testPost2(){
        RestAssured.given()
                .body(js.toJSONString())
                .when().post("http://dummy.restapiexample.com/api/v1/create")
                .then()
                .statusCode(200)
                .and()
                .body("status",equalTo("success"))
                .body("message",equalTo("Successfully! Record has been added."))
                .log().all();

    }
}
