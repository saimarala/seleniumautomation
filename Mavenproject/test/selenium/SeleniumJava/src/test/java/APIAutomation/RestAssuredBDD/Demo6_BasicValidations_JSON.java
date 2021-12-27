package APIAutomation.RestAssuredBDD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class Demo6_BasicValidations_JSON {

    @Test
    void testStatusCode(){
        RestAssured.given().when().get("http://jsonplaceholder.typicode.com/posts/5")
                .then().statusCode(200);
    }
    @Test
    void testLogging(){
        RestAssured.given().when().get("http://jsonplaceholder.typicode.com/posts/5")
                .then().statusCode(200)
                .log().all();

    }

    @Test(enabled = false)
    void testAll(){
        Response response=RestAssured.given().when().get("http://jsonplaceholder.typicode.com/posts/2")
                .then().log().all().extract().response();
        for (Header head:response.headers()){
            System.out.println(head.getName()+":"+head.getValue());
        }
    }

    @Test
    void testSingleContent(){
        RestAssured.given()
                .when().get("http://jsonplaceholder.typicode.com/posts/5")
                .then()
                .statusCode(200)
                .assertThat().body("id",equalTo(5));
    }

    @Test
    void testMultipleContents(){
        RestAssured.given()
                .when().get("http://jsonplaceholder.typicode.com/posts")
                .then()
                .body("id",hasItems(1,2,3,4,5,6));
    }
    @Test
    void testParametersAndHeaders(){
        RestAssured.given().param("this","selenium").header("MyHeader","SDET")
               // .contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().get("http://jsonplaceholder.typicode.com/posts/5")
                .then().statusCode(200)
                .body("title",equalTo("nesciunt quas odio"))
                .log().all();
    }


}
