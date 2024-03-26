package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
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
    @Description("Проверяет лот в корзине добавленный через поисковую строку")
    @Test
    void checkOrderBasket() {
        basketPage.searchProductAndAddToBasket();
    }

    @DisplayName("Оформление быстрого заказа")
    @Description("Проверяет оформление быстрого заказа из корзины")
    @Test
    void checkFastOrder() {
        basketPage.fastOrderInBasket();
    }

    @DisplayName("Карта Много.ру")
    @Description("Проверяет работу карты Много.ру в корзине")
    @Test
    void checkMnogoRuCard() {
        basketPage.mnogoRuCardInBasket();
    }

    @DisplayName("Добавление лота в избранное")
    @Description("Проверяет добавление лота в избранное из корзины")
    @Test
    void checkFavorites() {
        basketPage.addInFavorites();
    }

    @DisplayName("Удаление лота из корзины")
    @Description("Проверяет удаление лота из корзины")
    @Test
    void checkEmptyBasket() {
        basketPage.deleteFromBasket();
    }

    @DisplayName("Удаление лота из избранного")
    @Description("Проверяет удаление лота из избранного через корзину")
    @Test
    void checkFavoriteLotKt() {
        basketPage.deleteFavorites();
    }
}
/*
    @DisplayName("Неверный промокод")
    @Description("Проверяет работу в случаи неверного промокода в корзине")
    @Test
    void checkPromoNoValid() {
        basketPage.noValidPromo();

    @DisplayName("Неверная карта москвича старая")
    @Description("Проверяет сообщение о неверной карте москвича старого формата в корзине")
    @Test
    void checkWrongOldMoscowCard() {
        basketPage.wrongOldMoscowCardInBasket();
    }

    @DisplayName("Неверная карта москвича новая")
    @Description("Проверяет сообщение о неверной карте москвича нового формата в корзине")
    @Test
    void checkWrongNewMoscowCard() {
        basketPage.wrongNewMoscowCardInBasket();
    }*/


