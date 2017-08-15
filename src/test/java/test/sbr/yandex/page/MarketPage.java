package test.sbr.yandex.page;

import com.codeborne.selenide.Selenide;
import test.sbr.yandex.page.elements.TopMenu;

public class MarketPage {
    private TopMenu topMenu = Selenide.page(TopMenu.class);

    public void openItem(String itemName) {
        topMenu.openItem(itemName);
    }
}
