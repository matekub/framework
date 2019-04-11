package api;

import com.jayway.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class PetStore {

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @Test(description = "Add a new pet to the store")
    public void addPet() {
        given()
                .body("{\n" +
                        "  \"id\": 2001,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie2001\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .contentType("application/json")
                .when()
                .post("/pet")
                .then()
                .statusCode(200);
    }

    @Test
    public void getPet(){
        given()
                .when()
                .pathParam("petId", "2001")
                .get("/pet/{petId}")
                .then()
                .statusCode(200);
    }

    @Test
    public void addPetModel(){


    }

}
