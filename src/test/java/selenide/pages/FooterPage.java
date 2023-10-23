package selenide.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends BasePage {
    private static final String CLOTHING_TITLE =
            "Одежда и аксессуары купить в интернет-магазине Леомакс";
    private static final String BEAUTY_TITLE =
            "Купить товары для красоты и здоровья в интернет-магазине Леомакс";
    private static final String PRODUCT_HOME_TITLE = "Товары для дома купить в интернет-магазине Леомакс";
    private static final String PRODUCT_KITCHEN_TITLE = "Товары для кухни купить в интернет-магазине Леомакс";
    private static final String SHOES_TITLE = "Купить недорогую обувь в интернет-магазине Леомакс";
    private static final String DECORATING_TITLE = "Купить ювелирные украшения в интернет-магазине Леомакс";
    private static final String DELIVERY_TITLE = "Доставка и сервисный сбор";
    private static final String PAYMENT_TITLE = "Способы оплаты товаров | Leomax";
    private static final String REFUND_TITLE = "Условия возвтрата товаров | Leomax";
    private static final String HELP_TITLE = "Поддержка клиентов и покупателей | Leomax";
    private static final String RULES_TITLE = "Правила акций";
    private static final String HALVA_TITLE = "Халва";
    private static final String ACTION_TITLE = "Акции и скидки телемагазина LEOMAX";
    private static final String BRAND_TITLE = "Бренды | Интернет-магазин LEOMAX";
    private static final String REVIEWS_TITLE = "Отзывы о товарах Леомакс интернет-магазина Leomax.ru";
    private static final String TELECAST_TITLE = "Онлайн ТВ";
    private static final String PERSONAL_TITLE = "Личный кабинет";
    private static final String PARTNER_TITLE = "Партнерская программа leomax.ru";
    private static final String CHANNEL_TITLE = "Круглосуточный ТВ канал LEOMAX24 | Leomax";
    private static final String CONTACT_TITLE = "Контакты Леомакс — адрес, телефон, реквизиты";
    private static final String BONUS_TITLE = "Программа лояльности Leomax Bonus";
    private static final String PROVIDER_TITLE = "Информация для партнеров и поставщиков | Leomax";
    private static final String TV_PROVIDER_TITLE = "Информация для ТВ-провайдеров | Leomax";
    private static final String WEBSITE_TITLE = "Информация по объединению сайтов группы Leomax";
    private static final String MNOGO_BONUS_TITLE = "Бонусная программа клуба MNOGO.RU®";

    @FindBy(css = "a[href='/products/odejda_i_aksessuary/']")
    private WebElement clothing;
    @FindBy(css = ".col-xs-3 a[href='/products/krasota_i_zdorove/']")
    private WebElement beauty;
    @FindBy(css = ".col-xs-3 a[href='/products/tovary_dlya_doma_dachi_i_otdyha/']")
    private WebElement home;
    @FindBy(css = ".col-xs-3 a[href='/products/tovary_dlya_kuhni/']")
    private WebElement kitchen;
    @FindBy(css = ".col-xs-3 a[href='/products/obuv/']")
    private WebElement shoes;
    @FindBy(css = ".col-xs-3 a[href='/products/ukrasheniya/']")
    private WebElement decoration;
    @FindBy(css = ".col-xs-3 a[href='/info/dostavka/']")
    private WebElement delivery;
    @FindBy(css = ".col-xs-3 a[href='/info/oplata/#installmentpayment']")
    private WebElement payment;
    @FindBy(css = ".col-xs-3 a[href='/info/vozvrat/']")
    private WebElement refund;
    @FindBy(css = "a[href='/info/faq/']")
    private WebElement help;
    @FindBy(css = "a[href='/action/pravila_aktsiy/']")
    private WebElement rules;
    @FindBy(css = ".col-xs-3 a[href='/action/halvacard/']")
    private WebElement halva;
    @FindBy(css = ".col-sm-3 a[href='/action/']")
    private WebElement action;
    @FindBy(css = ".col-sm-3 a[href='/brand/']")
    private WebElement brand;
    @FindBy(css = ".col-sm-3 a[href='/reviews/']")
    private WebElement reviews;
    @FindBy(css = ".col-sm-3 a[href='/telecast/']")
    private WebElement telecast;
    @FindBy(css = ".col-sm-3 a[href='/personal/']")
    private WebElement personal;
    @FindBy(css = ".col-sm-3 a[href='https://advcake.com/lp/leomax/']")
    private WebElement partner;
    @FindBy(css = ".col-xs-3 a[href='/info/o_kanale/']")
    private WebElement channel;
    @FindBy(css = ".col-xs-3 a[href='/info/contacts/']")
    private WebElement contact;
    @FindBy(css = ".col-xs-3 a[href='/info/leomax_bonus/']")
    private WebElement bonus;
    @FindBy(css = ".col-xs-3 a[href='/info/postavshikam/']")
    private WebElement provider;
    @FindBy(css = ".col-xs-3 a[href='/info/tv_provayderam/']")
    private WebElement tvProvider;
    @FindBy(css = ".col-xs-3 a[href='/info/merge_details/']")
    private WebElement website;
    @FindBy(css = ".col-xs-3 a[href='/action/mnogoru/']")
    private WebElement mnogoBonus;

    public FooterPage() {
        driver.get("https://www.leomax.ru/");
        PageFactory.initElements(driver, this);
    }

    public void clickClothing() {
        checkPageTitle(clothing, CLOTHING_TITLE);
    }

    public void clickBeauty() {
        checkPageTitle(beauty, BEAUTY_TITLE);
    }

    public void clickProductHome() {
        checkPageTitle(home, PRODUCT_HOME_TITLE);
    }

    public void clickProductKitchen() {
        checkPageTitle(kitchen, PRODUCT_KITCHEN_TITLE);
    }

    public void clickShoes() {
        checkPageTitle(shoes, SHOES_TITLE);
    }

    public void clickDecoration() {
        checkPageTitle(decoration, DECORATING_TITLE);
    }

    public void clickDelivery() {
        checkPageTitle(delivery, DELIVERY_TITLE);
    }

    public void clickPayment() {
        checkPageTitle(payment, PAYMENT_TITLE);
    }

    public void clickRefund() {
        checkPageTitle(refund, REFUND_TITLE);
    }

    public void clickHelp() {
        checkPageTitle(help, HELP_TITLE);
    }

    public void clickRules() {
        checkPageTitle(rules, RULES_TITLE);
    }

    public void clickHalva() {
        checkPageTitle(halva, HALVA_TITLE);
    }

    public void clickAction() {
        checkPageTitle(action, ACTION_TITLE);
    }

    public void clickBrand() {
        checkPageTitle(brand, BRAND_TITLE);
    }

    public void clickReviews() {
        checkPageTitle(reviews, REVIEWS_TITLE);
    }

    public void clickTelecast() {
        checkPageTitle(telecast, TELECAST_TITLE);
    }

    public void clickPersonal() {
        checkPageTitle(personal, PERSONAL_TITLE);
    }

    public void clickPartner() {
        checkPageTitle(partner, PARTNER_TITLE);
    }

    public void clickChannel() {
        checkPageTitle(channel, CHANNEL_TITLE);
    }

    public void clickContact() {
        checkPageTitle(contact, CONTACT_TITLE);
    }

    public void clickBonus() {
        checkPageTitle(bonus, BONUS_TITLE);
    }

    public void clickProvider() {
        checkPageTitle(provider, PROVIDER_TITLE);
    }


    public void clickTvProvider() {
        checkPageTitle(tvProvider, TV_PROVIDER_TITLE);
    }

    public void clickWebSite() {
        checkPageTitle(website, WEBSITE_TITLE);
    }

    public void clickMnogoBonus() {
        checkPageTitle(mnogoBonus, MNOGO_BONUS_TITLE);
    }

    private void checkPageTitle(WebElement element, String expectedTitle) {
        element.click();
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(actualTitle, expectedTitle);
    }
}