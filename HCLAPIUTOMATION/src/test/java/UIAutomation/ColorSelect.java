//package UIAutomation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import java.time.Duration;
//
//public class ColorSelect {
//    
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//        // Initialize the ChromeDriver
//        driver = new ChromeDriver();
//
//        // Maximize the browser window
//        driver.manage().window().maximize();
//
//        // Navigate to the login page
//        driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html");
//    }
//
//    @Test
//    public void testSelectColor() {
//        // Example test: navigate to a product and select a color
//
//        // Wait for the homepage to load and ensure the page is loaded
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        
//        
//        JavascriptExecutor  js = (JavascriptExecutor )driver;
//        
//        js.executeScript("window.scrollBy(0, 500)"," " );
//        
//        System.out.println(js.executeScript("return window.pageYOffset;"));
//        		
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        
//
//        driver.findElement(By.xpath("//div[normalize-space()='Color']")).click();
//        
//        
//        
//        
//        // Sleep for 5 seconds to ensure the sorting operation is completed
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        
//        driver.findElement(By.xpath("//a[@aria-label='Blue']//div[contains(@class,'swatch-option color')]")).click();
//
//        
//        
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        
//        Actions actions = new Actions(driver);
//
//        WebElement menMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@class='page-wrapper']/main[@id='maincontent']/div[@class='columns']/div[@class='column main']/div[@class='products wrapper grid products-grid']/ol[@class='products list items product-items']/li[1]/div[1]")));
//        actions.moveToElement(menMenu).perform();
//        
//        
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        
//   
//        WebElement compareList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.action.tocompare")));
//        compareList.click();
//         
//         
//         
//        Assert.assertTrue(compareList.isDisplayed(), "Compare list is not displayed.");
//
//        
//
//
//        // Add assertions to verify color selection if necessary
//        WebElement selectedColor = driver.findElement(By.cssSelector(".swatch-option"));
//        Assert.assertTrue(selectedColor.isDisplayed(), "Selected color is not displayed correctly.");
//
//     
//    }

  

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}











//package UIAutomation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.List;
//
//public class ColorSelect {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//        // Initialize the ChromeDriver
//        driver = new ChromeDriver();
//
//        // Maximize the browser window
//        driver.manage().window().maximize();
//
//        // Navigate to the specified URL with color filter applied
//        driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html?color=50");
//    }
//
//    @Test
//    public void testSelectColorAndCompare() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Wait for the product grid to update
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".products-grid")));
//
//        // Perform mouseover on the first product and click "Compare"
//        boolean success = false;
//        for (int i = 0; i < 5; i++) {
//            try {
//                // Find all product items
//                List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
//                if (products.isEmpty()) {
//                    throw new RuntimeException("No products found");
//                }
//
//                // Mouse over the first product
//                WebElement firstProduct = products.get(0);
//                Actions actions = new Actions(driver);
//                actions.moveToElement(firstProduct).perform();
//
//                // Re-fetch the element after mouseover
//                firstProduct = driver.findElements(By.cssSelector(".product-item")).get(0);
//
//                // Wait for the "Compare" link to be visible and click it
//                WebElement compareLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".action.tocompare")));
//                compareLink.click();
//                
//                
//                
//                try {
//                  Thread.sleep(5000);
//              } catch (InterruptedException e) {
//                  e.printStackTrace();
//              }
//                      
//                
//                
//
//                // Verify that the product is added to the compare list (this part may vary depending on the application behavior)
//                WebElement compareList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".block-compare")));
//                Assert.assertTrue(compareList.isDisplayed(), "Compare list is not displayed.");
//
//                // Print the response body if needed
//                System.out.println("Compare list: " + compareList.getText());
//
//                success = true;
//                break;
//            } catch (org.openqa.selenium.StaleElementReferenceException e) {
//                System.out.println("StaleElementReferenceException encountered. Retrying...");
//            } catch (Exception e) {
//                System.out.println("Exception encountered: " + e.getMessage());
//            }
//        }
//
//        if (!success) {
//            Assert.fail("Failed to interact with the element after multiple retries.");
//        }
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}






//package UIAutomation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.List;
//
//public class ColorSelect {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//        // Initialize the ChromeDriver
//        driver = new ChromeDriver();
//
//        // Maximize the browser window
//        driver.manage().window().maximize();
//
//        // Navigate to the specified URL with color filter applied
//        driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html?color=50");
//    }
//
//    @Test
//    public void testSelectColorAndCompareSecondProduct() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Wait for the product grid to update
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".products-grid")));
//
//        // Perform mouseover on the second product and click "Compare"
//        boolean success = false;
//        for (int i = 0; i < 5; i++) {
//            try {
//                // Find all product items
//                List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
//                if (products.size() < 3) {
//                    throw new RuntimeException("Less than 2 products found");
//                }
//
//                // Mouse over the second product
//                WebElement secondProduct = products.get(2);
//                Actions actions = new Actions(driver);
//                actions.moveToElement(secondProduct).perform();
//
//                // Wait for the "Compare" link to be visible and click it
//                WebElement compareLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-item:nth-child(3) .action.tocompare")));
//                compareLink.click();
//                
//                
//              try {
//              Thread.sleep(5000);
//          } catch (InterruptedException e) {
//              e.printStackTrace();
//          }
//
//                
//                
//
//                // Verify that the product is added to the compare list (this part may vary depending on the application behavior)
//                WebElement compareList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".block-compare")));
//                Assert.assertTrue(compareList.isDisplayed(), "Compare list is not displayed.");
//
//                // Print the response body if needed
//                System.out.println("Compare list: " + compareList.getText());
//
//                success = true;
//                break;
//            } catch (org.openqa.selenium.StaleElementReferenceException e) {
//                System.out.println("StaleElementReferenceException encountered. Retrying...");
//            } catch (Exception e) {
//                System.out.println("Exception encountered: " + e.getMessage());
//            }
//        }
//
//        if (!success) {
//            Assert.fail("Failed to interact with the element after multiple retries.");
//        }
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}




