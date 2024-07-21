package selenium.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.readProperties.ConfigProvider;

import static io.qameta.allure.Allure.step;

public class EmailPage extends BasePage {

    private static final Faker faker = new Faker();
    private final String generatedEmail = faker.internet().emailAddress();

    @FindBy(css = "#email")
    private WebElement emailInput;
    @FindBy(xpath = "//div['modal-body' and text()='Вы уже подписаны на рассылку.']")
    private WebElement subscribeMessage;
    @FindBy(xpath = "//div[@class='modal-body' and text()='Вы успешно подписались на рассылку."
            + " Скоро на ваш адрес электронной почты придет письмо с подтверждением.']")
    private WebElement successMessage;

    public EmailPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public boolean subscribeWithFakerEmail() {
        step("Кликаем на форму введите свой E-mail", ()-> {
            emailInput.click();
        });
        step("Вводим адрес E-mail", ()-> {
            emailInput.sendKeys(generatedEmail);
        });
        step("Нажимаем Enter", ()-> {
            emailInput.sendKeys(Keys.ENTER);
        });
        step("Нажимаем Enter", ()-> {
            emailInput.sendKeys(Keys.ENTER);
        });
        step("Проверяем наличие сообщения о подписке нового пользователя", ()-> {
        });
        return successMessage.isDisplayed();
    }

    public boolean subscribeWithEmail(String emailAddress) {
        step("Кликаем на форму введите свой E-mail", ()-> {
            emailInput.click();
        });
        step("Вводим адрес E-mail", ()-> {
                    emailInput.sendKeys(emailAddress);
                });
        step("Нажимаем Enter", ()-> {
            emailInput.sendKeys(Keys.ENTER);
        });
        step("Нажимаем Enter", ()-> {
            emailInput.sendKeys(Keys.ENTER);
        });
        step("Проверяем наличие сообщения о подписке", ()-> {
        });
        return subscribeMessage.isDisplayed();
    }
}
