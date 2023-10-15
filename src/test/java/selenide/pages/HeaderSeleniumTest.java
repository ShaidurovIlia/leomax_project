package selenide.pages;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenide.tests.BaseSeleniumTest;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс HeaderSeleniumTest")
public class HeaderSeleniumTest extends BaseSeleniumTest {

    MainPageSelenium mainPage = new MainPageSelenium();

    @DisplayName("Акции")
    @Description("Проверяет переход на страницу страницу акции")
    @Test
    public void checkAction() {
        mainPage.headersActions();
    }

    @DisplayName("Лайв трансляция")
    @Description("Проверяет переход на страницу лайв трансляции")
    @Test
    public void checkBrand() {
        mainPage.headerBrands();
    }

    @DisplayName("Лайв трансляция")
    @Description("Проверяет переход на страницу лайв трансляции")
    @Test
    public void headerTelecast() {
        mainPage.headerTelecast();
    }

    @DisplayName("Товары из рекламы")
    @Description("Проверяет переход на страницу товары из рекламы")
    @Test
    void headerAdvertising() {
        mainPage.headerAdvertising();
    }

    @DisplayName("Ликвидация")
    @Description("Проверяет переход на страницу новая коллекция")
    @Test
    void headerNewCollection() {
        mainPage.headerNewCollection();
    }
}
