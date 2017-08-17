package test.sbr.yandex.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import test.sbr.yandex.page.ComputerTehPage;
import test.sbr.yandex.page.MainPage;
import test.sbr.yandex.page.MarketPage;
import test.sbr.yandex.page.NotebookPage;

import static com.codeborne.selenide.Selenide.close;

public class ApplicationManager {
    private MainPage mainPage;
    private MarketPage marketPage;
    private NotebookPage notebookPage;
    private ComputerTehPage computerTehPage;

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

    public NotebookPage getNotebookPage() {
        if (notebookPage == null)
            notebookPage = Selenide.page(NotebookPage.class);
        return notebookPage;
    }

    public void init() {
        Configuration.timeout = 5000;
        Configuration.browser = browser;
        Selenide.open("https://yandex.ru/");
    }

    public void stop() {
        close();
    }

}
