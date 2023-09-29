package selenide.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LocationForm {
    public static void city() {
        $("div.modal-city-selection").shouldBe(visible);
        $(".modal-city-selection__button_confirm").click();
    }
}
