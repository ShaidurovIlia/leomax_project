package selenide.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {
    private static final String ACTION_TITLE = "Акции и скидки телемагазина LEOMAX";
    private static final String BRAND_TITLE = "Бренды | Интернет-магазин LEOMAX";
    private static final String TELECAST_TITLE = "Онлайн ТВ";
    private static final String ADVERTISING_TITLE = "Самые продаваемые товары от Леомакс | Leomax";
    private static final String COLLECTION_TITLE = "Новая коллекция";
    @FindBy(css = "a.bottom-header__link[href='/action/']")
    private WebElement action;
    @FindBy(css= "a.bottom-header__link[href='/brand/']")
    private WebElement brand;
    @FindBy(css = "a.bottom-header__link[href='/telecast/']")
    private WebElement telecast;
    @FindBy(css ="a.bottom-header__link[href='/products/tovary_leomax/']")
    private WebElement advertising;
    @FindBy(css = "a.bottom-header__link.bottom-header__link-liquidation")
    private WebElement collection;

    /**
     * переделать MainPageSelenium на конфиг файл и в нем реализовать чтение URL
     */
    public HeaderPage() {
        driver.get("https://www.leomax.ru/");
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
}
