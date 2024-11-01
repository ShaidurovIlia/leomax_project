package restAssured.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import restAssured.model.ClientModel;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.core.Is.is;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс FastOrderTest")
public class FastOrderTest {
    @Test
    void orderCreate() {
        ClientModel bodyClient = new ClientModel();

        bodyClient.setName("Тест");
        bodyClient.setPhone("+70000000000");
        bodyClient.setLead("leomax");
        bodyClient.setPass("leomax");
        bodyClient.setSource("ЗАКАЗ_ВИТА_ALASKAKIT");
        bodyClient.setProduct("45536-03");

        given()
                .body(bodyClient)
                .log().uri()
                .contentType(JSON)
                .when()
                .post("https://gate.leomax.ru/web-api/v1/order/create")
                .then()
                .log().status()
                .log().body()
                .statusCode(201)
                .body("success", is(true));
    }
}
