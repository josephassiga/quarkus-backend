package org.mycompany;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class quarkusbackendTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/quarkus-backend")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}