package test.sbr.yandex.tests;

import org.junit.Test;

public class MarketTests extends TestBase {

    @Test
    public void test1() {
        app.getMarketPage().openItem("Компьютеры");
    }
}