//
//package UIAutomation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ColorSelect {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//        // Initialize the ChromeDriver
//        driver = new ChromeDriver();
//
//        // Maximize the browser window
//        driver.manage().window().maximize();
//
//        // Navigate to the specified URL with color filter applied
//        driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html?color=50");
//    }
//
//    @Test
//    public void testSelectColorAndCompareMultipleProducts() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Wait for the product grid to update
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".products-grid")));
//
//        // List of product indices to compare (e.g., compare the first 3 products)
//        int[] productIndices = {0, 1};
//
//        // List to store the names of the products added to the compare list
//        List<String> comparedProductNames = new ArrayList<>();
//
//        // Iterate over the specified product indices
//        for (int index : productIndices) {
//            boolean success = false;
//            for (int i = 0; i < 5; i++) {
//                try {
//                    // Find all product items
//                    List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
//                    if (products.size() <= index) {
//                        throw new RuntimeException("Product not found at index: " + index);
//                    }
//
//                    // Mouse over the product at the specified index
//                    WebElement product = products.get(index);
//                    Actions actions = new Actions(driver);
//                    actions.moveToElement(product).perform();
//
//                    // Get the product name and add it to the list
//                    String productName = product.findElement(By.cssSelector(".product-item-link")).getText();
//                    comparedProductNames.add(productName);
//
//                    // Wait for the "Compare" link to be visible and click it
//                    WebElement compareLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-item:nth-child(" + (index + 1) + ") .action.tocompare")));
//                    compareLink.click();
//
//                    // Verify that the product is added to the compare list (this part may vary depending on the application behavior)
//                    WebElement compareList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".block-compare")));
//                    Assert.assertTrue(compareList.isDisplayed(), "Compare list is not displayed.");
//
//                    success = true;
//                    break;
//                } catch (org.openqa.selenium.StaleElementReferenceException e) {
//                    System.out.println("StaleElementReferenceException encountered. Retrying...");
//                } catch (Exception e) {
//                    System.out.println("Exception encountered: " + e.getMessage());
//                }
//            }
//
//            if (!success) {
//                Assert.fail("Failed to interact with the element after multiple retries for product index: " + index);
//            }
//        }
//
//        // Print the names of the compared products
//        System.out.println("Products added to compare list:");
//        for (String name : comparedProductNames) {
//            System.out.println(name);
//        }
//        
//        
//       
//        
//      try {
//      Thread.sleep(5000);
//  } catch (InterruptedException e) {
//      e.printStackTrace();
//  }
//      
//      
//      
//  
//        
//
//        // Additional verification for the compare list if needed
//        WebElement compareList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".block-compare")));
//        Assert.assertTrue(compareList.isDisplayed(), "Compare list is not displayed.");
//
//        // Print the compare list items (optional)
//        List<WebElement> compareItems = compareList.findElements(By.cssSelector(".compare-item"));
//        for (WebElement item : compareItems) {
//            System.out.println("Compared product: " + item.getText());
//        }
//    }
//    
//    
//    
//    
//    
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}







