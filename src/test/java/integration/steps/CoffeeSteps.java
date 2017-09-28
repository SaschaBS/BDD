package integration.steps;

import cucumber.api.java.Before;
import cucumber.api.java.de.Angenommen;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Und;
import integration.pages.CoffeeMachinePage;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = {de.lineas.bddemo.Application.class})
public class CoffeeSteps {

    private CoffeeMachinePage page;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        page = new CoffeeMachinePage();
    }

    @Angenommen("^Ich betrachte die Kaffeemaschine$")
    public void ichBetrachteDieKaffeemaschine() throws Throwable {
        page.open();
    }

    @Und("^die Kaffemaschine wurde noch nicht eingeschaltet$")
    public void dieKaffemaschineWurdeNochNichtEingeschaltet() throws Throwable {
        assertFalse(page.isOn());
    }

    @Dann("^zeigt das Display zeigt die Nachricht \"([^\"]*)\"$")
    public void zeigtDasDisplayZeigtDieNachricht(String arg0) throws Throwable {
        assertEquals(arg0, page.getMessage());
    }

    @Und("^ich schalte die Kaffemaschine ein$")
    public void ichSchalteDieKaffemaschineEin() throws Throwable {
        page.turnOn();
    }

    @Dann("^leuchtet der Einschaltknopf grün$")
    public void leuchtetDerEinschaltknopfGruen() throws Throwable {
        assertTrue(page.isOn());
    }

    @Und("^das Display zeigt die Nachricht \"([^\"]*)\" an$")
    public void dasDisplayZeigtDieNachrichtAn(String arg0) throws Throwable {
        assertEquals(arg0, page.getMessage());
    }

    @Und("^die eingestellte Sprache ist \"([^\"]*)\"$")
    public void dieEingestellteSpracheIst(String arg0) throws Throwable {
        page.setLanguage(arg0);
        assertEquals(arg0, page.getLanguage());
    }

    @Dann("^zeigt das Display zeigt die Nachricht \"([^\"]*)\" an$")
    public void zeigtDasDisplayZeigtDieNachrichtAn(String arg0) throws Throwable {
        assertEquals(arg0, page.getMessage());
    }
}
