package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features/PostRequest.feature",
    glue = {"StepDefinitions"},
    plugin = {"pretty", "html:test-output"},
    monochrome = true
   
)
public class Testrunner {
}