//package UIAutomation;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ColorSelect {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//        // Initialize the ChromeDriver
//        driver = new ChromeDriver();
//
//        // Maximize the browser window
//        driver.manage().window().maximize();
//
//        // Navigate to the specified URL with color filter applied
//        driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html?color=50");
//    }
//
//    @Test
//    public void testSelectColorAndCompareMultipleProducts() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Wait for the product grid to update
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".products-grid")));
//
//        // List of product indices to compare (e.g., compare the first 2 products)
//        int[] productIndices = {0, 1};
//
//        // List to store the names of the products added to the compare list
//        List<String> comparedProductNames = new ArrayList<>();
//
//        // Iterate over the specified product indices
//        for (int index : productIndices) {
//            boolean success = false;
//            for (int i = 0; i < 5; i++) {
//                try {
//                    // Find all product items
//                    List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
//                    if (products.size() <= index) {
//                        throw new RuntimeException("Product not found at index: " + index);
//                    }
//
//                    // Mouse over the product at the specified index
//                    WebElement product = products.get(index);
//                    Actions actions = new Actions(driver);
//                    actions.moveToElement(product).perform();
//
//                    // Get the product name and add it to the list
//                    String productName = product.findElement(By.cssSelector(".product-item-link")).getText();
//                    comparedProductNames.add(productName);
//
//                    // Wait for the "Compare" link to be visible and click it
//                    WebElement compareLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-item:nth-child(" + (index + 1) + ") .action.tocompare")));
//                    compareLink.click();
//
//                    // Verify that the product is added to the compare list (this part may vary depending on the application behavior)
//                    WebElement compareList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".block-compare")));
//                    Assert.assertTrue(compareList.isDisplayed(), "Compare list is not displayed.");
//
//                    success = true;
//                    break;
//                } catch (org.openqa.selenium.StaleElementReferenceException e) {
//                    System.out.println("StaleElementReferenceException encountered. Retrying...");
//                } catch (Exception e) {
//                    System.out.println("Exception encountered: " + e.getMessage());
//                }
//            }
//
//            if (!success) {
//                Assert.fail("Failed to interact with the element after multiple retries for product index: " + index);
//            }
//        }
//
//        // Print the names of the compared products
//        System.out.println("Products added to compare list:");
//        for (String name : comparedProductNames) {
//            System.out.println(name);
//        }
//
//        // Introduce a delay of 30 seconds
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.findElement(By.xpath("//a[@title='Compare Products']")).click();
//        
//        
//        
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//
//        
//     // Take a screenshot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File srcFile = ts.getScreenshotAs(OutputType.FILE);
//        File trgFile = new File("./screenshots/compare-products.png");
//
//        try {
//            FileUtils.copyFile(srcFile, trgFile);
//            System.out.println("Screenshot taken and saved to: " + trgFile.getAbsolutePath());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        
//
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
//





//package UIAutomation;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ColorSelect {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//
//        // Initialize the ChromeDriver
//        driver = new ChromeDriver();
//
//        // Maximize the browser window
//        driver.manage().window().maximize();
//
//        // Navigate to the specified URL with color filter applied
//        driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html?color=50");
//    }
//
//    @Test
//    public void testSelectColorAndCompareMultipleProducts() throws IOException, InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Wait for the product grid to update
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".products-grid")));
//
//        // List of product indices to compare (e.g., compare the first 2 products)
//        int[] productIndices = {0, 1};
//
//        // List to store the names of the products added to the compare list
//        List<String> comparedProductNames = new ArrayList<>();
//
//        // Iterate over the specified product indices
//        for (int index : productIndices) {
//            boolean success = false;
//            for (int i = 0; i < 5; i++) {
//                try {
//                    // Find all product items
//                    List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));
//                    if (products.size() <= index) {
//                        throw new RuntimeException("Product not found at index: " + index);
//                    }
//
//                    // Mouse over the product at the specified index
//                    WebElement product = products.get(index);
//                    Actions actions = new Actions(driver);
//                    actions.moveToElement(product).perform();
//
//                    // Get the product name and add it to the list
//                    String productName = product.findElement(By.cssSelector(".product-item-link")).getText();
//                    comparedProductNames.add(productName);
//
//                    // Wait for the "Compare" link to be visible and click it
//                    WebElement compareLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-item:nth-child(" + (index + 1) + ") .action.tocompare")));
//                    compareLink.click();
//
//                    // Verify that the product is added to the compare list (this part may vary depending on the application behavior)
//                    WebElement compareList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".block-compare")));
//                    Assert.assertTrue(compareList.isDisplayed(), "Compare list is not displayed.");
//
//                    success = true;
//                    break;
//                } catch (org.openqa.selenium.StaleElementReferenceException e) {
//                    System.out.println("StaleElementReferenceException encountered. Retrying...");
//                } catch (Exception e) {
//                    System.out.println("Exception encountered: " + e.getMessage());
//                }
//            }
//
//            if (!success) {
//                Assert.fail("Failed to interact with the element after multiple retries for product index: " + index);
//            }
//        }
//
//        // Print the names of the compared products
//        System.out.println("Products added to compare list:");
//        for (String name : comparedProductNames) {
//            System.out.println(name);
//        }
//
//        // Introduce a delay of 30 seconds
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Click on the compare list items
//        driver.findElement(By.xpath("//a[@title='Compare Products']")).click();
//
//        // Introduce a short delay to ensure the page has fully loaded
//       
//
//        // Remove the second product from the compare list and handle the popup
//        
//        
//        driver.findElement(By.xpath("//thead//td[2]//a[1]")).click();
//        
//        
//       Thread.sleep(3000);
//        
//        
//        // Wait explicitly for the alert to be present
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        
//        
//        
//        
//        
//       
//    }
//
//   
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
//







package UIAutomation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
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

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ColorSelect {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the specified URL with color filter applied
        driver.get("https://magento.softwaretestingboard.com/catalog/product_compare/");
    }

    @Test
    public void testSelectColorAndCompareMultipleProducts() throws IOException, InterruptedException{
        
    	
    	
    	
    	driver.findElement(By.xpath("//thead//td[2]//a[1]")).click();
    	
    	
        Thread.sleep(3000);

    	
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
        
        
        Thread.sleep(3000);
       
    }

   

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}






















