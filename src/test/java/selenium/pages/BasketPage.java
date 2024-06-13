package selenium.pages;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    private static final String SEARCH_PRODUCT = "102640-11";
    private static final String MNOGORU_NUMBER = "66666666";
    private static final String PROMO = "Соцкарта";
    private static final String NAME = "Тест";
    private static final String MOBILE = "0000000000";
    @FindBy(css = "input.ac_input[name='q']")
    private WebElement search;
    @FindBy(css = ".digi-product:first-child .digi-product__buy .digi-product-buy-btn a")
    private WebElement orderClick;
    @FindBy(css = "label[for='product_2227694белый, 1 шт + 1 шт в подарок']")
    private WebElement variant;
    @FindBy(css = "div.short-good-descr__btn-group")
    private WebElement addToBasket;
    @FindBy(css = "div.cart.dropdownBasket span.header__menu-text")
    private WebElement basket;
    @FindBy(css = "a[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/'] .basket-item__title")
    private WebElement productInBasket;
    @FindBy(css = "#CouponApply .coupon__label-container")
    private WebElement promoField;
    @FindBy(css = "#CouponCancel p.message-successful")
    private WebElement promoMessage;
    @FindBy(css = "#coupon.form-control")
    private WebElement promoInput;
    @FindBy(css = ".basket-buttons.coupon__submit")
    private WebElement promoClick;
    @FindBy(css = ".mnogoru-card__cancel")
    private WebElement mnogoApplied;
    @FindBy(css = "a.btn-fast-checkout[href='/order/make/']")
    private WebElement fastOrder;
    @FindBy(css = ".col-xs-7")
    private WebElement previewOrder;
    @FindBy(css = "#PERSONAL_NAME")
    private WebElement formNameInput;
    @FindBy(css = "#PERSONAL_MOBILE")
    private WebElement formMobileInput;
    @FindBy(css = ".btn.btn-primary.js_order_in_click_confirm")
    private WebElement order;
    @FindBy(css = "#social-card")
    private WebElement socialCardNumber;
    @FindBy(css = "#social-card-series")
    private WebElement socialCardSeries;
    @FindBy(css = ".mnogoru-card__label-container")
    private WebElement mnogoBox;
    @FindBy(css = "#mnogoru")
    private WebElement mnogoInput;
    @FindBy(css = ".coupon__reset")
    private WebElement descriptionWrongPromo;
    @FindBy(css = "#CouponCancel .message-successful")
    private WebElement descriptionApplyPromo;
    @FindBy(css = "td .btn.btn-href.btn-favorite")
    private WebElement addFavorites;
    @FindBy(css = "div.header li a[href='/personal/favorites/']")
    private WebElement favorites;
    @FindBy(css = "a.title[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/?COLOR_GROUP=2309467']")
    private WebElement checkProduct;
    @FindBy(css = ".trash-icon")
    private WebElement deleteBasket;
    @FindBy(css = ".basket-empty")
    private WebElement basketEmpty;
    @FindBy(css = ".basket-empty p")
    private WebElement basketTitle;
    @FindBy(css = "tr.restore-row td[colspan='6']")
    private WebElement checkEmptyBasket;
    @FindBy(css = ".social-card__label-text")
    private WebElement socialCardField;
    @FindBy(css = ".social-card-applied .btn-deactivate")
    private WebElement socialCardDeactivate;
    @FindBy(css = ".social-card-container .social-card__error")
    private WebElement wrongMscTitle;
    @FindBy(css = ".btn.btn-sm.btn-primary")
    private WebElement deleteFavoritesElement;
    @FindBy(css = "div.header li a[href='/personal/favorites/']")
    private WebElement favoritesElement;
    @FindBy(css = ".favorites_wrap .js-empty")
    private WebElement checkEmpty;
    @FindBy(css = ".header__menu-count.header__menu-count--favorites")
    private WebElement count;

    public void searchProductAndAddToBasket() {
        addToBasket();
        wait.until(ExpectedConditions.visibilityOf(productInBasket));
        Assertions.assertTrue(productInBasket.isDisplayed());
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public BasketPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    private void scrollPageDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void validPromo() {
        addToBasket();
        wait.until(ExpectedConditions.elementToBeClickable(promoField));

        promoField.click();
        promoInput.sendKeys(PROMO + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(promoMessage));
        Assertions.assertTrue(promoMessage.isDisplayed());
    }

    public void addToBasket() {
        search.sendKeys(SEARCH_PRODUCT);
        wait.until(ExpectedConditions.elementToBeClickable(orderClick));
        orderClick.click();
        wait.until(ExpectedConditions.elementToBeClickable(variant));
        variant.click();
        addToBasket.click();
        wait.until(ExpectedConditions.elementToBeClickable(basket));
        basket.click();
    }

    public void fastOrderInBasket() {
        addToBasket();
        scrollPageDown();
        wait.until(ExpectedConditions.elementToBeClickable(fastOrder));
        fastOrder.click();
        formNameInput.sendKeys(NAME);
        formMobileInput.sendKeys(MOBILE);
        order.click();

        Assertions.assertTrue(previewOrder.isDisplayed());
    }

    public void mnogoRuCardInBasket() {
        addToBasket();
        scrollPageDown();
        mnogoBox.click();
        mnogoInput.sendKeys(MNOGORU_NUMBER, Keys.RETURN);

        wait.until(ExpectedConditions.visibilityOf(mnogoApplied));

        Assertions.assertTrue(mnogoApplied.isDisplayed());
    }

    public void deleteFromBasket() {
        String expectedText = "Ваша корзина пуста. Наполните её товарами из нашего интернет-магазина ;)";
        addToBasket();
        wait.until(ExpectedConditions.elementToBeClickable(deleteBasket));
        deleteBasket.click();
        wait.until(ExpectedConditions.visibilityOf(basketEmpty));

        String actualText = basketTitle.getText();
        Assertions.assertEquals(expectedText, actualText);
    }

    public void addInFavorites() {
        addToBasket();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td a[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/']")));
        addFavorites.click();
        wait.until(ExpectedConditions.elementToBeClickable(count));
        wait.until(ExpectedConditions.textToBePresentInElement(count, "1"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.header li a[href='/personal/favorites/']")));
        favorites.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.title[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/?COLOR_GROUP=2309467']")));
        Assertions.assertTrue(checkProduct.isDisplayed());
    }

    public void deleteFavorites() {
        addInFavorites();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-sm.btn-primary")));
        deleteFavoritesElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(checkEmpty));
        Assertions.assertTrue(checkEmpty.isDisplayed());
    }
}

