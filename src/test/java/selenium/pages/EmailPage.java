package selenium.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.readProperties.ConfigProvider;

public class EmailPage extends BasePage {

    private static final Faker faker = new Faker();
    @FindBy(css = "#email")
    private WebElement emailInput;
    @FindBy(xpath = "//div[@class='modal-body' and text()='Вы уже подписаны на рассылку.']")
    private WebElement subscribeMessage;
    @FindBy(xpath = "//div[@class='modal-body' and text()='Вы успешно подписались на рассылку."
            + " Скоро на ваш адрес электронной почты придет письмо с подтверждением.']")
    private WebElement successMessage;

    public EmailPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public boolean subscribeWithFakerEmail() {
        String generatedEmail = faker.internet().emailAddress();
        emailInput.click();
        emailInput.sendKeys(generatedEmail);
        emailInput.sendKeys(Keys.ENTER);
        return successMessage.isDisplayed();
    }

    public boolean subscribeWithEmail(String emailAddress) {
        emailInput.click();
        emailInput.sendKeys(emailAddress);
        emailInput.sendKeys(Keys.ENTER);
        return subscribeMessage.isDisplayed();
    }
}
