package selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.readProperties.ConfigProvider;

public class CatalogPage extends BasePage {

    private static final String CLOTHING_TITLE = "Купить верхнюю одежду в интернет-магазине Леомакс";
    private static final String JACKET_TITLE = "Мужские куртки купить от руб в интернет-магазине Леомакс";
    private static final String HEADDRESS_TITLE = "Головные уборы купить недорого в интернет-магазине Леомакс";
    private static final String HEALTHY_EATING_TITLE = "Товары для здорового питания купить в интернет-магазине Леомакс";
    private static final String TEXTILE_TITLE = "Текстиль для дома купить в интернет-магазине Леомакс";
    private static final String KITCHEN_TITLE = "Техника для кухни купить в интернет-магазине Леомакс";
    private static final String HOME_SHOES = "Домашняя обувь купить в интернет-магазине Леомакс";
    private static final String BIJOUTERIE_TITLE = "Бижутерия купить в интернет-магазине Леомакс";
    private static final String LIQUIDATION_TITLE = "Ликвидация";
    @FindBy(css = "div.header .header__catalog-button")
    public WebElement catalog;
    @FindBy(css = "a.menu-desktop__title[href='/products/jenskaya_odejda/']")
    public WebElement womenClothing;
    @FindBy(css = "li [data-section-id] a[href='/products/verkhnyaya_odezhda/']")
    public WebElement clothCatalog;
    @FindBy(css = "a.menu-desktop__title[href='/products/mujskaya_odejda/']")
    public WebElement menClothing;
    @FindBy(css = "li[data-section-id] a[href='/products/kurtki_mujskie/']")
    public WebElement menJacket;
    @FindBy(css = "a.menu-desktop__title[href='/products/aksessuary/']")
    public WebElement accessory;
    @FindBy(css = "li[data-section-id] a[href='/products/golovnye_ubory/']")
    public WebElement headdress;
    @FindBy(css = "a.menu-desktop__title[href='/products/krasota_i_zdorove/']")
    public WebElement beautyHealth;
    @FindBy(css = "li[data-section-id] a[href='/products/zdorovoe_pitanie/']")
    public WebElement healthyEating;
    @FindBy(css = "a.menu-desktop__title[href='/products/tovary_dlya_doma_dachi_i_otdyha/']")
    public WebElement homeProduct;
    @FindBy(css = "li [data-section-id] a[href='/products/tekstil/']")
    public WebElement textile;
    @FindBy(css = "a.menu-desktop__title[href='/products/tovary_dlya_kuhni/']")
    public WebElement kitchenProduct;
    @FindBy(css = "li [data-section-id] a[href='/products/tehnika_dlya_kuhni/']")
    public WebElement techniqueKitchen;
    @FindBy(css = "a.menu-desktop__title[href='/products/obuv/']")
    public WebElement shoes;
    @FindBy(css = "li[data-section-id] a[href='/products/domashnyaya_obuv/']")
    public WebElement homeShoes;
    @FindBy(css = "a.menu-desktop__title[href='/products/ukrasheniya/']")
    public WebElement decorations;
    @FindBy(css = "li[data-section-id] a[href='/products/bijuteriya/']")
    public WebElement bijouterie;
    @FindBy(css = "a.menu-desktop__title[href='/action/likvidaciya/']")
    public WebElement liquidation;
    @FindBy(css = "li[data-section-id] a[href='/products/obuv/action/likvidaciya/']")
    public WebElement liquidationShoes;


    public CatalogPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void searchWomenClothing() {
        navigateToCategory(womenClothing, clothCatalog, CLOTHING_TITLE);
    }

    public void searchMenClothing() {
        navigateToCategory(menClothing, menJacket, JACKET_TITLE);
    }

    public void searchAccessory() {
        navigateToCategory(accessory, headdress, HEADDRESS_TITLE);
    }

    public void searchBeautyHealth() {
        navigateToCategory(beautyHealth, healthyEating, HEALTHY_EATING_TITLE);
    }

    public void searchHomeProduct() {
        navigateToCategory(homeProduct, textile, TEXTILE_TITLE);
    }

    public void searchKitchenProduct() {
        navigateToCategory(kitchenProduct, techniqueKitchen, KITCHEN_TITLE);
    }

    public void searchShoes() {
        navigateToCategory(shoes, homeShoes, HOME_SHOES);
    }

    public void searchDecorations() {
        navigateToCategory(decorations, bijouterie, BIJOUTERIE_TITLE);
    }

    public void searchLiquidation() {
        navigateToCategory(liquidation, liquidationShoes, LIQUIDATION_TITLE);
    }

    private void navigateToCategory(WebElement categoryElement, WebElement nextElement, String expectedTitle) {
        catalog.click();
        categoryElement.click();
        nextElement.click();
        checkPageTitle(expectedTitle);
    }

    private void checkPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(actualTitle, expectedTitle);
    }
}
