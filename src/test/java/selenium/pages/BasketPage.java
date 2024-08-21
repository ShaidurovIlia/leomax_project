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

import static io.qameta.allure.Allure.step;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс BasketPage")
public class BasketPage extends BasePage {

    private static final String RELATIVE_URL = "goods/zhidkaya_rezina_fiks_pro_3_v_1/?COLOR_GROUP=2309467";
    private static final String MNOGORU_NUMBER = "66666666";
    private static final String PROMO = "Соцкарта";
    private static final String NAME = "Тест";
    private static final String MOBILE = "0000000000";
    private static final String DELETE_BASKET = "Ваша корзина пуста. Наполните её товарами из нашего интернет-магазина ;)";

    @FindBy(css = ".js_buy_button.btn-buy-detail")
    private WebElement addToBasketIsKT;
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
    @FindBy(css = ".confirm h1")
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
    @FindBy(css = ".col-sm-6 div.item-label-block-favorite")
    private WebElement favoritesIcon;
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
    @FindBy(css = ".btn.btn-sm.btn-primary")
    private WebElement deleteFavoritesElement;
    @FindBy(css = ".favorites_wrap .js-empty")
    private WebElement checkEmpty;
    @FindBy(css = ".header__menu-count.header__menu-count--favorites")
    private WebElement count;
    @FindBy(css = ".ExchangeBanner-close.js-close")
    private WebElement bannerClause;
    @FindBy(css = ".popup__btn--disagree.js-disagree")
    private WebElement clauseApply;

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

    public void openUrl(String relativeUrl) {
        driver.get(ConfigProvider.URL + relativeUrl);
    }

    private void scrollPageDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(200, document.body.scrollHeight)");
    }

    private void orderButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", fastOrder);
    }

    public void validPromo() {
        addToBasket();
        step("Кликаем на форму для ввода промокода", () -> {
            wait.until(ExpectedConditions.elementToBeClickable(promoField));
            promoField.click();
        });
        step("Вводим валидный промокод", () -> {
            promoInput.sendKeys(PROMO + Keys.ENTER);
        });
        step("Проверяем наличие сообщения о применении промокода", () -> {
            wait.until(ExpectedConditions.visibilityOf(promoMessage));
            Assertions.assertTrue(promoMessage.isDisplayed());
        });
    }

    public void addToBasket() {
        step("Открываем нужный URL", () -> openUrl(RELATIVE_URL));
        step("Кликаем на кнопку добавить в корзину", () -> addToBasketIsKT.click());
        step("Ожидаем когда элемент корзина станет кликабельным", () -> {
            wait.until(ExpectedConditions.elementToBeClickable(basket));
        });
        step("Кликаем на корзину", () -> basket.click());
    }

    public void fastOrderInBasket() {
        addToBasket();
        scrollPageDown();
        step("Кликаем на кнопку Быстрый заказ", () -> orderButton());
        step("Заполняем поле Имя", () -> formNameInput.sendKeys(NAME));
        step("Заполняем поле Телефон", () -> formMobileInput.sendKeys(MOBILE));
        step("Кликаем на кнопку Оформить заказ", () -> order.click());
        wait.until(ExpectedConditions.elementToBeClickable(bannerClause));
        bannerClause.click();
        wait.until(ExpectedConditions.elementToBeClickable(clauseApply));
        clauseApply.click();
        wait.until(ExpectedConditions.invisibilityOf(previewOrder));
        Assertions.assertTrue(previewOrder.isDisplayed());
    }

    public void mnogoRuCardInBasket() {
        addToBasket();
        scrollPageDown();
        step("Кликаем на форму для ввода кода много.ру", () -> mnogoBox.click());
        step("Вводим валидный код", () -> mnogoInput.sendKeys(MNOGORU_NUMBER, Keys.RETURN));
        step("Проверяем наличие сообщения о применении промокода", () -> {
            wait.until(ExpectedConditions.visibilityOf(mnogoApplied));
            Assertions.assertTrue(mnogoApplied.isDisplayed());
        });
    }

    public void deleteFromBasket() {
        addToBasket();
        step("Кликаем на очистку корзины", () -> {
            wait.until(ExpectedConditions.elementToBeClickable(deleteBasket));
            deleteBasket.click();
        });
        wait.until(ExpectedConditions.visibilityOf(basketEmpty));
        step("Проверяем наличие сообщения о пустой корзине", () -> {
            String actualText = basketTitle.getText();
            Assertions.assertEquals(DELETE_BASKET, actualText);
        });
    }

    public void addInFavoritesFromBasket() {
        addToBasket();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("td a[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/']")));
        addFavorites.click();
        wait.until(ExpectedConditions.elementToBeClickable(count));
        wait.until(ExpectedConditions.textToBePresentInElement(count, "1"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.header li a[href='/personal/favorites/']")));
        favorites.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("a.title[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/?COLOR_GROUP=2309467']")));
        Assertions.assertTrue(checkProduct.isDisplayed());
    }

    public void addInFavorites() {
        step("Переходим в КТ лота", () -> openUrl(RELATIVE_URL));
        step("Кликаем на сердечко", () -> favoritesIcon.click());
        step("Кликаем на таб избранное", () -> {
            wait.until(ExpectedConditions.elementToBeClickable(favorites));
            favorites.click();
        });
        step("Проверяем наличие добавленного лота в избранном",
                () -> Assertions.assertTrue(checkProduct.isDisplayed()));
    }

    public void deleteFavorites() {
        addInFavoritesFromBasket();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".btn.btn-sm.btn-primary")));
        deleteFavoritesElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(checkEmpty));
        Assertions.assertTrue(checkEmpty.isDisplayed());
    }
}

