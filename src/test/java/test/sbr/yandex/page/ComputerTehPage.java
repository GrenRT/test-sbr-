package test.sbr.yandex.page;

import com.codeborne.selenide.Selenide;
import test.sbr.yandex.page.elements.CatalogMenu;

public class ComputerTehPage {

    private CatalogMenu catalogMenu = Selenide.page(CatalogMenu.class);

    public <T> T openItem(Class<T> clazz, String itemName) {
        return catalogMenu.openItem(clazz, itemName);
    }

}
