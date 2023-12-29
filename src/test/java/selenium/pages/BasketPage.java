package selenium.pages;

import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.readProperties.ConfigProvider;

import java.time.Duration;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс BasketPage")
public class BasketPage extends BasePage {

    private static final String SEARCH_PRODUCT = "Жидкая резина 'Фикс Про 3 в 1'";
    private static final String MSK_NEW_NUMBER = "77290882013400";
    private static final String MSK_OLD_NUMBER = "7728026000305";
    private static final String WRONG_MSK_OLD_NUMBER = "1111111111111";
    private static final String WRONG_MSK_NEW_NUMBER = "11111111111111";
    private static final String MSK_OLD_SERIES = "032504";
    private static final String MNOGORU_NUMBER = "66666666";
    private static final String PROMO = "Соцкарта";
    private static final String WRONG_PROMO = "Тест";
    private static final String NAME = "Тест";
    private static final String MOBILE = "0000000000";
    @FindBy(css = "input.ac_input[name='q']")
    private WebElement search;
    @FindBy(css = ".digi-product:first-child .digi-product__buy .digi-product-buy-btn a")
    private WebElement orderClick;
    @FindBy(css = "label[for='product_2227694белый, 1 шт + 1 шт в подарок']")
    private WebElement size;
    @FindBy(css = "div.short-good-descr__btn-group")
    private WebElement buy;
    @FindBy(css = "div.cart.dropdownBasket")
    private WebElement basket;
    @FindBy(css = "a[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/'] .basket-item__title")
    private WebElement productInBasket;
    @FindBy(css = ".coupon__label-text")
    private WebElement promo;
    @FindBy(css = "#coupon")
    private WebElement promoMessage;
    @FindBy(css = "button[onclick='App.basket.cancelCoupon(); return false;']")
    private WebElement promoApplied;
    @FindBy(css = ".social-card-applied .btn-deactivate")
    private WebElement cardApplied;
    @FindBy(css = ".mnogoru-card__cancel")
    private WebElement mnogoApplied;
    @FindBy(css = "a.btn-fast-checkout[href='/order/make/']")
    private WebElement fastOrder;
    @FindBy(css = ".col-xs-7")
    private WebElement previewOrder;
    @FindBy(css = "#PERSONAL_NAME")
    private WebElement formName;
    @FindBy(css = "#PERSONAL_MOBILE")
    private WebElement formMobile;
    @FindBy(css = " .btn.btn-primary.js_order_in_click_confirm")
    private WebElement order;
    @FindBy(css = ".social-card__label-text")
    private WebElement socialCard;
    @FindBy(css = "#social-card")
    private WebElement socialCardNumber;
    @FindBy(css = "#social-card-series")
    private WebElement socialCardSeries;
    @FindBy(css = ".basket-buttons.social-card__submit")
    private WebElement okay;
    @FindBy(css = "#MnogoRuForm")
    private WebElement mnogoBox;
    @FindBy(css = "#mnogoru")
    private WebElement mnogoInput;
    @FindBy(css = "div.input-group.quantity-group #quantity_10004618")
    private WebElement quantity;
    @FindBy(css = "div.basket p.alert.alert-danger.error.error-prepare")
    private WebElement alert;
    @FindBy(css = ".coupon__error")
    private WebElement wrongPromoTitle;
    @FindBy(css = ".social-card__error")
    private WebElement wrongMscTitle;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

    public BasketPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void searchProductAndAddToBasket() {
        addToBasket();
        Assertions.assertTrue(productInBasket.isDisplayed());
    }

    public void promoInBasket() {
        addToBasket();
        promo.click();
        promoMessage.sendKeys(PROMO + Keys.RETURN);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(promoApplied));

        Assertions.assertTrue(promoApplied.isDisplayed());
    }

    public void wrongPromoInBasket() {
        addToBasket();
        promo.click();
        promoMessage.sendKeys(WRONG_PROMO + Keys.RETURN);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(wrongPromoTitle));

        Assertions.assertTrue(wrongPromoTitle.isDisplayed());
    }

    public void fastOrderInBasket() {
        addToBasket();
        fastOrder.click();
        formName.sendKeys(NAME);
        formMobile.sendKeys(MOBILE);
        order.click();

        Assertions.assertTrue(previewOrder.isDisplayed());
    }

    public void newMoscowCardInBasket() {
        addToBasket();
        socialCard.click();
        socialCardNumber.sendKeys(MSK_NEW_NUMBER, Keys.RETURN);

        wait.until(ExpectedConditions.visibilityOf(cardApplied));

        Assertions.assertTrue(cardApplied.isDisplayed());
    }

    public void oldMoscowCardInBasket() {
        addToBasket();
        socialCard.click();
        socialCardNumber.sendKeys(MSK_OLD_NUMBER);
        socialCardSeries.sendKeys(MSK_OLD_SERIES, Keys.RETURN);

        wait.until(ExpectedConditions.visibilityOf(cardApplied));

        Assertions.assertTrue(cardApplied.isDisplayed());
    }

    public void wrongOldMoscowCardInBasket() {
        addToBasket();
        socialCard.click();
        socialCardNumber.sendKeys(WRONG_MSK_OLD_NUMBER);
        socialCardSeries.sendKeys(MSK_OLD_SERIES, Keys.RETURN);

        wait.until(ExpectedConditions.visibilityOf(wrongMscTitle));

        Assertions.assertTrue(wrongMscTitle.isDisplayed());
    }

    public void wrongNewMoscowCardInBasket() {
        addToBasket();
        socialCard.click();
        socialCardNumber.sendKeys(WRONG_MSK_NEW_NUMBER, Keys.RETURN);

        wait.until(ExpectedConditions.visibilityOf(wrongMscTitle));

        Assertions.assertTrue(wrongMscTitle.isDisplayed());
    }

    public void mnogoRuCardInBasket() {
        addToBasket();
        mnogoBox.click();
        mnogoInput.sendKeys(MNOGORU_NUMBER, Keys.RETURN);

        wait.until(ExpectedConditions.visibilityOf(mnogoApplied));

        Assertions.assertTrue(mnogoApplied.isDisplayed());
    }

    /*    public void maxQuantityProductInBasket() {
            addToBasket();
            wait.until(ExpectedConditions.visibilityOf(quantity));
            quantity.click();
            quantity.sendKeys("16", Keys.RETURN);
            wait.until(ExpectedConditions.visibilityOf(alert));
            Assertions.assertTrue(alert.isDisplayed());
        }*/

    @Step
    public void addToBasket() {
        search.click();
        search.sendKeys(SEARCH_PRODUCT + Keys.RETURN);
        orderClick.click();
        size.click();
        buy.click();
        basket.click();
    }
}
