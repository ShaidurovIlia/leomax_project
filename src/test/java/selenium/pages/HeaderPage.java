package selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.readProperties.ConfigProvider;

public class HeaderPage extends BasePage {
    private static final String ACTION_TITLE = "Акции и скидки телемагазина LEOMAX";
    private static final String BRAND_TITLE = "Бренды | Интернет-магазин LEOMAX";
    private static final String TELECAST_TITLE = "Онлайн ТВ";
    private static final String ADVERTISING_TITLE = "Самые продаваемые товары от Леомакс | Leomax";
    private static final String COLLECTION_TITLE = "Новая коллекция";
    @FindBy(css = "a.bottom-header__link[href='/action/']")
    private WebElement action;
    @FindBy(css = "a.bottom-header__link[href='/brand/']")
    private WebElement brand;
    @FindBy(css = "a.bottom-header__link[href='/telecast/']")
    private WebElement telecast;
    @FindBy(css = "a.bottom-header__link[href='/products/tovary_leomax/']")
    private WebElement advertising;
    @FindBy(css = "a.bottom-header__link.bottom-header__link-liquidation")
    private WebElement collection;
    @FindBy(css = "input.ac_input[name='q']")
    private WebElement search;
    @FindBy(css = "div.digi-product__label [target='_blank']")
    private WebElement cat;
    @FindBy(css = "div.digi-product__buy")
    private WebElement orderClick;
    @FindBy(css = "label[data-toggle='tooltip'][for='product_2848657Абисс']")
    private WebElement orderCatPhoto;
    @FindBy(css = "div.sizes-radio")
    private WebElement size;
    @FindBy(css = "div.short-good-descr__btn-group")
    private WebElement buy;
    @FindBy(css = "div.cart.dropdownBasket")
    private WebElement basket;

    public HeaderPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void clickActions() {
        checkPageTitle(action, ACTION_TITLE);
    }

    public void clickBrands() {
        checkPageTitle(brand, BRAND_TITLE);
    }

    public void clickTelecast() {
        checkPageTitle(telecast, TELECAST_TITLE);
    }

    public void clickAdvertising() {
        checkPageTitle(advertising, ADVERTISING_TITLE);
    }

    public void clickCollection() {
        checkPageTitle(collection, COLLECTION_TITLE);
    }

    private void checkPageTitle(WebElement element, String expectedTitle) {
        element.click();
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(actualTitle, expectedTitle);
    }

    public void checkProductInBasket() {
        search.click();
        search.sendKeys("Игрушка-антистресс 'Котик'");
        search.sendKeys(Keys.ENTER);
        orderClick.click();
        orderCatPhoto.click();
        size.click();
        buy.click();
        basket.click();
        WebElement cartItem = driver.findElement(By.cssSelector("a[href*='/goods/igrushka_antistress_kotik/'] p.basket-item__title"));
        Assertions.assertTrue(cartItem.isDisplayed());
    }
}
