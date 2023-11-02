package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.LocationFormPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс LocationTest")
public class LocationTest extends BaseTest {

    LocationFormPage location = new LocationFormPage();
    @DisplayName("Проверка отображения модального окна")
    @Description("Проверяет отображение модального окна определения региона")
    @Test
    public void checkModalDisplay() {
        location.isModalDisplayed();
    }

    @DisplayName("Проверка закрытия модального окна")
    @Description("Проверяет закрывается ли модальное окно определения региона")
    @Test
    public void checkModal() {
        location.clickCitySelectionButton();
    }

    @DisplayName("Проверка выбора региона в модальном окне")
    @Description("Проверяет что на главной странице отображается выбранный регион")
    @Test
    public void checkModalRegion() {
        location.enterCityAndSelect();
    }
}
