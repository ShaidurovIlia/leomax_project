package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    static public void init() {
        setUp();
        open(Configuration.baseUrl);
        banner();
    }

    @AfterAll
    static private void tearDown() {
        Selenide.closeWebDriver();
    }

    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = "https://www.leomax.ru/";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.timeout = 20000;
    }

    public static void banner() {
        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
    }
}
