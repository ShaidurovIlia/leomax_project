package selenium.pages;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;

class SearchPageTest extends BaseTest {
    SearchPage searchPage = new SearchPage();
    @DisplayName("Поиск лота по ГТК id")
    @Description("Проверяет работу поиска по ГТК лота")
    @Test
    void checkSear() {
        searchPage.searchLotForGtkId();
    }

    @DisplayName("Поиск лота по названию")
    @Description("Проверяет работу поиска по названию лота")
    @Test
    void checkSearchLotName() {
        searchPage.searchLotForName();
    }

    @DisplayName("Поиск лота по лот id")
    @Description("Проверяет работу поиска по лот id")
    @Test
    void searchLotForLotId() {
        searchPage.searchLotForLotId();
    }
}
