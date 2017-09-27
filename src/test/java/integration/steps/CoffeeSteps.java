package integration.steps;

import cucumber.api.java.Before;
import cucumber.api.java.de.Angenommen;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Und;
import integration.pages.CoffeeMachinePage;
import org.openqa.selenium.By;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = {de.lineas.bddemo.Application.class})
public class CoffeeSteps {

    private CoffeeMachinePage page;

    @Before
    public void nice() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
//        page = new CoffeeMachinePage();
    }

    @Angenommen("^Ich betrachte die Kaffeemaschine$")
    public void ichBetrachteDieKaffeemaschine() throws Throwable {
//        page.open();
        open("http://localhost:8080/coffee");
        $("title").shouldHave(attribute("text", "Tasty coffee!"));
    }

    @Und("^die Kaffemaschine wurde noch nicht eingeschaltet$")
    public void dieKaffemaschineWurdeNochNichtEingeschaltet() throws Throwable {
        $(By.className("power")).shouldNotHave(cssClass("on"));
//        assertFalse(page.isOn());
    }

    @Dann("^zeigt das Display zeigt die Nachricht \"([^\"]*)\"$")
    public void zeigtDasDisplayZeigtDieNachricht(String arg0) throws Throwable {
        $(By.className("message")).is(text(arg0));
//        assertEquals(arg0, page.getMessage());
    }
}
