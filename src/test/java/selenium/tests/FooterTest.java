package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.components.FeedBackForm;
import selenium.core.BaseTest;
import selenium.pages.FooterPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс FooterTest")
public class FooterTest extends BaseTest {

    FooterPage footer = new FooterPage();
    FeedBackForm feedBackForm = new FeedBackForm();

    @DisplayName("Одежда и аксессуары блок Каталог товаров")
    @Description("Проверяет переход на страницу одежда и аксессуары из футера")
    @Test
    public void checkClothing() {
        footer.clickClothing();
    }

    @DisplayName("Красота и здоровье блок Каталог товаров")
    @Description("Проверяет переход на страницу красота и здоровье из футера")
    @Test
    public void checkBeauty() {
        footer.clickBeauty();
    }

    @DisplayName("Товары для дома блок Каталог товаров")
    @Description("Проверяет переход на страницу товары для дома из футера")
    @Test
    public void checkProductHome() {
        footer.clickProductHome();
    }

    @DisplayName("Товары для кухни блок Каталог товаров")
    @Description("Проверяет переход на страницу товары для кухни из футера")
    @Test
    public void checkProductKitchen() {
        footer.clickProductKitchen();
    }

    @DisplayName("Обувь блок Каталог товаров")
    @Description("Проверяет переход на страницу обувь из футера")
    @Test
    public void checkShoes() {
        footer.clickShoes();
    }

    @DisplayName("Украшения блок Каталог товаров")
    @Description("Проверяет переход на страницу украшения из футера")
    @Test
    public void checkDecoration() {
        footer.clickDecoration();
    }

    @DisplayName("Доставка и сервисный сбор блок Заказ")
    @Description("Проверяет переход на страницу доставка и сервисный сбор из футера")
    @Test
    public void checkDelivery() {
        footer.clickDelivery();
    }

    @DisplayName("Оплата блок Заказ")
    @Description("Проверяет переход на страницу оплата из футера")
    @Test
    public void checkPayment() {
        footer.clickPayment();
    }

    @DisplayName("Возврат блок Заказ")
    @Description("Проверяет переход на страницу возврат из футера")
    @Test
    public void checkRefund() {
        footer.clickRefund();
    }

    @DisplayName("Помощь блок Заказ")
    @Description("Проверяет переход на страницу помощь из футера")
    @Test
    public void checkHelp() {
        footer.clickHelp();
    }

    @DisplayName("Правила акций блок Заказ")
    @Description("Проверяет переход на страницу правила акций из футера")
    @Test
    public void checkRules() {
        footer.clickRules();
    }

    @DisplayName("Рассрочка Халва блок Заказ")
    @Description("Проверяет переход на страницу рассрочки халва из футера")
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

    @DisplayName("Прямой эфир блок LEOMAX")
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

    @DisplayName("Обратная связь блок LEOMAX")
    @Description("Проверяет заполнение формы обратная связь из футера")
    @Test
    public void checkForm() {
        feedBackForm.fillingForm();
    }

    @DisplayName("Партнерская программа блок LEOMAX")
    @Description("Проверяет переход на страницу партнерская программа из футера")
    @Test
    public void checkPartner() {
        footer.clickPartner();
    }

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
