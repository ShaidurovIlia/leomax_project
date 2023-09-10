package org.example.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderPage {

    private static final String ACTION = "Актуальные акции Leomax";
    private static final String BRAND = "Бренды";
    private static final String TELECAST = "Товар в эфире";
    private static final String ADVERSTISING = "Ваши любимые товары по выгодной цене";
    private static final String LIQUIDATION = "Ликвидация";

    private final SelenideElement
            action = $("a.bottom-header__link[href='/action/']"),
            actionTitle = $("h1.action-title"),
            brand = $("a.bottom-header__link[href='/brand/']"),
            brandTitle = $x("//span[@itemprop='name' and text()='Бренды']"),
            telecast = $("a.bottom-header__link[href='/telecast/']"),
            telecastTitle = $(".day-good__online-tv"),
            advertising = $("a.bottom-header__link[href='/products/tovary_leomax/']"),
            advertisingTitle = $(".breadcrumb"),
            liquidation = $("a.bottom-header__link.bottom-header__link-liquidation"),
            liquidationTitle = $x("//h1[contains(text(), 'Ликвидация')]");

    public void headersActions() {
        action.click();
        actionTitle.shouldHave(text(ACTION));
    }

    public void headerBrands() {
        brand.click();
        brandTitle.shouldHave(text(BRAND));
    }

    public void headerTelecast() {
        telecast.click();
        telecastTitle.shouldHave(text(TELECAST));
    }

    public void headerAdvertising() {
        advertising.click();
        advertisingTitle.shouldHave(text(ADVERSTISING));
    }

    public void headerLiquidation() {
        liquidation.click();
        liquidationTitle.shouldHave(text(LIQUIDATION));
    }
}
