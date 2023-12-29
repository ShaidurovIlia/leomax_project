package selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.readProperties.ConfigProvider;

public class LocationFormPage extends BasePage {

    private final String city = "Саратов";
    @FindBy(css = "div.modal-city-selection p.modal-city-selection__text")
    private WebElement modal;
    @FindBy(css = ".modal-city-selection__button_indication")
    private WebElement choiceIndication;
    @FindBy(css = ".modal-city-selection__button.modal-city-selection__button_confirm")
    private WebElement consent;
    @FindBy(css = "#KLADR_CITY")
    private WebElement list;
    @FindBy(css = ".choose-your-city__button")
    private WebElement choice;
    @FindBy(xpath = "//div[@id='hints-field']//div[contains(text(), 'Саратовская обл, Саратов г')]")
    private WebElement enterCity;
    @FindBy(css = ".top-contacts-header__city")
    private WebElement elementCity;

    public LocationFormPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void isModalDisplayed() {
        modal.isDisplayed();
    }

    public void clickCitySelectionButton() {
        consent.click();
    }

    public void enterCityAndSelect() {
        elementCity.click();
        choiceIndication.click();
        list.sendKeys(city);
        enterCity.click();
        choice.click();
        Assertions.assertTrue(elementCity.isDisplayed());
    }
}
