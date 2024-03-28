package selenium.core;

/*
import io.github.bonigarcia.wdm.WebDriverManager;
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    private static final int MyTimeout = 60;

    public static WebDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(MyTimeout, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(MyTimeout, TimeUnit.SECONDS);
        return driver;
    }
}

