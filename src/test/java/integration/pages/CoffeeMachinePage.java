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

    public String getMessage() {
        return display.getText();
    }

    public boolean isOn() {
        return power.has(Condition.cssClass("on"));
    }

    public void open() {
        Selenide.open(URL);
    }


}
