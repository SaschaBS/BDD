package integration.steps;

import cucumber.api.java.Before;
import cucumber.api.java.de.Angenommen;
import cucumber.api.java.de.Dann;
import org.openqa.selenium.By;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = {de.lineas.bddemo.Application.class})
public class StepDefs_v2 {

    @Before
    public void nice() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
    }

    @Angenommen("^ich bin auf der Begruessungsseite$")
    public void ich_bin_auf_der_Begruessungsseite() throws Throwable {
        open("http://localhost:8080/greeting");
    }

    @Dann("^wird als Titel \"([^\"]*)\" angezeigt$")
    public void wird_als_Titel_angezeigt(String arg1) throws Throwable {
        $("title").shouldHave(attribute("text", "Getting Started: Handling Form Submission"));
    }

    @Angenommen("^trage im Feld \"([^\"]*)\" \"([^\"]*)\" ein$")
    public void trage_im_Feld_ein(String arg1, String arg2) throws Throwable {
        $(By.name(arg1)).setValue(arg2);
    }

    @Angenommen("^druecke Abschicken$")
    public void druecke_Abschicken() throws Throwable {
        $$("input").findBy(type("submit")).click();
//        $("#submit").click();
    }

    @Dann("^wird die Ergebnisseite angezeigt$")
    public void wird_die_Ergebnisseite_angezeigt() throws Throwable {
        $("title").shouldHave(attribute("text", "Success!"));
    }

    @Dann("^im ID Feld steht \"([^\"]*)\"$")
    public void im_ID_Feld_steht(String arg1) throws Throwable {
        $$("p").filter(text("id:")).shouldHave(texts(arg1));
    }

    @Dann("^im Inhaltsfeld steht \"([^\"]*)\"$")
    public void im_Inhaltsfeld_steht(String arg1) throws Throwable {
        $$("p").filter(text("content:")).shouldHave(texts(arg1));
    }

    @Dann("^man kann zurueck zur Eingabe gehen$")
    public void man_kann_zurueck_zur_Eingabe_gehen() throws Throwable {
        $("[href=\"/greeting\"]").exists();
    }

}
