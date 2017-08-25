package test.sbr.yandex.page.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import test.sbr.yandex.appmanager.BaseHelper;
import test.sbr.yandex.model.FilterData;

@FindBy(xpath = "//div[@class='n-filter-panel-aside__content']")
public class Filter extends BaseHelper {
    @FindBy(xpath = "//span[@data-filter='glf,pricefrom,var']//input")
    private SelenideElement from;
    @FindBy(xpath = "//span[@data-filter='glf,priceto,var']//input")
    private SelenideElement to;
    @FindBy(xpath = "//button[@data-bem='{\"button\":{\"type\":\"all\"}}']")
    private SelenideElement more;
    @FindBy(xpath = "(//div[@class='n-filter-panel-aside__content']//input[@class='input__control'])[3]")
    private SelenideElement manufacturerSearch;

    public Filter setPriceFrom(String priceFrom) {
        type(from, priceFrom);
        waitLoadResult();
        return this;
    }

    public Filter setPriceTo(String priceTo) {
        type(to, priceTo);
        waitLoadResult();
        return this;
    }

    public Filter setManufacturer(String manufacturer) {
        SelenideElement item =
                Selenide.$$("label.checkbox__label").find(Condition.text(manufacturer));

        if (item.exists()) {
            Selenide.$$("label.checkbox__label").find(Condition.text(manufacturer)).click();
        } else {
            more.click();
            type(manufacturerSearch, manufacturer);
            Selenide.$$("label.checkbox__label")
                    .find(Condition.text(manufacturer))
                    .click();
        }
        return this;
    }

    public void setupFilter() {
        Selenide.$("div.n-filter-panel-aside__apply").click();
        waitLoadResult();
    }

    private void waitLoadResult() {
        Selenide.$("div.n-filter-panel-counter").shouldBe(Condition.visible);//не работает сцуко
    }

    public void fillForm(FilterData filterData) {
        if (filterData.getFrom() != null)
            setPriceFrom(filterData.getFrom());
        if (filterData.getTo() != null)
            setPriceTo(filterData.getTo());
        if (filterData.getManufacturer() != null) {
            for (String s : filterData.getManufacturer()) {
                setManufacturer(s);
            }
        }
    }
}
