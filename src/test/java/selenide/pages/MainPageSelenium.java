package selenide.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageSelenium extends BaseSeleniumPage {
    private static final String ACTION = "Акции и скидки телемагазина LEOMAX";
    private static final String BRAND = "Бренды | Интернет-магазин LEOMAX";
    private static final String TELECAST = "Онлайн ТВ";

    private static final String ADVERSTISING = "Самые продаваемые товары от Леомакс | Leomax";

    private static final String COLLECTION = "Новая коллекция";
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
    public MainPageSelenium() {
        driver.get("https://www.leomax.ru/");
        PageFactory.initElements(driver, this);
    }

    public void headersActions() {
        action.click();
        String title = driver.getTitle();
        Assertions.assertEquals(title, ACTION);
    }

    public void headerBrands() {
        brand.click();
        String title = driver.getTitle();
        Assertions.assertEquals(title, BRAND);
    }

    public void headerTelecast() {
        telecast.click();
        String title = driver.getTitle();
        Assertions.assertEquals(title, TELECAST);
    }

    public void headerAdvertising() {
        advertising.click();
        String title = driver.getTitle();
        Assertions.assertEquals(title, ADVERSTISING);
    }

    public void headerNewCollection() {
        collection.click();
        String title = driver.getTitle();
        Assertions.assertEquals(title, COLLECTION);
    }
}
