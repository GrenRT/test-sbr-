package test.sbr.yandex.page.elements;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;

@FindBy(xpath = "//div[@class='topmenu__list']")
public class TopMenu {

    public void openItem(String itemName) {
        Selenide.$(String.format("[data-department='%s']", itemName)).click();
    }
}
