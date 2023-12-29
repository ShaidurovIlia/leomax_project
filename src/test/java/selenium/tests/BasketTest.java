package selenium.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.BasketPage;

public class BasketTest extends BaseTest {

    BasketPage basketPage = new BasketPage();

    @DisplayName("Товар в корзине")
    @Description("Проверяет товар в корзине добавленный через поисковую строку")
    @Test
    void checkOrderBasket() {
        basketPage.searchProductAndAddToBasket();
    }

    @DisplayName("Промокод")
    @Description("Проверяет работу промокода в корзине")
    @Test
    void checkPromo() {
        basketPage.promoInBasket();
    }

    @DisplayName("Неверный промокод")
    @Description("Проверяет работу в случаи неверного промокода в корзине")
    @Test
    void checkWrongPromo() {
        basketPage.wrongPromoInBasket();
    }

    @DisplayName("Оформление быстрого заказа")
    @Description("Проверяет оформление быстрого заказа из корзины")
    @Test
    void checkFastOrder() {
        basketPage.fastOrderInBasket();
    }

    @DisplayName("Карта москвича новая")
    @Description("Проверяет работу карты москвича нового формата в корзине")
    @Test
    void checkNewMoscowCard() {
        basketPage.newMoscowCardInBasket();
    }

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
    }

    @DisplayName("Карта москвича старая")
    @Description("Проверяет работу карты москвича старого формата в корзине")
    @Test
    void checkOldMoscowCard() {
        basketPage.oldMoscowCardInBasket();
    }

    @DisplayName("Карта Много.ру")
    @Description("Проверяет работу карты Много.ру в корзине")
    @Test
    void checkMnogoRuCard() {
        basketPage.mnogoRuCardInBasket();
    }

 /* Доработать тест на проверку сообщения

  @DisplayName("Ограничение количества товаров")
=======
 /*   @DisplayName("Ограничение количества товаров")
>>>>>>> origin/master
    @Description("Проверяет наличие сообщения о превышении количества товаров в корзине")
    @Test
    void checkMaxProduct() {
        basketPage.maxQuantityProductInBasket();
    }*/
}