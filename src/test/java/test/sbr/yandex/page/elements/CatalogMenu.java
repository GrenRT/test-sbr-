package test.sbr.yandex.page.elements;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

@FindBy(xpath = "//div[@class='catalog-menu']")
public class CatalogMenu {

    public void openItem(String itemName) {
        Selenide.$$("a.catalog-menu__list-item")
                .find(text(itemName)).shouldBe(visible).click();
    }

    public <T> T openItem(Class<T> clazz, String itemName) {
        Selenide.$$("a.catalog-menu__list-item")
                .find(text(itemName)).shouldBe(visible).click();
        return Selenide.page(clazz);
    }

}
