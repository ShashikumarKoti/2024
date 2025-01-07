package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hi from Quarkus REST"));
    }

    @Test
    void testGreeting() {
        String randomString = UUID.randomUUID().toString();
        given().pathParam("name",randomString)
                .when().get("/hello/greet/{name}")
                .then()
                .statusCode(200)
                .body(is("hello " + randomString));
    }

    @Test
    void testGreetingQuery() {
        String randomString = UUID.randomUUID().toString();
        given().queryParam("name",randomString)
                .when().get("/hello/greetquery")
                .then()
                .statusCode(200)
                .body(is("HelloQuery " + randomString));
    }

}