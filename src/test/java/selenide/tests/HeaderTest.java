package selenide.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenide.core.BaseTest;
import selenide.pages.HeaderPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс HeaderTest")
public class HeaderTest extends BaseTest {

    HeaderPage header = new HeaderPage();

    @DisplayName("Акции")
    @Description("Проверяет переход на страницу страницу акции")
    @Test
    public void checkAction() {
        header.clickActions();
    }

    @DisplayName("Бренды")
    @Description("Проверяет переход на страницу бренды")
    @Test
    public void checkBrand() {
        header.clickBrands();
    }

    @DisplayName("Лайв трансляция")
    @Description("Проверяет переход на страницу лайв трансляции")
    @Test
    public void checkTelecast() {
        header.clickTelecast();
    }

    @DisplayName("Товары из рекламы")
    @Description("Проверяет переход на страницу товары из рекламы")
    @Test
    void checkAdvertising() {
        header.clickAdvertising();
    }

    @DisplayName("Новая коллекция")
    @Description("Проверяет переход на страницу новая коллекция")
    @Test
    void checkNewCollection() {
        header.clickCollection();
    }
}
