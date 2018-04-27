package integration.steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import integration.pages.CoffeeMachinePage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = {de.lineas.bddemo.Application.class})
public class CoffeeSteps {

    private CoffeeMachinePage page;
    private ChromeDriver driver;

    @Before
    public void init() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://localhost:8082";
        page = new CoffeeMachinePage();
    }
}
