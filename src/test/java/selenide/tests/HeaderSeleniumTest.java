package selenide.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenide.core.BaseSeleniumTest;
import selenide.pages.HeaderPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс HeaderSeleniumTest")
public class HeaderSeleniumTest extends BaseSeleniumTest {

    HeaderPage mainPage = new HeaderPage();

    @DisplayName("Акции")
    @Description("Проверяет переход на страницу страницу акции")
    @Test
    public void checkAction() {
        mainPage.clickActions();
    }

    @DisplayName("Бренды")
    @Description("Проверяет переход на страницу бренды")
    @Test
    public void checkBrand() {
        mainPage.clickBrands();
    }

    @DisplayName("Лайв трансляция")
    @Description("Проверяет переход на страницу лайв трансляции")
    @Test
    public void headerTelecast() {
        mainPage.clickTelecast();
    }

    @DisplayName("Товары из рекламы")
    @Description("Проверяет переход на страницу товары из рекламы")
    @Test
    void headerAdvertising() {
        mainPage.clickAdvertising();
    }

    @DisplayName("Новая коллекция")
    @Description("Проверяет переход на страницу новая коллекция")
    @Test
    void headerNewCollection() {
        mainPage.clickCollection();
    }
}
