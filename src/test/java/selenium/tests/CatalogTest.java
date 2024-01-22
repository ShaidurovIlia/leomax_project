package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.CatalogPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс CatalogTest")
public class CatalogTest extends BaseTest {
    CatalogPage catalogPage = new CatalogPage();

    @DisplayName("Каталог - женская одежда")
    @Description("Проверяет переход на страницу верхняя одежда")
    @Test
    public void searchWomenClothing() {
        catalogPage.navigateToWomenClothing();
    }

    @DisplayName("Каталог - мужская одежда")
    @Description("Проверяет переход на страницу мужские куртки")
    @Test
    public void searchMenClothing() {
        catalogPage.navigateToMenClothing();
    }

    @DisplayName("Каталог - аксессуары")
    @Description("Проверяет переход на страницу головные уборы")
    @Test
    public void searchAccessory() {
        catalogPage.navigateToAccessory();
    }

    @DisplayName("Каталог - красота и здоровье")
    @Description("Проверяет переход на страницу здоровое питание")
    @Test
    public void searchBeauty() {
        catalogPage.navigateToBeautyHealth();
    }

    @DisplayName("Каталог - товары для дома")
    @Description("Проверяет переход на страницу текстиль")
    @Test
    public void searchTextile() {
        catalogPage.navigateToHomeProduct();
    }

    @DisplayName("Каталог - товары для кухни")
    @Description("Проверяет переход на страницу техника для кухни")
    @Test
    public void searchKitchenTechnique() {
        catalogPage.navigateToKitchenProduct();
    }

    @DisplayName("Каталог - обувь")
    @Description("Проверяет переход на страницу домашняя обувь")
    @Test
    public void searchHomeShoes() {
        catalogPage.navigateToShoes();
    }

    @DisplayName("Каталог - украшения")
    @Description("Проверяет переход на страницу бижутерия")
    @Test
    public void searchDecoration() {
        catalogPage.navigateToDecorations();
    }

    @DisplayName("Каталог - ликвидация")
    @Description("Проверяет переход на страницу ликвидация")
    @Test
    public void searchLiquidation() {
        catalogPage.navigateToLiquidation();
    }
}
