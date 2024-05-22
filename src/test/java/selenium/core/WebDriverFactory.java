package selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebDriverFactory {
    private static final int MyTimeout = 60;

    public static WebDriver createChromeDriver() {
        // Установка опций для ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");

        // Создание экземпляра WebDriver с использованием настроек
        WebDriver driver = new ChromeDriver(options);

        // Настройка окна и таймаутов
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(MyTimeout));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(MyTimeout));

        return driver;
    }
}

