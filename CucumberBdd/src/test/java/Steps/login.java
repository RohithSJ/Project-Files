package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class login {

    WebDriver driver;

    @Given("I open the Google homepage")
    public void i_open_the_google_homepage() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // Update with the correct path to chromedriver
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String keyword) {
        driver.findElement(By.name("q")).sendKeys(keyword, Keys.ENTER);
    }

    @Then("I should see the results related to {string}")
    public void i_should_see_the_results_related_to(String keyword) {
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div.g"));
        boolean isRelated = searchResults.stream().anyMatch(result -> result.getText().toLowerCase().contains(keyword.toLowerCase()));
        assert isRelated : "No search results related to " + keyword;
        System.out.println("Search results related to \"" + keyword + "\": " + isRelated);
        driver.quit();
    }
}
