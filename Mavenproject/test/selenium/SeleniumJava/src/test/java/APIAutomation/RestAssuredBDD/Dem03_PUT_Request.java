package APIAutomation.RestAssuredBDD;

import APIAutomation.utilities.RestUtils;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class Dem03_PUT_Request {
    public static JSONObject js=new JSONObject();
    int emp_id=2;

    @BeforeClass
    void putData(){
        js.put("name", RestUtils.empName());
        js.put("salary",RestUtils.empSal());
        js.put("age",RestUtils.empAge());

        baseURI="http://dummy.restapiexample.com/api/v1";
        basePath="/update/"+emp_id;

    }

    @Test
    void testPUT(){
        given().contentType("application/json")
                .body(js)
                .when()
                .put()
                .then()
                .statusCode(200)
                .and()
                .assertThat().body("message",equalTo("Successfully! Record has been updated."))
                .log().all();

    }
}
