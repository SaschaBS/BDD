package integration.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CoffeeMachinePage {

    private static final String URL = "/coffee";

    private final SelenideElement power = $(By.className("power"));

    public boolean isOn() {
        return power.has(Condition.cssClass("on"));
    }

    public void open() {
        Selenide.open(URL);
    }

}
