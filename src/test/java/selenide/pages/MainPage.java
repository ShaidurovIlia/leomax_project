package selenide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private static final String NAME = "test";
    private static final String MOBILE = "0000000000";
    private static final String EXPECTED_WORD = "Спасибо за Ваш заказ!";
    private final SelenideElement bannerCarousel =
            $x("(//li[@role='presentation' and contains(@class, '')])[2]");
    private final SelenideElement bannerOne = $x("//button[contains(text(), 'Заказать в 1 клик')]");
    private final SelenideElement personalColor = $("#product_2865375Белый");
    private final SelenideElement personalSize = $("label[for='size_36']");
    private final SelenideElement view = $x("//input[@id='PERSONAL_NAME']");
    private final SelenideElement personalMobile = $x("//input[@id='PERSONAL_MOBILE']");
    private final SelenideElement order = $x("//button[text()='Оформить заказ']");
    private final SelenideElement status = $x("//h3[text()='Спасибо за Ваш заказ!']");


    private final SelenideElement search = $x(
            "//button[@class='col-search--xs header-mobile__button header-mobile__button--search']");
    private final SelenideElement product = $x("//div[@class='digi-product']");
    private final SelenideElement fastOrder = $x("//button[@class='btn btn-primary js_order_in_click_card']");

    public void clickCarousel() {
        bannerCarousel.click();
        bannerOne.click();
//        order.shouldBe(Condition.visible);
        personalColor.click();
        personalSize.click();
        view.setValue(NAME);
        personalMobile.setValue(MOBILE);
        order.click();
        status.shouldHave(text(EXPECTED_WORD));
    }

    public void searchFastOrder() {
        search.click();
        search.setValue("Складная стиральная машинка Мини Автомат").pressEnter();
        product.click();
        view.setValue(NAME);
        personalMobile.setValue(MOBILE);
        fastOrder.click();
        status.shouldHave(text(EXPECTED_WORD));
    }


}
