package test.sbr.yandex.page.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

@FindBy(xpath = "//div[@class='n-filter-panel-aside__content']")
public class Filter {
    @FindBy(xpath = "//span[@data-filter='glf,pricefrom,var']")
    private SelenideElement from;
    @FindBy(xpath = "//span[@data-filter='glf,priceto,var']")
    private SelenideElement to;

    public Filter setPriceFrom(String priceFrom) {
        from.clear();
        from.clear();
        from.setValue(priceFrom);
        return this;
    }

    public Filter setManufacturer(String manufacturer) {
        Selenide.$$("label.checkbox__label").find(Condition.text(manufacturer)).click();
        return this;
    }

    public void setupFilter() {
        Selenide.$("div.n-filter-panel-aside__apply").click();
    }

}
