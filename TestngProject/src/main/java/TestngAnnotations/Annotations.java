package TestngAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Annotations {

   WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize the ChromeDriver
        driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the login page
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void searchTest() {
        // Using explicit wait to ensure the search box is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
        
        // Enter a search term and submit
        searchBox.sendKeys("shirt");
        searchBox.submit();
        
        // Set implicit wait for other elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
       
        // Verify that search results are displayed
        WebElement searchResults = driver.findElement(By.cssSelector(".product-items"));
        Assert.assertTrue(searchResults.isDisplayed(), "Search results are not displayed");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
