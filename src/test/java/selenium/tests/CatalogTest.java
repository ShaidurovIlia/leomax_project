package selenium.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.CatalogPage;

public class CatalogTest extends BaseTest {
    CatalogPage catalogPage = new CatalogPage();

    @DisplayName("Каталог - женская одежда")
    @Description("Проверяет переход на страницу верхняя одежда")
    @Test
    public void searchWomenClothing() {
        catalogPage.searchWomenClothing();
    }

    @DisplayName("Каталог - мужская одежда")
    @Description("Проверяет переход на страницу мужские куртки")
    @Test
    public void checkMenClothing() {
        catalogPage.searchMenClothing();
    }

    @DisplayName("Каталог - аксессуары")
    @Description("Проверяет переход на страницу головные уборы")
    @Test
    public void searchAccessory() {
        catalogPage.searchAccessory();
    }

    @DisplayName("Каталог - красота и здоровье")
    @Description("Проверяет переход на страницу здоровое питание")
    @Test
    public void searchBeauty() {
        catalogPage.searchBeautyHealth();
    }

    @DisplayName("Каталог - товары для дома")
    @Description("Проверяет переход на страницу текстиль")
    @Test
    public void searchTextile() {
        catalogPage.searchHomeProduct();
    }

    @DisplayName("Каталог - товары для кухни")
    @Description("Проверяет переход на страницу техника для кухни")
    @Test
    public void searchKitchenTechnique() {
        catalogPage.searchKitchenProduct();
    }

    @DisplayName("Каталог - обувь")
    @Description("Проверяет переход на страницу домашняя обувь")
    @Test
    public void searchHomeShoes() {
        catalogPage.searchShoes();
    }

    @DisplayName("Каталог - украшения")
    @Description("Проверяет переход на страницу бижутерия")
    @Test
    public void searchDecoration() {
        catalogPage.searchDecorations();
    }

    @DisplayName("Каталог - ликвидация")
    @Description("Проверяет переход на страницу ликвидация")
    @Test
    public void searchLiquidation() {
        catalogPage.searchLiquidation();
    }
}
