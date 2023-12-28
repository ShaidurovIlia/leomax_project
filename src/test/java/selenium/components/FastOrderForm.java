package selenium.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.pages.BasePage;
import selenium.readProperties.ConfigProvider;

public class FastOrderForm extends BasePage {

    @FindBy(css = "#PERSONAL_NAME_CARD")
    private WebElement name;
    @FindBy(css = "#PERSONAL_MOBILE_CARD")
    private WebElement mobile;
    @FindBy(css = "div.row.form-button-group")
    private WebElement orderButton;

    public FastOrderForm() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void fillForm() {
        name.sendKeys("Тест");
        mobile.sendKeys("+70000000000");
    }
}
