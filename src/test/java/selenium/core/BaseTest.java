package selenium.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.pages.BasePage;

import java.util.concurrent.TimeUnit;

@ExtendWith(TestListener.class)
abstract public class BaseTest {
    protected static WebDriver driver;

    private static final int MyTimeout = 60;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(MyTimeout, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(MyTimeout, TimeUnit.SECONDS);

        BasePage.setDriver(driver);
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
