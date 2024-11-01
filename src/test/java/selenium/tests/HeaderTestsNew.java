package selenium.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenium.core.BaseExtended;
import selenium.pages.HeaderPageNew;

@Owner(value = "Илья")
@DisplayName("Класс BasketTest")
public class HeaderTestsNew extends BaseExtended {

    HeaderPageNew pageNew = new HeaderPageNew();

    @Test
    void checkHeaderPage() {
        pageNew.openPage();
    }

    @Test
    void checkHeaderNewCollectionPage() {
        pageNew.openPageNewCollection();
    }
}
