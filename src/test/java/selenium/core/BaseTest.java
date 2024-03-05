package selenium.core;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import selenium.pages.BasePage;

@ExtendWith(TestListener.class)
abstract public class BaseTest {
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = WebDriverFactory.createChromeDriver();
        driver.get("https://leomax.ru/");
        PopupLocation.closePopupIfDisplayed(driver);
        BasePage.setDriver(driver);
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}
