package selenium.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PopularLocationNew {

    private static final SelenideElement
            modalWindow = $("div.modal-city-selection p.modal-city-selection__text"),
            closing = $(".modal-city-selection__closing");

    public static void closePopupIfDisplayed() {
        if (modalWindow.exists() && modalWindow.isDisplayed()) {
            closing.shouldBe(visible).click();
        }
    }
}
