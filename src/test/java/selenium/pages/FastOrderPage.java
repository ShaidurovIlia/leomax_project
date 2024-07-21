package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.components.FastOrderForm;
import selenium.readProperties.ConfigProvider;

import static io.qameta.allure.Allure.step;


public class FastOrderPage extends BasePage {
    private static final String RELATIVE_URL = "goods/zhidkaya_rezina_fiks_pro_3_v_1/?COLOR_GROUP=2309467";
    private static final String NAME_USER = "Тест";
    private static final String PHONE_USER = "+0000000000";

    public FastOrderPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".message-content")
    private WebElement message;
    @FindBy(css = ".js_order_in_click_card")
    private WebElement orderClick;
    FastOrderForm fastOrderForm = new FastOrderForm();

    public void openUrl(String relativeUrl) {
        driver.get(ConfigProvider.URL + relativeUrl);
    }

    public void form() {
        step("Открываем нужный URL", () -> {
            openUrl(RELATIVE_URL);
        });
        step("Заполняем форму для заказа", () -> {
            fastOrderForm.fillForm(NAME_USER, PHONE_USER);
        });
        step("Кликаем на кнопку заказать", () -> {
            orderClick.click();
        });
        step("Проверяем наличие сообщения об успешном заказе", () -> {
            message.isDisplayed();
        });
    }
}
