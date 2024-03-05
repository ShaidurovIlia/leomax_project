package selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

import static org.openqa.selenium.By.cssSelector;

public class PopupLocation {
    public static void closePopupIfDisplayed(WebDriver driver) {
        try {
            WebElement modal = driver.findElement(cssSelector("div.modal-city-selection p.modal-city-selection__text"));
            if (modal.isDisplayed()) {
                WebElement closeButton = driver.findElement(cssSelector(".modal-city-selection__closing"));
                closeButton.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Драйвер не запущен!");
        }
    }
}

