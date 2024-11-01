package selenium.pages;

import com.codeborne.selenide.SelenideElement;
import selenium.components.PopularLocationNew;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HeaderPageNew {

    private final String TITLE_ACTION = "Актуальные акции Leomax";
    private final String TITLE_NEW_COLLECTION = "Актуальные акции Leomax";

    private final SelenideElement
            action = $(".bottom-header__link[href=\"/action/\"]"),
            actionTitle = $(".action-title"),
            newCollection = $("a[href='https://bitrix-dev.k8s.teledirekt.ru/action/novaya_kollektsiya/?SORT=NEW%3BDESC']"),
            newCollectionTitle = $(".MuiTypography-root.MuiTypography-h1.mui-ptboy0");

    public HeaderPageNew openPage() {
        open("https://bitrix-dev.k8s.teledirekt.ru/");
        PopularLocationNew.closePopupIfDisplayed();
        action.click();
        actionTitle.shouldHave(text(TITLE_ACTION));
        return this;
    }

    public HeaderPageNew openPageNewCollection() {
        open("https://bitrix-dev.k8s.teledirekt.ru/");
        newCollection.click();
        newCollectionTitle.shouldHave(text(TITLE_NEW_COLLECTION));
        return this;
    }
}
