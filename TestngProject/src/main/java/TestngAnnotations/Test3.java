package TestngAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test3 {

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

    @Test(priority = 1)
    public void searchTest() {
    	
        // Using explicit wait to ensure the search box is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

        // Enter a search term and submit
        searchBox.sendKeys("shirt");
        searchBox.submit();

        // Set implicit wait for other elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

      
    }

    @Test(priority = 2)
    public void navigateToTees() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        Actions actions = new Actions(driver);

        WebElement menMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]")));
        actions.moveToElement(menMenu).perform();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));


        WebElement topsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-17']//span[contains(text(),'Tops')]")));
        actions.moveToElement(topsMenu).perform();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));


        WebElement teesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-21']//span[contains(text(),'Tees')]")));
        actions.moveToElement(teesMenu).click().perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

       
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
