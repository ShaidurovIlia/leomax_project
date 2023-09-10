package org.example.tests;

import io.qameta.allure.Owner;
import org.example.BaseTest;
import org.example.pages.HeaderPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс MainHeader")
public class MainHeaderTests extends BaseTest {
    HeaderPage headerPage = new HeaderPage();

    @DisplayName("проверяет переход на страницу акции")
    @Test
    void checkActions() {
        headerPage.headersActions();
    }
    
    @DisplayName("проверяет переход на страницу бренды")
    @Test
    void checkBrands() {
        headerPage.headerBrands();
    }

    @DisplayName("проверяет переход на лайв трансляции")
    @Test
    void checkTelecast() {
        headerPage.headerTelecast();
    }

    @DisplayName("проверяет переход на товары из рекламы")
    @Test
    void checkAdvertising() {
        headerPage.headerAdvertising();
    }

    @DisplayName("проверяет переход на товары ликвидации")
    @Test
    void checkLiquidation() {
        headerPage.headerLiquidation();
    }
}
