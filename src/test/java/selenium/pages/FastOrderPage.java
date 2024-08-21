package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.readProperties.ConfigProvider;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FastOrderPage extends BasePage {
    private static final String RELATIVE_URL = "goods/zhidkaya_rezina_fiks_pro_3_v_1/?COLOR_GROUP=2309467";
    private static final String NAME_USER = "Тест";
    private static final String PHONE_USER = "+0000000000";
    private static final String EXPECTED_TEXT = "Спасибо за Ваш заказ!";

    @FindBy(css = "#PERSONAL_NAME_CARD")
    private WebElement name;
    @FindBy(css = "#PERSONAL_MOBILE_CARD")
    private WebElement mobile;
    @FindBy(css = "div.row.form-button-group")
    private WebElement orderButton;
    @FindBy(css = ".message-content h3")
    private WebElement message;
    @FindBy(css = ".js_order_in_click_card")
    private WebElement orderClick;

    public FastOrderPage() {
        PageFactory.initElements(driver, this);
    }

    public void openUrl(String relativeUrl) {
        driver.get(ConfigProvider.URL + relativeUrl);
    }

    public void fillForm(String nameUser, String numberPhone) {
        name.sendKeys(nameUser);
        mobile.sendKeys(numberPhone);
    }

    public void submitFastOrder() {
        step("Открываем нужный URL", () -> openUrl(RELATIVE_URL));
        step("Заполняем форму для заказа", () -> fillForm(NAME_USER, PHONE_USER));
        step("Кликаем на кнопку заказать", () -> orderClick.click());
        step("Проверяем наличие сообщения об успешном заказе", () -> {
            String actualText = message.getText();
            assertEquals(EXPECTED_TEXT, actualText);
        });
    }
}
