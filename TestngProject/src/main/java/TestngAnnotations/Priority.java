package TestngAnnotations;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
    
    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize the ChromeDriver
        driver = new ChromeDriver();
        
        // Initialize WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
     // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the login page
        driver.get("https://www.appario.in/");
    }

    @Test(priority=1)
    public void ApparioTitleTest() {
    	
    	 // Explicit wait for the page title to be present
        wait.until(ExpectedConditions.titleIs("Appario Retail Private Ltd")); // Replace "Expected Title" with the actual title you expect

    	
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Appario Retail Private Ltd"); 
    }

    @Test(priority=3)
    public void ApparioLogoTest() {
        boolean b = driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();
        System.out.println("Logo is displayed: " + b);
        // You can add assertion here to validate the logo presence
    }

    @Test(priority=2)
    public void ApparioLinkTest() {
        driver.findElement(By.xpath("//a[@class='btn btn-secondary btn-block orange-btn mt-3']")).click();
        // You might want to add assertions or verifications after the click action
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
