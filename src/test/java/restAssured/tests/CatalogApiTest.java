package restAssured.tests;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static restAssured.specs.LoginSpec.loginRequestSpec;
import static restAssured.specs.LoginSpec.loginResponseSpec;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс CatalogApiTest")
public class CatalogApiTest {
    private static final String BEARER_TOKEN = "Bearer phpUnitCA";
    private static final int SALE_ID = 1858196;

    private SalesModelResponse getSalesResponse() {
        return step("Получаем активную акцию по id", () ->
                given(loginRequestSpec)
                        .header("Authorization", BEARER_TOKEN)
                        .contentType(ContentType.JSON)
                        .when()
                        .get("/sales/" + SALE_ID)
                        .then()
                        .spec(loginResponseSpec)
                        .extract()
                        .as(SalesModelResponse.class)
        );
    }

    @Description("Тест на получение информации о ликвидации")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка получения информации о ликвидации")
    @Test
    void getSalesLiquidation() {
        SalesModelResponse salesResponse = getSalesResponse();
        step("Проверяем, что ответ не пустой", () ->
                Assertions.assertNotNull(salesResponse, "Response should not be null"));
    }

    @DisplayName("Проверка, что название акции совпадает")
    @Test
    void verifySalesName() {
        SalesModelResponse salesResponse = getSalesResponse();
        step("Проверяем название акции", () ->
                Assertions.assertEquals("Ликвидация", salesResponse.getName(), "Unexpected name"));
    }

    @DisplayName("Проверка, что ID акции совпадает")
    @Test
    void verifySalesId() {
        SalesModelResponse salesResponse = getSalesResponse();
        step("Проверяем ID акции", () ->
                Assertions.assertEquals("1858196", salesResponse.getId(), "Unexpected ID"));
    }

    @DisplayName("Проверка, что срок акции совпадает")
    @Test
    void verifySalesActiveTo() {
        SalesModelResponse salesResponse = getSalesResponse();
        step("Проверяем срок акции", () ->
                Assertions.assertEquals("2026-08-16 23:59:00", salesResponse.getActive_to(), "Unexpected active_to date"));
    }
}