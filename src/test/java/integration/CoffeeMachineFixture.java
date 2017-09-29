package integration;

import integration.pages.CoffeeMachinePage;
import org.chiknrice.test.SpringifiedConcordionRunner;
import org.concordion.api.ConcordionResources;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SuppressWarnings("TestFixtureIsNotAnnotatedWithConcordionRunner")
@RunWith(SpringifiedConcordionRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = {de.lineas.bddemo.Application.class})
@ConcordionResources({"images/machine.jpg"})
public class CoffeeMachineFixture {

    private CoffeeMachinePage page;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        page = new CoffeeMachinePage();
        page.open();
        page.setLanguage("de");
    }

    public boolean isNotTurnedOn() {
        return !page.isOn();
    }

    public String getMessage() {
        return page.getMessage();
    }

    public void turnOn() {
        page.turnOn();
    }

    public boolean isTurnedOn() {
        return page.isOn();
    }
}
