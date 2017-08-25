package test.sbr.yandex.tests;

import org.junit.Assert;
import org.junit.Test;
import test.sbr.yandex.model.FilterData;
import test.sbr.yandex.model.SnippetCardData;
import test.sbr.yandex.page.ComputerTehPage;
import test.sbr.yandex.page.ItemListPage;


public class TestMarket extends TestBase {


    protected String[] manufacturer1 = {"HP", "Lenovo"};
    protected FilterData filterTest1 = new FilterData().withTo("30000").withManufacturer(manufacturer1);
    protected String[] manufacturer2 = {"Acer", "DELL"};
    protected FilterData filterTest2 = new FilterData().withFrom("20000").withTo("25000").withManufacturer(manufacturer2);

    @Test
    public void test1() {
        app.getMarketPage().openItem(ComputerTehPage.class, "Компьютеры")
                .openItem(ItemListPage.class, "Ноутбуки")
                .fillFilterForm(filterTest1)
                .setupFilter();

        Assert.assertEquals(12, app.getItemListPage().getCountSnippetCard());

        SnippetCardData firstResult = app.getItemListPage().getSnippetCardData(0);

        app.getItemListPage()
                .startSearch(firstResult.getModel());

        SnippetCardData searchResult = app.getProductSummaryPage().getSnippetCardData();

        Assert.assertEquals(firstResult.getModel(), searchResult.getModel());
    }

    @Test
    public void test2() {
        app.getMarketPage().openItem(ComputerTehPage.class, "Компьютеры")
                .openItem(ItemListPage.class, "Планшеты")
                .fillFilterForm(filterTest2)
                .setupFilter();

        Assert.assertEquals(12, app.getItemListPage().getCountSnippetCard());

        SnippetCardData firstResult = app.getItemListPage().getSnippetCardData(0);

        app.getItemListPage()
                .startSearch(firstResult.getModel());

        SnippetCardData searchResult = app.getProductSummaryPage().getSnippetCardData();

        Assert.assertEquals(firstResult.getModel(), searchResult.getModel());
    }
}
