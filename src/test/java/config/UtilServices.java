package config;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UtilServices extends  BaseTest{

/*

    public Response getBookings(){
        return given(spec)
                .when()
                .get("/booking")
                .then()
                .statusCode(200)
                .extract().response();
    }


    public Response createBookingm(){

        Response response = given(spec)
                .when()
                .contentType(ContentType.JSON)
                .body(new Booking("Sabir","Tahirli",777,true,
                        new Bookingdates("2025-01-01","2026-01-01"),"test"))
                .post("/booking");
        response
                .then()
                .statusCode(200);
        return response;
    }


    public int getId(){
        Response response = createBookingm();
        return response.jsonPath().getJsonObject("bookingid");
    }

    public String createToken() {
        Response response = given(spec)
                .when()
                .contentType(ContentType.JSON)
                .body(new TokenBody("admin","password123"))
                .post("/auth");
        response
                .then()
                .statusCode(200);
        return response.jsonPath().getJsonObject("token");
    }
*/
}
