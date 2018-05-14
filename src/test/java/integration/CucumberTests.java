package integration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources/features",
        format = {
                "json:target/cucumber/cucumber-report.json",
                "html:target/cucumber/plain-html-reports"
        })
public class CucumberTests {

}
