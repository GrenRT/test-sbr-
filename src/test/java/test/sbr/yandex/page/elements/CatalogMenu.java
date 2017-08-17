package test.sbr.yandex.page.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;

@FindBy(xpath = "//div[@class='catalog-menu']")
public class CatalogMenu {

    public void openItem(String itemName) {
        Selenide.$$(".catalog-menu__item")
                .find(Condition.text(itemName)).click();
    }

    public <T> T openItem(Class<T> clazz, String itemName) {
        Selenide.$$(".catalog-menu__item")
                .find(Condition.text(itemName)).click();
        return Selenide.page(clazz);
    }

}
