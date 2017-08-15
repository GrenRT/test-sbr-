package test.sbr.yandex.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.BrowserType;
import test.sbr.yandex.appmanager.ApplicationManager;

public class TestBase {

    protected final static ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @Before
    public void openMarket() {
        app.init();
        app.getMainPage().goToMarketPage();
    }

    @After
    public void tearDown() {
        app.stop();
    }
}
