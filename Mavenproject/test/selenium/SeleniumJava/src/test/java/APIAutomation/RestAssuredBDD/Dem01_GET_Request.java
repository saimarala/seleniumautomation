package APIAutomation.RestAssuredBDD;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class Dem01_GET_Request {

    @Test
    void test(){
        RestAssured.given()
                .when()
                .get("http://dummy.restapiexample.com/api/v1/employee/1")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("cc",equalTo("ff"))
                .header("Content-Type","text/html; charset=UTF-8");



    }
}
