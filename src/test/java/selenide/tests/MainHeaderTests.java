package selenide.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import selenide.pages.HeaderPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс MainHeader")
public class MainHeaderTests extends BaseTest {
    HeaderPage headerPage = new HeaderPage();

    @DisplayName("Акции")
    @Description("Проверяет переход на страницу акции")
    @Test
    void checkActions() {
        headerPage.headersActions();
    }

    @DisplayName("Бренды")
    @Description("Проверяет переход на страницу акции")
    @Test
    void checkBrands() {
        headerPage.headerBrands();
    }

    @DisplayName("Лайв трансляция")
    @Description("Проверяет переход на лайв трансляции")
    @Test
    void checkTelecast() {
        headerPage.headerTelecast();
    }

    @DisplayName("Товары из рекламы")
    @Description("Проверяет переход на товары из рекламы")
    @Test
    void checkAdvertising() {
        headerPage.headerAdvertising();
    }

    @DisplayName("Ликвидация")
    @Description("Проверяет переход на товары ликвидации")
    @Test
    void checkLiquidation() {
        headerPage.headerLiquidation();
    }
}
