package selenium.components;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.pages.BasePage;
import selenium.readProperties.ConfigProvider;

public class FeedBackForm extends BasePage {

    private static final Faker faker = new Faker();
    private final String generatedEmail = faker.internet().emailAddress();
    private final String generateName = faker.name().fullName();
    private final String generateComment = faker.lorem().paragraph();

    @FindBy(css = "span[onclick='App.modal.showForm('feedback');return false;']")
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
        feedBack.click();
        name.sendKeys(generateName);
        email.sendKeys(generatedEmail);
        list.click();
        listQuestion.click();
        comment.sendKeys(generateComment);
        checkbox.click();
        send.click();
    }
}
