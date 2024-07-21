package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.HeaderPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс HeaderTest")
public class HeaderTest extends BaseTest {

    HeaderPage header = new HeaderPage();

    @DisplayName("Акции")
    @Description("Проверяет переход на страницу страницу акции")
    @Test
    public void checkAction() {
        header.clickActionsLink();
    }

    @DisplayName("Бренды")
    @Description("Проверяет переход на страницу бренды")
    @Test
    public void checkBrand() {
        header.clickBrandsLink();
    }

    @DisplayName("Лайв трансляция")
    @Description("Проверяет переход на страницу лайв трансляции")
    @Test
    public void checkTelecast() {
        header.clickTelecastLink();
    }

    @DisplayName("Товары из рекламы")
    @Description("Проверяет переход на страницу товары из рекламы")
    @Test
    void checkAdvertising() {
        header.clickAdvertisingLink();
    }

    @DisplayName("Новая коллекция")
    @Description("Проверяет переход на страницу новая коллекция")
    @Test
    void checkNewCollection() {
        header.clickCollectionLink();
    }

    @DisplayName("Идеи для подарков")
    @Description("Проверяет переход на страницу идеи для подарков")
    @Test
    void checkIdeaForPresent() {
        header.clickIdeaForPresent();
    }

    @DisplayName("Баннер карта москвича")
    @Description("Проверяет переход на страницу баннера карта москвича")
    @Test
    void checkMskBanner() {
        header.clickMskCardBannerLink();
    }

    @DisplayName("Баннер Много.ру от leomax")
    @Description("Проверяет переход на страницу баннера много.ру")
    @Test
    void checkMnogoRuBanner() {
        header.clickMnogoRuBannerLink();
    }

    @DisplayName("Баннер рассрочка от leomax")
    @Description("Проверяет  переход на страницу баннера рассрочку от leomax")
    @Test
    void checkPaymentBanner() {
        header.clickPaymentBannerLink();
    }

    @Disabled("Сейчас баннер не активен")
    @DisplayName("Баннер халва")
    @Description("Проверяет  переход на страницу баннера халва")
    @Test
    void checkHalvaBanner() {
        header.clickHalvaBannerLink();
    }

    @DisplayName("Баннер приведи друга")
    @Description("Проверяет переход на страницу баннера приведи друга")
    @Test
    void checkBonusBanner() {
        header.clickBonusBannerLink();
    }

    @DisplayName("Баннер жидкая резина")
    @Description("Проверяет переход на страницу баннера жидкая резина")
    @Test
    void checkRubberBanner() {
        header.clickRubberBannerLink();
    }

    @DisplayName("Баннер скидка для мобильного приложения")
    @Description("Проверяет переход на страницу баннера скидка для мобильного приложения")
    @Test
    void checkMobileBanner() {
        header.clickMobileBannerLink();
    }

    @Disabled("Не работает выбор элемента из выпадающего списка")
    @DisplayName("Проверка выбора региона в модальном окне")
    @Description("Проверяет что на главной странице отображается выбранный регион")
    @Test
    public void checkModalRegion() {
        header.enterCityAndSelect();
    }

    @Disabled("Сейчас баннер не активен")
    @DisplayName("Баннер ликвидация в leomax")
    @Description("Проверяет переход на страницу баннера ликвидация в leomax")
    @Test
    void checkLiquidationBanner() {
        header.clickLiquidationBannerLink();
    }

    @Disabled("Сейчас баннер не активен")
    @DisplayName("Баннер все по 999")
    @Description("Проверяет переход на страницу баннера все по 999")
    @Test
    void checkFixPriceBanner() {
        header.clickFixPriceBannerLink();
    }

    @Disabled("Сейчас баннер не активен")
    @DisplayName("Баннер товар выходного дня")
    @Description("Проверяет переход на страницу баннера товар выходного дня")
    @Test
    void checkDayOffBanner() {
        header.clickDayOffBannerLink();
    }

    @Disabled("Сейчас баннер не активен")
    @DisplayName("Баннер больше покупка")
    @Description("Проверяет переход на страницу баннера большая покупка")
    @Test
    void checkBigSaleBanner() {
        header.clickActionBannerLink();
    }

    @Disabled("Сейчас баннер не активен")
    @DisplayName("Баннер товары из TV-рекламы")
    @Description("Проверяет переход на страницу баннера товары из TV-рекламы")
    @Test
    void checkTvProductBanner() {
        header.clickTvProductsBannerLink();
    }
}