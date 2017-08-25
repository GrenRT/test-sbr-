package test.sbr.yandex.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import test.sbr.yandex.page.*;

import static com.codeborne.selenide.Selenide.close;

public class ApplicationManager {
    private MainPage mainPage;
    private MarketPage marketPage;
    private ItemListPage itemListPage;
    private ComputerTehPage computerTehPage;
    private ProductSummaryPage productSummaryPage;

    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public MainPage getMainPage() {
        if (mainPage == null)
            mainPage = Selenide.page(MainPage.class);
        return mainPage;
    }

    public MarketPage getMarketPage() {
        if (marketPage == null)
            marketPage = Selenide.page(MarketPage.class);
        return marketPage;
    }

    public ComputerTehPage getComputerTehPage() {
        if (computerTehPage == null)
            computerTehPage = Selenide.page(ComputerTehPage.class);
        return computerTehPage;
    }

    public ItemListPage getItemListPage() {
        if (itemListPage == null)
            itemListPage = Selenide.page(ItemListPage.class);
        return itemListPage;
    }

    public ProductSummaryPage getProductSummaryPage() {
        if (productSummaryPage == null)
            productSummaryPage = Selenide.page(ProductSummaryPage.class);
        return productSummaryPage;
    }

    public void init() {
        Configuration.timeout = 10000;
        Configuration.browser = browser;
        Selenide.open("https://yandex.ru/");
    }

    public void stop() {
        close();
    }

}
