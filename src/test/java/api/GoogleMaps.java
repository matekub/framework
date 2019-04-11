package api;

import com.jayway.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GoogleMaps {

    public static final String KEY = "AIzaSyBIlZQymJvjXP4hQpRZy7KP7QYLeBgPYzg";

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://maps.googleapis.com";
        RestAssured.basePath = "/maps/api";
    }

    @Test
    public void healthCheck() {
        given()
                .param("units", "imperial")
                .param("origins", "Washington, DC")
                .param("destinations", "New+York+City, NY")
                .param("key", "AIzaSyBIlZQymJvjXP4hQpRZy7KP7QYLeBgPYzg")
                .when()
                .get("/distancematrix/json")
                .then()
                .statusCode(200);
    }

    @Test
    public void validateResponseBody() {
        given()
                .param("units", "imperial")
                .param("origins", "Washington, DC")
                .param("destinations", "New+York+City, NY")
                .param("key", "AIzaSyBIlZQymJvjXP4hQpRZy7KP7QYLeBgPYzg")
        .when()
                .get("/distancematrix/json")
        .then()
                .body("rows[0].elements[0].distance.value", equalTo(361957));

    }

    /*@Test
    public void addPlace(){
        given()
                .queryParam("key", KEY)
        .when()
                .post("/places/add/jason")

    }*/
}
