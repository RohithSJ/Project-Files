package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Feature/APITesting.feature",
    glue = {"StepDefinitions"},
    plugin = {"pretty", "html:target/HtmlReports/report.html"},
    monochrome = true,
    tags = "not @Ignore"
   
)


public class TestRunner {
}
