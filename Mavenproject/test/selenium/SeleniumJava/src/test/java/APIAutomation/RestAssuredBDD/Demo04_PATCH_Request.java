package APIAutomation.RestAssuredBDD;

import APIAutomation.utilities.RestUtils;
import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;


public class Demo04_PATCH_Request {
    public static JSONObject js = new JSONObject();
    int emp_id=2;

    @BeforeClass
    void putData(){
        js.put("age",RestUtils.empAge());

        baseURI="https://reqres.in/api/users/2";
       // basePath="/update/"+emp_id;

    }
    @Test
    void patchTest(){
        RestAssured.given().body(js.toJSONString())
                .when().patch()
                .then()
                .statusCode(200)
                .log().all();

    }
}
