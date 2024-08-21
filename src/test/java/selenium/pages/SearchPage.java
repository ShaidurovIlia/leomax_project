package selenium.pages;

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

public class SearchPage extends BasePage {

    private static final String PRODUCT_NAME = "Жидкая резина 'Фикс Про 3 в 1'";
    private static final String PRODUCT_VALUE3 = "3 товара";
    private static final String PRODUCT_VALUE = "1 товар";
    private static final String GTK_ID = "102640-08";
    private static final String LOT_ID = "102640";
    @FindBy(css = "input.ac_input[name='q']")
    private WebElement searchInput;
    @FindBy(css = "input[placeholder='Искать на LEOMAX']")
    private WebElement searchInputEnter;

    @FindBy(css = "span.digi-category-found-item__value")
    private WebElement lotSelector;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public SearchPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public void searchLotForLotId() {
        setSearchAndValidate(LOT_ID, PRODUCT_VALUE3);

    }

    public void searchLotForGtkId() {
        setSearchAndValidate(GTK_ID, PRODUCT_VALUE);

    }

    public void searchLotForName() {
        setSearchAndValidate(PRODUCT_NAME, PRODUCT_VALUE3);

    }

    public void setSearchAndValidate(String searchText, String expectedProductName) {
        step("Кликаем на поисковую строку", searchInput::click);
        step("Вводим запрос", () -> searchInput.sendKeys(searchText));
        step("Кликаем Enter", () -> searchInput.sendKeys(Keys.ENTER));
        wait.until(ExpectedConditions.visibilityOf(lotSelector));
        step("Сравниваем ожидаемый рузультат с актуальным", () -> {
            String actualProductName = lotSelector.getText();
            Assertions.assertEquals(expectedProductName, actualProductName);
        });
    }
}
