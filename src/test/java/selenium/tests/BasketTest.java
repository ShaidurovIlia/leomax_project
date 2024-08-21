package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.BasketPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс BasketTest")
public class BasketTest extends BaseTest {
    BasketPage basketPage = new BasketPage();

    @DisplayName("Промокод")
    @Description("Проверяет работу промокода в корзине")
    @Test
    void checkPromo() {
        basketPage.validPromo();
    }

    @DisplayName("Лот в корзине")
    @Description("Проверяет добавленный лот в корзине")
    @Test
    void checkOrderBasket() {
        basketPage.searchProductAndAddToBasket();
    }

    @Disabled("В процессе разработки БЗ")
    @DisplayName("Оформление быстрого заказа")
    @Description("Проверяет оформление быстрого заказа из корзины")
    @Test
    void checkFastOrder() {
        basketPage.fastOrderInBasket();
    }

    @DisplayName("Избранное")
    @Description("Проверяет добавление лота в избранное из КТ")
    @Test
    void checkAddInFavorites() {
        basketPage.addInFavorites();
    }

    @DisplayName("Карта Много.ру")
    @Description("Проверяет работу карты Много.ру в корзине")
    @Test
    void checkMnogoRuCard() {
        basketPage.mnogoRuCardInBasket();
    }

    @DisplayName("Удаление лота из корзины")
    @Description("Проверяет удаление лота из корзины")
    @Test
    void checkEmptyBasket() {
        basketPage.deleteFromBasket();
    }

    @Disabled("В процессе разработки 'из избранного' ")
    @DisplayName("Удаление лота из избранного")
    @Description("Проверяет удаление лота из избранного через корзину")
    @Test
    void checkFavoriteLotKt() {
        basketPage.deleteFavorites();
    }

    @Disabled("В процессе разработки 'в избранное'")
    @DisplayName("Добавление лота в избранное")
    @Description("Проверяет добавление лота в избранное из корзины")
    @Test
    void checkFavorites() {
        basketPage.addInFavoritesFromBasket();
    }
}

