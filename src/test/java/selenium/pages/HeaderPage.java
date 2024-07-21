package selenium.pages;

import org.aspectj.apache.bcel.ExceptionConstants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.readProperties.ConfigProvider;

import java.time.Duration;

public class HeaderPage extends BasePage {

    private static final String FIX_PRICE_TITLE = "Каталог товаров интернет-магазина Leomax.ru";
    private static final String DAY_OFF_TITLE = "Ледоступы-ледоходы купить в интернет-магазине Leomax";
    private static final String ACTION_TITLE = "Акции и скидки телемагазина LEOMAX";
    private static final String BRAND_TITLE = "Бренды | Интернет-магазин LEOMAX";
    private static final String TELECAST_TITLE = "Онлайн ТВ";
    private static final String ADVERTISING_TITLE = "Самые продаваемые товары от Леомакс | Leomax";
    private static final String COLLECTION_TITLE = "Новая коллекция";
    private static final String IDEA_TITLE = "Идеи для подарков";
    private static final String BIG_SALE_BANNER = "Больше покупка = больше выгода";
    private static final String MSK_CARD_BANNER = "У вас есть карта москвича? Воспользуйтесь ей и получите скидку на заказ!";
    private static final String MNOGORU_BANNER = "Бонусная программа клуба MNOGO.RU®";
    private static final String PAYMENT_BANNER = "Способы оплаты товаров | Leomax";
    private static final String HALVA_BANNER = "Халва";
    private static final String BONUS_BANNER = "Программа лояльности Leomax Bonus";
    private static final String TV_PRODUCTS_BANNER = "Товары из TV-рекламы";
    private static final String MOBILE_BANNER = "Мобильное приложение Leomax";
    private static final String LIQUIDATION_BANNER = "Ликвидация товаров интернет-магазина Леомакс";
    private final String city = "Саратов";
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
    @FindBy(css = "a.bottom-header__link.bottom-header__link-ideas")
    private WebElement idea;
    @FindBy(css = "div.digi-product__label [target='_blank']")
    private WebElement cat;
    @FindBy(css = "a[href='/action/cpa_kaskad_2023-11']")
    private WebElement bigSale;
    @FindBy(css = "a[href='/action/karta-moskvicha/']")
    private WebElement mskCard;
    @FindBy(css = "a[href='/action/mnogoru']")
    private WebElement mnogoRu;
    @FindBy(css = "li[data-action-type='Акции leomax'] a[href='/info/oplata/#installmentpayment']")
    private WebElement payment;
    @FindBy(css = "a[href='/action/halvacard']")
    private WebElement halva;
    @FindBy(css = "li[data-action-type='Акции leomax'] a[href='/info/leomax_bonus/']")
    private WebElement bonus;
    @FindBy(css = "a[href='/goods/zhidkaya_rezina_fiks_pro_3_v_1/']")
    private WebElement rubberBanner;
    @FindBy(css = "a[href='/action/tovary_iz_tv_reklamy/']")
    private WebElement tvProductsBanner;
    @FindBy(css = "a[href='/action/mobilnoe_prilozhenie_leomax']")
    private WebElement mobileBanner;
    @FindBy(css = "li[data-action-type='Акции leomax'] a[href='/action/likvidaciya/']")
    private WebElement liquidationBanner;
    @FindBy(css = ".col-xs-10 .brand-row__item-name")
    private WebElement liquidationBannerInput;
    @FindBy(css = "a[href='/action/vsyee_po_999/']")
    private WebElement fixPrice;
    @FindBy(css = "a[href='/goods/ledostupy_ledokhody/']")
    private WebElement dayOff;
    @FindBy(css = "div.col-xs-10 h1.brand-row__item-name")
    private WebElement rubber;
    @FindBy(css = "#KLADR_CITY")
    private WebElement list;
    @FindBy(css = ".choose-your-city__button")
    private WebElement choice;
    @FindBy(css = "#hints-field")
    private WebElement field;
    @FindBy(xpath = ".hint_item[onclick*=\"'Саратовская обл, Саратов'\"]")
    private WebElement enterCity;
    @FindBy(css = ".top-contacts-header__city")
    private WebElement elementCity;
    @FindBy(css = ".modal-city-selection__button_indication")
    private WebElement choiceIndication;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    public HeaderPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    private void checkPageTitle(WebElement element, String expectedTitle) {
        element.click();
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(actualTitle, expectedTitle);
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

    public void clickIdeaForPresent() {
        checkPageTitle(idea, IDEA_TITLE);
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

    public void clickMobileBannerLink() {
        action.click();
        checkPageTitle(mobileBanner, MOBILE_BANNER);
    }

    public void clickRubberBannerLink() {
        action.click();
        rubberBanner.click();
        rubber.isDisplayed();
    }

    public void enterCityAndSelect() {
        elementCity.click();
        choiceIndication.click();
        list.sendKeys(city);
        wait.until(ExpectedConditions.visibilityOf(field));
        wait.until(ExpectedConditions.elementToBeClickable(enterCity)).click();
        choice.click();
        Assertions.assertTrue(elementCity.isDisplayed());
    }

    public void clickLiquidationBannerLink() {
        action.click();
        checkPageTitle(liquidationBanner, LIQUIDATION_BANNER);
    }

    public void clickFixPriceBannerLink() {
        action.click();
        checkPageTitle(fixPrice, FIX_PRICE_TITLE);
    }

    public void clickDayOffBannerLink() {
        action.click();
        checkPageTitle(dayOff, DAY_OFF_TITLE);
    }

    public void clickTvProductsBannerLink() {
        action.click();
        checkPageTitle(tvProductsBanner, TV_PRODUCTS_BANNER);
    }

    public void clickActionBannerLink() {
        action.click();
        checkPageTitle(bigSale, BIG_SALE_BANNER);
    }
}