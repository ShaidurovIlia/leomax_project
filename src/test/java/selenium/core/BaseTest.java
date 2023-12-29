package selenium.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pages.BasePage;
import selenium.pages.LocationFormPage;

import java.util.concurrent.TimeUnit;

@ExtendWith(TestListener.class)
abstract public class BaseTest {
    protected static WebDriver driver;

   /* LocationFormPage locationFormPage = new LocationFormPage();*/

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        BasePage.setDriver(driver);
    }

  /*  @BeforeAll
    public void location() {
        locationFormPage.closeModal();

    }*/
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
