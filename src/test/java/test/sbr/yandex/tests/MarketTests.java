package test.sbr.yandex.tests;

import org.junit.Assert;
import org.junit.Test;
import test.sbr.yandex.model.FilterData;
import test.sbr.yandex.page.ComputerTehPage;
import test.sbr.yandex.page.NotebookPage;


public class MarketTests extends TestBase {


    String[] manufacturer = {"HP", "Lenovo"};
    FilterData filterTest1 = new FilterData().withTo("30000").withManufacturer(manufacturer);

    @Test
    public void test1() {
        app.getMarketPage().openItem(ComputerTehPage.class, "Компьютеры")
                .openItem(NotebookPage.class, "Ноутбуки")
                .fillFilterForm(filterTest1)
                .setupFilter();

        Assert.assertEquals(10, app.getNotebookPage().getCountSnippetCard());
    }
}
