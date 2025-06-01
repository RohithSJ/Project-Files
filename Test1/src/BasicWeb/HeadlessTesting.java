package BasicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver.exe");

        // Create ChromeOptions and enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        
        options.addArguments("--headless");


        // Initialize ChromeDriver with the specified options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the website
        driver.get("https://demo.nopcommerce.com/");

        // Print the title of the page
        System.out.println("Title of the page is: " + driver.getTitle());
        
        
//	    Thread.sleep(5000); //sleep for 5 seconds


        // Quit the browser
        driver.quit();
    }
}
