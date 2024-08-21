package selenium.components;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.pages.BasePage;
import selenium.readProperties.ConfigProvider;

import static io.qameta.allure.Allure.step;

public class FeedBackForm extends BasePage {

    private static final Faker faker = new Faker();
    private final String generatedEmail = faker.internet().emailAddress();
    private final String generateName = faker.name().fullName();
    private final String generateComment = faker.lorem().paragraph();

    @FindBy(css = ".col-sm-3 span")
    private WebElement feedBack;
    @FindBy(css = "#feedbackName")
    private WebElement name;
    @FindBy(css = "#feedbackEmail")
    private WebElement email;
    @FindBy(css = "#feedbackTheme")
    private WebElement list;
    @FindBy(css = "#feedbackTheme option[value='403']")
    private WebElement listQuestion;
    @FindBy(css = "#feedbackComment")
    private WebElement comment;
    @FindBy(css = "div.user-agreement-data__checkbox-custom")
    private WebElement checkbox;
    @FindBy(css = "button.btn.btn-primary.btn-margin")
    private WebElement send;

    public FeedBackForm() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void fillingForm() {
        step("Кликаем на форму обратной связи", feedBack::click);
        step("Заполняем поле name", () -> name.sendKeys(generateName));
        step("Заполняем поле email", () -> email.sendKeys(generatedEmail));
        step("Кликаем на блок темы", list::click);
        step("Выбираем тему обращения", listQuestion::click);
        step("Заполняем поле комментарий", () -> comment.sendKeys(generateComment));
        step("Устанавливаем чекбокс в обработке ПД", checkbox::click);
        step("Кликаем на кнопку отправить", send::click);
    }
}
