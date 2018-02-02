package integration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
//        features = "src/test/resources/features",
        features = {"src/test/resources/test/features", "build/generated-test-sources/cucumber"},
        format = {
                "json:target/cucumber/cucumber-report.json",
                "html:target/cucumber/plain-html-reports"
        })
public class CucumberTests {

}
