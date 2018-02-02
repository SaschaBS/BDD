package integration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
//        features = "src/test/resources/features",
        features = {"build/resources/test/features", "build/generated-test-sources/cucumber"},
        format = {
                "json:build/reports/cucumber/cucumber-report.json",
                "html:build/reports/cucumber/plain-html-reports"
        })
public class CucumberTests {

}
