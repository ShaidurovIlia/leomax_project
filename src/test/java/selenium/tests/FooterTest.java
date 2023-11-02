package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.FooterPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс FooterTest")
public class FooterTest extends BaseTest {

    FooterPage footer = new FooterPage();

    @DisplayName("Одежда и аксессуары")
    @Description("Проверяет переход на страницу одежда и аксессуары из футера")
    @Test
    public void checkClothing() {
        footer.clickClothing();
    }

    @DisplayName("Красота и здоровье")
    @Description("Проверяет переход на страницу красота и здоровье из футера")
    @Test
    public void checkBeauty() {
        footer.clickBeauty();
    }

    @DisplayName("Товары для дома")
    @Description("Проверяет переход на страницу товары для дома из футера")
    @Test
    public void checkProductHome() {
        footer.clickProductHome();
    }

    @DisplayName("Товары для кухни")
    @Description("Проверяет переход на страницу товары для кухни из футера")
    @Test
    public void checkProductKitchen() {
        footer.clickProductKitchen();
    }

    @DisplayName("Обувь")
    @Description("Проверяет переход на страницу обувь из футера")
    @Test
    public void checkShoes() {
        footer.clickShoes();
    }

    @DisplayName("Украшения")
    @Description("Проверяет переход на страницу украшения из футера")
    @Test
    public void checkDecoration() {
        footer.clickDecoration();
    }

    @DisplayName("Доставка и сервисный сбор")
    @Description("Проверяет переход на страницу доставка и сервисный сбор из футера")
    @Test
    public void checkDelivery() {
        footer.clickDelivery();
    }

    @DisplayName("Оплата")
    @Description("Проверяет переход на страницу оплата из футера")
    @Test
    public void checkPayment() {
        footer.clickPayment();
    }

    @DisplayName("Возврат")
    @Description("Проверяет переход на страницу возврат из футера")
    @Test
    public void checkRefund() {
        footer.clickRefund();
    }

    @DisplayName("Помощь")
    @Description("Проверяет переход на страницу помощь из футера")
    @Test
    public void checkHelp() {
        footer.clickHelp();
    }

    @DisplayName("Правила акций")
    @Description("Проверяет переход на страницу правила акций из футера")
    @Test
    public void checkRules() {
        footer.clickRules();
    }

    @DisplayName("Халва")
    @Description("Проверяет переход на страницу рассрочка халва из футера")
    @Test
    public void checkHalva() {
        footer.clickHalva();
    }

    @DisplayName("Акции блок LEOMAX")
    @Description("Проверяет переход на страницу акции из футера")
    @Test
    public void checkAction() {
        footer.clickAction();
    }

    @DisplayName("Бренды блок LEOMAX")
    @Description("Проверяет переход на страницу бренды из футера")
    @Test
    public void checkBrand() {
        footer.clickBrand();
    }

    @DisplayName("Отзывы о товарах блок LEOMAX")
    @Description("Проверяет переход на страницу отзывы о товарах из футера")
    @Test
    public void checkReviews() {
        footer.clickReviews();
    }

    @DisplayName("Прямой эфир")
    @Description("Проверяет переход на страницу прямой эфир из футера")
    @Test
    public void checkTelecast() {
        footer.clickTelecast();
    }

    @DisplayName("Личный кабинет блок LEOMAX")
    @Description("Проверяет переход на страницу личный кабинет из футера")
    @Test
    public void checkPersonal() {
        footer.clickPersonal();
    }

       /*"тут должен быть тест на Обратную связь ,
     заполнить форму"*/


/*  Подумать как сделать  так как переходит на новую страницу
 @DisplayName("Партнерская программа")
    @Description("Проверяет переход на страницу партнерская программа из футера")
    @Test
    public void checkPartner() {
        footer.clickPartner();
    }*/

    @DisplayName("О канале блок Информация")
    @Description("Проверяет переход на страницу о канале из футера")
    @Test
    public void checkChannel() {
        footer.clickChannel();
    }

    @DisplayName("Контакты блок Информация")
    @Description("Проверяет переход на страницу контакты из футера")
    @Test
    public void checkСontact() {
        footer.clickContact();
    }

    @DisplayName("Leomax Bonus блок Информация")
    @Description("Проверяет переход на страницу leomax bonus из футера")
    @Test
    public void checkBonus() {
        footer.clickBonus();
    }

    @DisplayName("Поставщикам блок Информация")
    @Description("Проверяет переход на страницу поставщикам из футера")
    @Test
    public void checkProvider() {
        footer.clickProvider();
    }

    @DisplayName("ТВ-провайдерам блок Информация")
    @Description("Проверяет переход на страницу тв-провайдерам из футера")
    @Test
    public void checkTvProvider() {
        footer.clickTvProvider();
    }

    @DisplayName("Объединение сайтов блок Информация")
    @Description("Проверяет переход на страницу объединение сайтов из футера")
    @Test
    public void checkWebsite() {
        footer.clickWebSite();
    }

    @DisplayName("Бонусы Много.ру блок Информация")
    @Description("Проверяет переход на страницу бонусы Много.ру из футера")
    @Test
    public void checkMnogoBonus() {
        footer.clickMnogoBonus();
    }

}
