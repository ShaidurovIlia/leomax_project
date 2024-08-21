package selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebDriverFactory {
    private static final int MyTimeout = 60;

    public static WebDriver createChromeDriver() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(MyTimeout));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(MyTimeout));

        return driver;
    }
}

