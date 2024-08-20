package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features/google.feature",
    glue = "Steps",
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true
  
)




public class testrunner {
	
  
}



