package test.sbr.yandex.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import test.sbr.yandex.page.MainPage;
import test.sbr.yandex.page.MarketPage;

import static com.codeborne.selenide.Selenide.close;

public class ApplicationManager {
    private MainPage mainPage;
    private MarketPage marketPage;

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

    public void init() {
        Configuration.timeout = 3000;
        Configuration.browser = browser;
        Selenide.open("https://yandex.ru/");
    }

    public void stop() {
        close();
    }

}
