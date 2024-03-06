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
    @Description("Проверяет переход на страницу лотов верхняя одежда")
    @Test
    public void searchWomenClothing() {
        catalogPage.navigateToWomenClothing();
    }

    @DisplayName("Каталог - третий уровень вложенности")
    @Description("Проверяет третий уровень вложенности на странице лотов ветровки")
    @Test
    public void searchWomenWindbreakers() {
        catalogPage.navigateToThreeLevel();
    }

    @DisplayName("Каталог - мужская одежда")
    @Description("Проверяет переход на страницу лотов мужские куртки")
    @Test
    public void searchMenClothing() {
        catalogPage.navigateToMenClothing();
    }

    @DisplayName("Каталог - аксессуары")
    @Description("Проверяет переход на страницу лотов головные уборы")
    @Test
    public void searchAccessory() {
        catalogPage.navigateToAccessory();
    }

    @DisplayName("Каталог - красота и здоровье")
    @Description("Проверяет переход на страницу лотов здоровое питание")
    @Test
    public void searchBeauty() {
        catalogPage.navigateToBeautyHealth();
    }

    @DisplayName("Каталог - товары для дома")
    @Description("Проверяет переход на страницу лотов ванная комната")
    @Test
    public void searchTextile() {
        catalogPage.navigateToHomeProduct();
    }

    @DisplayName("Каталог - товары для кухни")
    @Description("Проверяет переход на страницу лотов посуда для приготовления")
    @Test
    public void searchKitchenTechnique() {
        catalogPage.navigateToKitchenProduct();
    }

    @DisplayName("Каталог - обувь")
    @Description("Проверяет переход на страницу лотов домашняя обувь")
    @Test
    public void searchHomeShoes() {
        catalogPage.navigateToShoes();
    }

    @DisplayName("Каталог - украшения")
    @Description("Проверяет переход на страницу лотов бижутерия")
    @Test
    public void searchDecoration() {
        catalogPage.navigateToDecorations();
    }

    @DisplayName("Каталог - ликвидация")
    @Description("Проверяет переход на страницу лотов ликвидация")
    @Test
    public void searchLiquidation() {
        catalogPage.navigateToLiquidation();
    }
}
