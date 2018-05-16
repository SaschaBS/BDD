package integration.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import cucumber.api.java.de.Angenommen;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Und;
import integration.pages.CoffeeMachinePage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = {de.lineas.bddemo.Application.class})
public class CoffeeSteps {

    private CoffeeMachinePage page;

    @Before
    public void setup() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://localhost:8082";
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
        assertEquals("rgba(0, 128, 0, 1)", page.getPowerButtonColor());
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

    @Angenommen("^Die Kaffeemaschine ist eingeschaltet$")
    public void dieKaffeemaschineIstEingeschaltet() throws Throwable {
        page.open();
        page.turnOn();
    }

    @Und("^das Serviceintervall wurde erreicht$")
    public void dasServiceintervallWurdeErreicht() throws Throwable {
        page.setServiceInterval("1");
        page.insertPot();
        page.brew();
    }

    @Und("^die Servicenachricht wird angezeigt$")
    public void dieServicenachrichtWirdAngezeigt() throws Throwable {
        assertEquals("Please clean the machine", page.getMessage());
    }


    @Und("^es ist kein Becher untergestellt$")
    public void esIstKeinBecherUntergestellt() throws Throwable {
        assertFalse(page.hasPot());
    }

    @Und("^ich drücke den Knopf für Kaffee$")
    public void ichDrueckeDenKnopfFuerKaffee() throws Throwable {
        page.brew();
    }

    @Dann("^wird kein Kaffee ausgegeben$")
    public void wirdKeinKaffeeAusgegeben() throws Throwable {
        assertFalse(page.hasCoffee());
    }

    @Und("^im Display wird angezeigt, dass der Benutzer eine Tasse unterstellen muss$")
    public void imDisplayWirdAngezeigtDassDerBenutzerEineTasseUnterstellenMuss() throws Throwable {
        assertEquals("Please insert coffee pot!", page.getMessage());
    }

    @Und("^ich stelle einen Kaffeebecher in die Maschine$")
    public void ichStelleEinenKaffeebecherInDieMaschine() throws Throwable {
        page.insertPot();
    }

    @Und("^es ist Kaffee im Becher$")
    public void esIstKaffeeImBecher() throws Throwable {
        page.hasCoffee();
    }

    @Dann("^wird kein weiterer Kaffee ausgegeben$")
    public void wirdKeinWeitererKaffeeAusgegeben() throws Throwable {
        assertEquals("Please take your coffee!", page.getMessage());
    }

    @Und("^es wird die Nachricht ausgegeben, dass der Kaffee zuerst entnommen werden muss$")
    public void esWirdDieNachrichtAusgegebenDassDerKaffeZuerstEntnommenWerdenMuss() throws Throwable {
        assertEquals("Please take your coffee!", page.getMessage());
    }

    @Und("^ich nehme den Becher aus der Maschine$")
    public void ichNehmeDenBecherAusDerMaschine() throws Throwable {
        page.takeCoffee();
    }

    @Dann("^wird ein Kaffee ausgegeben$")
    public void wirdEinKaffeeAusgegeben() throws Throwable {
        assertTrue(page.hasCoffee());
    }

    @Dann("^wird nach (\\d+) Sekunden die Nachricht ausgeblendet$")
    public void wirdNachSekundenDieNachrichtAusgeblendet(int arg0) throws Throwable {
        $(".message").waitUntil(Condition.exactText("Welcome!"), arg0 * 1000);
    }

    @Und("^ich drücke den Knopf für die automatische Reinigung$")
    public void ichDrueckeDenKnopfFuerDieAutomatischeReinigung() throws Throwable {
        page.clean();
    }


}
