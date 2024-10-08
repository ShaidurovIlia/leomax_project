package selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.readProperties.ConfigProvider;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static io.qameta.allure.Allure.step;

public class FooterPage extends BasePage {
    private static final String WOMEN_CLOTHING_TITLE =
            "Одежда больших размеров для полных женщин купить в Leomax.ru";
    private static final String MEN_CLOTHING_TITLE =
            "Купить мужскую одежду в интернет-магазине Леомакс";
    private static final String CLOTHING_TITLE =
            "Аксессуары низкие цены, купить в интернет-магазине Leomax.ru | Телеканал Leomax24";
    private static final String BEAUTY_TITLE =
            "Купить товары для красоты и здоровья в интернет-магазине Леомакс";
    private static final String PRODUCT_HOME_TITLE =
            "Товары для дома купить в интернет-магазине Леомакс";
    private static final String PRODUCT_KITCHEN_TITLE =
            "Товары для кухни купить в интернет-магазине Леомакс";
    private static final String SHOES_TITLE =
            "Купить недорогую обувь в интернет-магазине Леомакс";
    private static final String DECORATING_TITLE = "Купить ювелирные украшения в интернет-магазине Леомакс";
    private static final String DELIVERY_TITLE = "Доставка и сервисный сбор";
    private static final String PAYMENT_TITLE = "Способы оплаты товаров | Leomax";
    private static final String REFUND_TITLE = "Условия возврата товаров | Leomax";
    private static final String HELP_TITLE = "Поддержка клиентов и покупателей | Leomax";
    private static final String RULES_TITLE = "Правила акций";
    private static final String HALVA_TITLE = "Халва";
    private static final String ACTION_TITLE = "Акции и скидки телемагазина LEOMAX";
    private static final String BRAND_TITLE = "Бренды | Интернет-магазин LEOMAX";
    private static final String TELECAST_TITLE = "Онлайн ТВ";
    private static final String PERSONAL_TITLE = "Личный кабинет";
    private static final String CHANNEL_TITLE = "Круглосуточный ТВ канал LEOMAX24 | Leomax";
    private static final String CONTACT_TITLE = "Контакты Леомакс — адрес, телефон, реквизиты";
    private static final String BONUS_TITLE = "Программа лояльности Leomax Bonus";
    private static final String PROVIDER_TITLE = "Информация для партнеров и поставщиков | Leomax";
    private static final String TV_PROVIDER_TITLE = "Информация для ТВ-провайдеров | Leomax";
    private static final String WEBSITE_TITLE = "Информация по объединению сайтов группы Leomax";
    private static final String MNOGO_BONUS_TITLE = "Бонусная программа клуба MNOGO.RU®";
    private static final String USER_AGREEMENT_TITLE = "Договор на оказание информационных услуг | Leomax";
    private static final String PROCESSING_POLICY_TITLE = "Положение об обработке персональных данных | Leomax";
    private static final String CONSENT_PROCESSING_TITLE = "Согласие на обработку персональных данных | Leomax";

    @FindBy(css = ".col-xs-3 a[href='/products/jenskaya_odejda/']")
    private WebElement womenClothing;
    @FindBy(css = ".col-xs-3 [href='/products/mujskaya_odejda/']")
    private WebElement menClothing;
    @FindBy(css = ".col-xs-3 a[href='/products/aksessuary/']")
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
    @FindBy(css = ".col-xs-3 ul li a[href='/action/pravila_aktsiy/']")
    private WebElement rules;
    @FindBy(css = ".col-xs-3 a[href='/action/halvacard/']")
    private WebElement halva;
    @FindBy(css = ".col-sm-3 a[href='/action/']")
    private WebElement action;
    @FindBy(css = ".col-sm-3 a[href='/brand/']")
    private WebElement brand;
    @FindBy(css = ".col-sm-3 a[href='/telecast/']")
    private WebElement telecast;
    @FindBy(css = ".col-sm-3 a[href='/personal/']")
    private WebElement personal;
    @FindBy(css = "a[href='https://advcake.ru/lp/leomax']")
    private WebElement partner;
    @FindBy(css = ".first__description")
    private WebElement partnerWindow;
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
    @FindBy(css = ".col-xs-12 [href='/info/soglashenie/']")
    private WebElement userAgreement;
    @FindBy(css = ".col-xs-12 [href='/info/politika_obrabotki_personalnykh_dannykh/']")
    private WebElement processingPolicy;
    @FindBy(css = ".col-xs-12 [href='/info/soglasie_na_obrabotku_personalnykh_dannykh/']")
    private WebElement consentProcessing;

    public FooterPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    public void clickWomenClothing() {
        checkPageTitle(womenClothing, WOMEN_CLOTHING_TITLE);
    }

    public void clickMenCloth() {
        checkPageTitle(menClothing, MEN_CLOTHING_TITLE);
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

    public void clickTelecast() {
        checkPageTitle(telecast, TELECAST_TITLE);
    }

    public void clickPersonal() {
        checkPageTitle(personal, PERSONAL_TITLE);
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

    public void clickUserAgreement() {
        checkPageTitle(userAgreement, USER_AGREEMENT_TITLE);
    }

    public void clickProcessingPolicy() {
        checkPageTitle(processingPolicy, PROCESSING_POLICY_TITLE);
    }

    public void clickConsentProcessing() {
        checkPageTitle(consentProcessing, CONSENT_PROCESSING_TITLE);
    }

    private void checkPageTitle(WebElement element, String expectedTitle) {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        step("Кликаем на нужный раздел странцы", () ->
                wait.until(ExpectedConditions.elementToBeClickable(element)).click());
        step("Сравниваем фактический title с ожидаемым", () -> {
            String actualTitle = driver.getTitle();
            Assertions.assertEquals(actualTitle, expectedTitle);
        });
    }

    public void clickPartner() {
        step("Переходим в раздел Партнерская программа", partner::click);
        step(" Переходим в новую вкладку", () -> {
            Set<String> allTabs = driver.getWindowHandles();
            List<String> tabsList = new ArrayList<>(allTabs);
            driver.switchTo().window(tabsList.get(1));
        });
        step("Проверяем соответсвие описания страницы", () -> {
            partnerWindow.isDisplayed();
        });
    }
}