package selenium.pages;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.readProperties.ConfigProvider;

import java.time.Duration;

import static io.qameta.allure.Allure.step;

public class EmailPage extends BasePage {

    private final String MESSAGE_SIGNED_UP = "Вы успешно подписались на рассылку. Скоро на ваш адрес электронной" +
            " почты придет письмо с подтверждением.";
    private final String MESSAGE_SIGNED = "Вы уже подписаны на рассылку.";
    private final String DEFAULT_EMAIL = "test@mail.ru";

    private static final Faker faker = new Faker();

    private final String generatedEmail = faker.internet().emailAddress();
    
    @FindBy(css = "#email")
    private WebElement emailInput;
    @FindBy(css = "div#modalMessage div.modal-content .modal-body")
    private WebElement subscribeModal;
    @FindBy(xpath = "//div[@class='modal-body' and text()='Вы успешно подписались на рассылку."
            + " Скоро на ваш адрес электронной почты придет письмо с подтверждением.']")
    private WebElement successMessage;


    public EmailPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    private void performSubscription(String emailAddress, String expectedMessage) {
        step("Кликаем на форму введите свой E-mail", emailInput::click);
        step("Вводим адрес E-mail", () -> emailInput.sendKeys(emailAddress));
        step("Нажимаем Enter", () -> emailInput.sendKeys(Keys.ENTER));
        wait.until(ExpectedConditions.visibilityOf(subscribeModal));

        String actualMessage = subscribeModal.getText();
        step("Проверяем наличие сообщения о подписке", () ->
                Assertions.assertEquals(expectedMessage, actualMessage));
    }

    public void subscribeWithFakerEmail() {
        performSubscription(generatedEmail, MESSAGE_SIGNED_UP);
    }

    public void subscribeWithEmail() {
        performSubscription(DEFAULT_EMAIL, MESSAGE_SIGNED);
    }
}