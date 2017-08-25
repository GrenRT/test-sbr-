package test.sbr.yandex.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import test.sbr.yandex.model.SnippetCardData;

import java.util.List;

public class ProductSummaryPage {

    @FindBy(xpath = "//div[@class='n-product-title']//h1")
    private SelenideElement model;
    @FindBy(xpath = "//ul[@class='n-product-spec-list']")
    private SelenideElement description;

    public String getModel() {
        return model.getText();
    }

    public List<String> getDescription() {
        return description.$$(By.tagName("li")).texts();
    }

    public SnippetCardData getSnippetCardData() {
        return new SnippetCardData().withModel(getModel()).withDescription(getDescription());
    }
}
