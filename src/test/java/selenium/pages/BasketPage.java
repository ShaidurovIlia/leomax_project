package selenium.pages;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.readProperties.ConfigProvider;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс BasketPage")
public class BasketPage extends BasePage {

    private static final String SEARCH_PRODUCT = "102640-13";
    private static final String MSK_NEW_NUMBER = "77290882013400";
    private static final String MSK_OLD_NUMBER = "7728026000305";
    private static final String MSK_OLD_SERIES = "032504";
    private static final String MNOGORU_NUMBER = "66666666";
    private static final String PROMO = "Соцкарта";
    private static final String WRONG_PROMO = "Тест";
    private static final String NAME = "Тест";
    private static final String MOBILE = "0000000000";
    private static final String WRONG_MSK_OLD_NUMBER = "1111111111111";
    private static final String WRONG_MSK_NEW_NUMBER = "11111111111111";
    @FindBy(css = "input.ac_input[name='q']")
    private WebElement search;
    @FindBy(css = ".digi-product:first-child .digi-product__buy .digi-product-buy-btn a")
    private WebElement orderClick;
    @FindBy(css = "label[for='product_2227694белый, 1 шт + 1 шт в подарок']")
    private WebElement size;
    @FindBy(css = "div.short-good-descr__btn-group")
    private WebElement buy;
    @FindBy(css = "div.cart.dropdownBasket span.header__menu-text")
    private WebElement basket;
    @FindBy(css = "a[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/'] .basket-item__title")
    private WebElement productInBasket;
    @FindBy(css = ".coupon__label-text")
    private WebElement promoBlock;
    @FindBy(css = "button.btn-deactivate")
    private WebElement promoDeactivate;
    @FindBy(css = "#coupon")
    private WebElement promoField;
    @FindBy(css = ".social-card-applied .btn-deactivate")
    private WebElement cardApplied;
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
    @FindBy(css = ".message-successful")
    private WebElement descriptionApplyPromo;
    @FindBy(css = "td .btn.btn-href.btn-favorite")
    private WebElement addFavorites;
    @FindBy(css = "div.header li a[href='/personal/favorites/']")
    private WebElement favorites;
    @FindBy(css = "a.title[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/?COLOR_GROUP=2309467']")
    private WebElement checkProduct;
    @FindBy(css = ".icon.icon-close")
    private WebElement deleteBasket;
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

    public void searchProductAndAddToBasket() {
        addToBasket();
        Assertions.assertTrue(productInBasket.isDisplayed());
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public BasketPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void newMoscowCardInBasket() {
        applySocialCardToBasket(MSK_NEW_NUMBER, null, cardApplied);
    }

    public void oldMoscowCardInBasket() {
        applySocialCardToBasket(MSK_OLD_NUMBER, MSK_OLD_SERIES, cardApplied);
    }

    public void wrongOldMoscowCardInBasket() {
        applySocialCardToBasket(WRONG_MSK_OLD_NUMBER, MSK_OLD_SERIES, wrongMscTitle);
    }

    public void wrongNewMoscowCardInBasket() {
        applySocialCardToBasket(WRONG_MSK_NEW_NUMBER, null, wrongMscTitle);
    }

    public void validPromo() {
        applyPromoInBasket(PROMO, promoField, descriptionApplyPromo);
    }

    public void noValidPromo() {
        applyPromoInBasket(WRONG_PROMO, promoField, descriptionWrongPromo);
    }

    public void addToBasket() {
        search.click();
        search.sendKeys(SEARCH_PRODUCT + Keys.RETURN);
        wait.until(ExpectedConditions.elementToBeClickable(orderClick));
        orderClick.click();
        size.click();
        buy.click();
        wait.until(ExpectedConditions.elementToBeClickable(basket));
        basket.click();
    }

    public void fastOrderInBasket() {
        addToBasket();
        fastOrder.click();
        formNameInput.sendKeys(NAME);
        formMobileInput.sendKeys(MOBILE);
        order.click();

        Assertions.assertTrue(previewOrder.isDisplayed());
    }

    public void mnogoRuCardInBasket() {
        addToBasket();
        mnogoBox.click();
        mnogoInput.sendKeys(MNOGORU_NUMBER, Keys.RETURN);

        wait.until(ExpectedConditions.visibilityOf(mnogoApplied));

        Assertions.assertTrue(mnogoApplied.isDisplayed());
    }

    public void deleteFromBasket() {
        addToBasket();
        Actions actions = new Actions(driver);
        actions.doubleClick(deleteBasket).perform();
        wait.until(ExpectedConditions.visibilityOf(checkEmptyBasket));
        Assertions.assertTrue(checkEmptyBasket.isDisplayed());
    }

    public void addInFavorites() {
        addToBasket();
        Actions actions = new Actions(driver);
        actions.doubleClick(addFavorites).perform();
        wait.until(ExpectedConditions.elementToBeClickable(favorites));
        favorites.click();
        Assertions.assertTrue(checkProduct.isDisplayed());
    }

    public void applySocialCardToBasket(String cardNumber, String cardSeries, WebElement message) {
        addToBasket();

        List<WebElement> socialCards = findVisibleSocialCardsElements();

        socialCards.stream()
                .findFirst()
                .ifPresent(socialCard -> {
                    socialCard.click();
                    socialCardNumber.sendKeys(cardNumber);

                    if (cardSeries != null) {
                        socialCardSeries.sendKeys(cardSeries, Keys.RETURN);
                    } else {
                        socialCardNumber.sendKeys(Keys.RETURN);
                    }

                    wait.until(ExpectedConditions.visibilityOf(message));
                    Assertions.assertTrue(message.isDisplayed());
                });
    }

    public void applyPromoInBasket(String promoCoup, WebElement promoLocator, WebElement promoMessage) {
        addToBasket();

        WebElement promoCodeInput = findVisiblePromoElements().stream()
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No visible promo code found."));
        promoCodeInput.click();

        if (promoLocator != null) {
            promoLocator.sendKeys(promoCoup, Keys.RETURN);
            wait.until(ExpectedConditions.visibilityOf(promoMessage));
            Assertions.assertTrue(promoMessage.isDisplayed());
        } else {
            throw new NoSuchElementException("No visible element for promo apply.");
        }
    }

    private List<WebElement> findVisibleSocialCardsElements() {
        if (socialCardField.isDisplayed()) {
            return List.of(socialCardField);
        } else if (socialCardDeactivate.isDisplayed()) {
            return List.of(socialCardDeactivate);
        } else {
            throw new NoSuchElementException("No visible social cards found.");
        }
    }

    private List<WebElement> findVisiblePromoElements() {
        List<WebElement> visiblePromoElements = Stream.of(promoBlock, promoDeactivate)
                .filter(WebElement::isDisplayed)
                .collect(Collectors.toList());

        if (visiblePromoElements.isEmpty()) {
            throw new NoSuchElementException("No visible promo elements found.");
        }

        return visiblePromoElements;
    }

    public void deleteFavorites() {
        addInFavorites();
        deleteFavoritesElement.click();
        Assertions.assertTrue(checkEmpty.isDisplayed());
    }
}

