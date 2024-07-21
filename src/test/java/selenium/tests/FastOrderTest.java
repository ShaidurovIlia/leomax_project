package selenium.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.FastOrderPage;

@Owner(value = "Илья Шайдуров")
@DisplayName("Класс FastOrderTest")
public class FastOrderTest extends BaseTest {
    FastOrderPage fastOrderPage = new FastOrderPage();
    @DisplayName("Быстрый заказ из КТ")
    @Description("Проверяет работу быстрого заказа из КТ")
    @Test
    void fastOrderInCardProduct() {
        fastOrderPage.form();
    }
}
