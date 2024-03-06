package selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.readProperties.ConfigProvider;

public class CatalogPage extends BasePage {

    private static final String OUTERWEAR_TITLE = "Купить верхнюю одежду в интернет-магазине Леомакс";
    private static final String JACKET_TITLE = "Мужские куртки купить от руб в интернет-магазине Леомакс";
    private static final String HEADDRESS_TITLE = "Головные уборы купить недорого в интернет-магазине Леомакс";
    private static final String HEALTHY_EATING_TITLE = "Товары для здорового питания купить в интернет-магазине Леомакс";
    private static final String BATHROOM_TITLE = "Купить все для ванной комнаты в интернет-магазине Леомакс";
    private static final String COOKING_TITLE = "Посуда для приготовления купить в интернет-магазине Леомакс";
    private static final String HOME_SHOES_TITLE = "Домашняя обувь купить в интернет-магазине Леомакс";
    private static final String BIJOUTERIE_TITLE = "Бижутерия купить в интернет-магазине Леомакс";
    private static final String LIQUIDATION_TITLE = "Ликвидация товаров интернет-магазина Леомакс";
    private static final String WINDBREAKERS_TITLE = "Ветровки женские купить в интернет-магазине Леомакс — цены от руб";

    @FindBy(css = "div.header .header__catalog-button")
    public WebElement catalog;
    @FindBy(css = "a.menu-desktop__title[href='/products/jenskaya_odejda/']")
    public WebElement womenClothing;
    @FindBy(css = "li [data-section-id] a[href='/products/verkhnyaya_odezhda/']")
    public WebElement outerwear;
    @FindBy(css = "li [data-section-id] a[href='/products/vetrovki_jenskie/']")
    public WebElement windbreakers;
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
    @FindBy(css = "li [data-section-id] [href='/products/vannaya_komnata/']")
    public WebElement bathroom;
    @FindBy(css = "a.menu-desktop__title[href='/products/tovary_dlya_kuhni/']")
    public WebElement kitchenProduct;
    @FindBy(css = "li [data-section-id] [href='/products/posuda_dlya_prigotovleniya/']")
    public WebElement cookingUtensils;
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

    public CatalogPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void navigateToWomenClothing() {
        navigateToCategory(womenClothing, outerwear, OUTERWEAR_TITLE);
    }

    public void navigateToThreeLevel() {
        catalog.click();
        navigateToThreeLevel(womenClothing, outerwear, windbreakers, WINDBREAKERS_TITLE);
    }

    public void navigateToMenClothing() {
        navigateToCategory(menClothing, menJacket, JACKET_TITLE);
    }

    public void navigateToAccessory() {
        navigateToCategory(accessory, headdress, HEADDRESS_TITLE);
    }

    public void navigateToBeautyHealth() {
        navigateToCategory(beautyHealth, healthyEating, HEALTHY_EATING_TITLE);
    }

    public void navigateToHomeProduct() {
        navigateToCategory(homeProduct, bathroom, BATHROOM_TITLE);
    }

    public void navigateToKitchenProduct() {
        navigateToCategory(kitchenProduct, cookingUtensils, COOKING_TITLE);
    }

    public void navigateToShoes() {
        navigateToCategory(shoes, homeShoes, HOME_SHOES_TITLE);
    }

    public void navigateToDecorations() {
        navigateToCategory(decorations, bijouterie, BIJOUTERIE_TITLE);
    }

    private void checkPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(actualTitle, expectedTitle);
    }

    private void navigateToCategory(WebElement firstLevel, WebElement secondLevel, String expectedTitle) {
        catalog.click();
        firstLevel.click();
        secondLevel.click();
        checkPageTitle(expectedTitle);
    }

    public void navigateToLiquidation() {
        catalog.click();
        liquidation.click();
        checkPageTitle(LIQUIDATION_TITLE);
    }

    public void navigateToThreeLevel(WebElement firstLevel, WebElement secondLevel,
                                     WebElement threeLevel, String expectedTitle) {
        firstLevel.click();
        secondLevel.click();
        threeLevel.click();
        checkPageTitle(expectedTitle);
    }
}
