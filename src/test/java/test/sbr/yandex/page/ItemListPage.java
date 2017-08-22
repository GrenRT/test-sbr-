package test.sbr.yandex.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import test.sbr.yandex.model.FilterData;
import test.sbr.yandex.model.SnippetCardData;
import test.sbr.yandex.page.elements.Filter;

import java.util.List;

public class ItemListPage extends BasePage {

    private Filter filter = Selenide.page(Filter.class);

    public ItemListPage fillFilterForm(FilterData filterData) {
        filter.fillForm(filterData);
        return this;
    }

    public ItemListPage setupFilter() {
        filter.setupFilter();
        return this;
    }

    public int getCountSnippetCard() {
        return Selenide.$$(".n-snippet-card").size();
    }

    public SnippetCardData getSnippetCardData(int index) {

        SelenideElement snippetCard = Selenide.$$(".n-snippet-card").get(index);

        String model = snippetCard.$("span.snippet-card__header-text").getText();
        List<String> description = snippetCard.$("ul.snippet-card__desc-list").$$("li").texts();

        SnippetCardData snippetCardData =
                new SnippetCardData().withModel(model).withDescription(description);

        return snippetCardData;
    }
}
