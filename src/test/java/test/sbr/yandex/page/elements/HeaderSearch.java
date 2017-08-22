package test.sbr.yandex.page.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import test.sbr.yandex.appmanager.BaseHelper;

@FindBy(xpath = "//form")
public class HeaderSearch extends BaseHelper {

    @FindBy(xpath = "//input[@id='header-search']")
    private SelenideElement search;
    @FindBy(xpath = "//span[@class='search2__button']")
    private SelenideElement find;

    public void startSearch(String value) {
        type(search, value);
        find.click();
    }
}
