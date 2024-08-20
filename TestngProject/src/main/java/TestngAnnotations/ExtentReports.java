package TestngAnnotations;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class ExtentReports {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeMethod
    public void setUp() {
        // Initialize ExtentReports
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./extent-reports/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        // Create a test case
        test = extent.createTest("ScreenShot Test Suite");

        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test(priority = 1)
    public void searchTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

        // Enter a search term and submit
        searchBox.sendKeys("shirt");
        searchBox.submit();

        // Sleep for 5 seconds to allow the search results to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        test.info("Search test completed.");
    }

    @Test(priority = 2)
    public void navigateToTees() throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Actions actions = new Actions(driver);

        WebElement menMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]")));
        actions.moveToElement(menMenu).perform();

        // Sleep for 5 seconds to ensure the "Men" menu is properly hovered
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement topsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-17']//span[contains(text(),'Tops')]")));
        actions.moveToElement(topsMenu).perform();

        // Sleep for 5 seconds to ensure the "Tops" submenu is properly hovered
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement teesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-21']//span[contains(text(),'Tees')]")));
        actions.moveToElement(teesMenu).click().perform();

        // Take a screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File trgFile = new File("./screenshots/teesPage.png");
        FileUtils.copyFile(srcFile, trgFile);
        test.info("Screenshot taken and saved to: " + trgFile.getAbsolutePath());

        // Verify that the "Tees" page is loaded
        WebElement pageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".page-title")));
        Assert.assertTrue(pageTitle.getText().contains("Tees"), "The page title does not contain 'Tees'");

        WebElement ddown = driver.findElement(By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]"));
        Select select = new Select(ddown);
        select.selectByIndex(2);

        // Sleep for 5 seconds to ensure the sorting operation is completed
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print product names and prices
        List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
        for (WebElement product : products) {
            String productName = product.findElement(By.cssSelector(".product-item-name")).getText();
            String productPrice = product.findElement(By.cssSelector(".price")).getText();
            System.out.println("Product Name: " + productName + " | Price: " + productPrice);
            test.info("Product Name: " + productName + " | Price: " + productPrice);
        }

        test.info("Tees page navigation and sorting completed.");
    }

    @Test(priority = 3)
    public void screenshot() throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Actions actions = new Actions(driver);

        WebElement menMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]")));
        actions.moveToElement(menMenu).perform();

        // Sleep for 5 seconds to ensure the "Men" menu is properly hovered
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement topsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-17']//span[contains(text(),'Tops')]")));
        actions.moveToElement(topsMenu).perform();

        // Sleep for 5 seconds to ensure the "Tops" submenu is properly hovered
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement teesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-21']//span[contains(text(),'Tees')]")));
        actions.moveToElement(teesMenu).click().perform();

        // Sleep for 5 seconds to ensure the "Tees" page is properly loaded
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Take a screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File trgFile = new File("./screenshots/teesPage.png");
        FileUtils.copyFile(srcFile, trgFile);
        test.info("Screenshot taken and saved to: " + trgFile.getAbsolutePath());

        // Verify that the "Tees" page is loaded
        WebElement pageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".page-title")));
        Assert.assertTrue(pageTitle.getText().contains("Tees"), "The page title does not contain 'Tees'");

        WebElement ddown = driver.findElement(By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]"));
        Select select = new Select(ddown);
        select.selectByIndex(2);

        // Sleep for 5 seconds to ensure the sorting operation is completed
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print product names and prices
        List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
        for (WebElement product : products) {
            String productName = product.findElement(By.cssSelector(".product-item-name")).getText();
            String productPrice = product.findElement(By.cssSelector(".price")).getText();
            System.out.println("Product Name: " + productName + " | Price: " + productPrice);
            test.info("Product Name: " + productName + " | Price: " + productPrice);
        }

        test.info("Screenshot and product listing completed.");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }

        // Flush the ExtentReports
        if (extent != null) {
            extent.flush();
        }
    }
}
