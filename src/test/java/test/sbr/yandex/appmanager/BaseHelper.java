package test.sbr.yandex.appmanager;

import com.codeborne.selenide.SelenideElement;

public class BaseHelper {

    public void type(SelenideElement element, String text) {
        element.click();
        if (text != null) {
            String existingText = element.getAttribute("value");
            if (!text.equals(existingText)) {
                element.clear();
                element.setValue(text);
            }
        }
    }
}
