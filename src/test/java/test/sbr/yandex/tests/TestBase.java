package test.sbr.yandex.tests;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.BrowserType;
import test.sbr.yandex.appmanager.ApplicationManager;

public class TestBase {

    protected final static ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass
    public static void start() {
        app.init();
    }

    @Before
    public void goToMarketPage() {
        app.getMainPage().goToMarketPage();
    }

    @After
    public void goToHome() {
        Selenide.open("https://yandex.ru/");
    }

    @AfterClass
    public static void tearDown() {
        app.stop();
    }
}
