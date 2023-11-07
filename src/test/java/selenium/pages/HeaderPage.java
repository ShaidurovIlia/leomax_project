package selenium.pages;

import org.junit.jupiter.api.Assertions;
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
    private static final String SEARCH_PRODUCT = "Игрушка-антистресс 'Котик'";
    private static final String BIG_SALE_BANNER = "Больше покупка = больше выгода";
    private static final String MSK_CARD_BANNER = "У вас есть карта москвича? Воспользуйтесь ей и получите скидку на заказ!";
    private static final String MNOGORU_BANNER = "Бонусная программа клуба MNOGO.RU®";
    private static final String PAYMENT_BANNER = "Способы оплаты товаров | Leomax";
    private static final String HALVA_BANNER = "Халва";
    private static final String BONUS_BANNER = "Программа лояльности Leomax Bonus";
    private static final String TV_PRODUCTS_BANNER = "Товары из TV-рекламы";
    private static final String MOBILE_BANNER = "Мобильное приложение Leomax";
    private static final String LIQUIDATION_BANNER = "Ликвидация товаров интернет-магазина Леомакс";
    @FindBy(css = "a.bottom-header__link[href='/action/']")
    private WebElement action;
    @FindBy(css = ".action-title")
    private WebElement actionTitle;
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
    @FindBy(css = "a[href*='/goods/igrushka_antistress_kotik/'] p.basket-item__title")
    private WebElement productInBasket;
    @FindBy(css = ".action-list__elem:nth-child(1)")
    private WebElement bigSale;
    @FindBy(css = ".action-list__elem:nth-child(2)")
    private WebElement mskCard;
    @FindBy(css = ".action-list__elem:nth-child(3)")
    private WebElement mnogoRu;
    @FindBy(css = ".action-list__elem:nth-child(4)")
    private WebElement payment;
    @FindBy(css = ".action-list__elem:nth-child(5)")
    private WebElement halva;
    @FindBy(css = ".action-list__elem:nth-child(6)")
    private WebElement bonus;
    @FindBy(css = ".action-list__elem:nth-child(7)")
    private WebElement rubberBanner;
    @FindBy(css = ".action-list__elem:nth-child(8)")
    private WebElement tvProductsBanner;
    @FindBy(css = ".action-list__elem:nth-child(9)")
    private WebElement mobileBanner;
    @FindBy(css = ".action-list__elem:nth-child(10)")
    private WebElement liquidationBanner;
    @FindBy(css = "div.col-xs-10 h1.brand-row__item-name")
    private WebElement rubber;

    public HeaderPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void clickActionsLink() {
        checkPageTitle(action, ACTION_TITLE);
    }

    public void clickBrandsLink() {
        checkPageTitle(brand, BRAND_TITLE);
    }

    public void clickTelecastLink() {
        checkPageTitle(telecast, TELECAST_TITLE);
    }

    public void clickAdvertisingLink() {
        checkPageTitle(advertising, ADVERTISING_TITLE);
    }

    public void clickCollectionLink() {
        checkPageTitle(collection, COLLECTION_TITLE);
    }

    public void searchProductAndAddToBasket() {
        search.click();
        search.sendKeys(SEARCH_PRODUCT);
        search.sendKeys(Keys.ENTER);
        orderClick.click();
        orderCatPhoto.click();
        size.click();
        buy.click();
        basket.click();
        Assertions.assertTrue(productInBasket.isDisplayed());
    }

    public void clickActionBannerLink() {
        action.click();
        checkPageTitle(bigSale, BIG_SALE_BANNER);
    }

    public void clickMskCardBannerLink() {
        action.click();
        checkPageTitle(mskCard, MSK_CARD_BANNER);
    }

    public void clickMnogoRuBannerLink() {
        action.click();
        checkPageTitle(mnogoRu, MNOGORU_BANNER);
    }

    public void clickPaymentBannerLink() {
        action.click();
        checkPageTitle(payment, PAYMENT_BANNER);
    }

    public void clickHalvaBannerLink() {
        action.click();
        checkPageTitle(halva, HALVA_BANNER);
    }

    public void clickBonusBannerLink() {
        action.click();
        checkPageTitle(bonus, BONUS_BANNER);
    }

    public void clickRubberBannerLink() {
        action.click();
        rubberBanner.click();
        rubber.isDisplayed();
    }

    public void clickTvProductsBannerLink() {
        action.click();
        checkPageTitle(tvProductsBanner, TV_PRODUCTS_BANNER);
    }

    public void clickMobileBannerLink() {
        action.click();
        checkPageTitle(mobileBanner, MOBILE_BANNER);
    }

    public void clickLiquidationBannerLink() {
        action.click();
        checkPageTitle(liquidationBanner, LIQUIDATION_BANNER);
    }

    private void checkPageTitle(WebElement element, String expectedTitle) {
        element.click();
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(actualTitle, expectedTitle);
    }
}