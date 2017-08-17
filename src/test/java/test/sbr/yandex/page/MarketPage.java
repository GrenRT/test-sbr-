package test.sbr.yandex.page;

import com.codeborne.selenide.Selenide;
import test.sbr.yandex.page.elements.TopMenu;

public class MarketPage {
    private TopMenu topMenu = Selenide.page(TopMenu.class);

    public <T> T openItem(Class<T> clazz, String itemName) {
        return topMenu.openItem(clazz, itemName);
    }

    public void openItem(String itemName) {
        topMenu.openItem(itemName);
    }
}
