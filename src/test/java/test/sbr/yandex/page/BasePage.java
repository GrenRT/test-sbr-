package test.sbr.yandex.page;

import com.codeborne.selenide.Selenide;
import test.sbr.yandex.page.elements.HeaderSearch;

public class BasePage {

    private HeaderSearch search = Selenide.page(HeaderSearch.class);

    public ItemListPage startSearch(String value) {
        search.startSearch(value);
        return Selenide.page(ItemListPage.class);
    }
}
