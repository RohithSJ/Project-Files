package TestngAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the login page
        driver.get("https://magento.softwaretestingboard.com/");
    }
    
    
    @Test(priority=1)
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
    
    
    
    
    
    
    

    @Test(priority=2)
    public void navigateToTees() {
        // Initialize WebDriverWait with a 50-second timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        Actions actions = new Actions(driver);

        // Locate the "Men" menu item
        WebElement menMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]")));
        
        // Hover over the "Men" menu item
        actions.moveToElement(menMenu).perform();

        // Wait for the "Tops" submenu to be visible and locate it
        WebElement topsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-17']//span[contains(text(),'Tops')]")));
        
        // Hover over the "Tops" submenu
        actions.moveToElement(topsMenu).perform();

        // Wait for the "Tees" submenu to be visible and locate it
        WebElement teesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-21']//span[contains(text(),'Tees')]")));
        
        // Click the "Tees" submenu
        actions.moveToElement(teesMenu).click().perform();

        // Verify that the user is navigated to the "Tees" page
        WebElement pageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".page-title")));
        Assert.assertTrue(pageTitle.getText().contains("Tees"), "The page title does not contain 'Tees'");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
