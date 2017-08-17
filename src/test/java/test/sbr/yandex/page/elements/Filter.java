package test.sbr.yandex.page.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import test.sbr.yandex.model.FilterData;

@FindBy(xpath = "//div[@class='n-filter-panel-aside__content']")
public class Filter {
    @FindBy(xpath = "//span[@data-filter='glf,pricefrom,var']//input")
    private SelenideElement from;
    @FindBy(xpath = "//span[@data-filter='glf,priceto,var']//input")
    private SelenideElement to;

    public Filter setPriceFrom(String priceFrom) {
        from.clear();
        from.clear();
        from.setValue(priceFrom);
        return this;
    }

    public Filter setPriceTo(String priceTo) {
        to.clear();
        to.clear();
        to.setValue(priceTo);
        return this;
    }

    public Filter setManufacturer(String manufacturer) {
        Selenide.$$("label.checkbox__label").find(Condition.text(manufacturer)).click();
        return this;
    }

    public void setupFilter() {
        Selenide.$("div.n-filter-panel-aside__apply").click();
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
