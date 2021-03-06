package test.sbr.yandex.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(xpath = "//a[@data-id='market']")
    private SelenideElement market;

    public MarketPage goToMarketPage() {
        market.shouldBe(Condition.visible).click();
        return new MarketPage();
    }
}
