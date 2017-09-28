package integration.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CoffeeMachinePage {

    private static final String URL = "http://localhost:8080/coffee";

    private final SelenideElement power = $(By.className("power"));

    private final SelenideElement display = $(By.className("message"));

    private final SelenideElement language = $(By.name("language"));

    public String getMessage() {
        return display.getText();
    }

    public boolean isOn() {
        return power.has(Condition.cssClass("on"));
    }

    public void turnOn() {
        power.click();
    }

    public void open() {
        Selenide.open(URL);
    }

    public String getLanguage() {
        return language.getSelectedValue();
    }

    public void setLanguage(String language) {
        this.language.selectOptionByValue(language);
    }
}
