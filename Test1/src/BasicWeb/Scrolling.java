package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // Create the WebDriver instance
        WebDriver driver = new ChromeDriver();
        
        // Set the system property for the ChromeDriver before creating the WebDriver instance
	    System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");

        driver.get("https://github.com/mozilla/geckodriver/releases");
        
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
//        js.executeScript("window.scrollBy(0, 1000)"," "); //scrolling by using pixel
        
        WebElement image = driver.findElement(By.xpath("//body/div[@class='logged-out env-production page-responsive']/div[contains(@class,'application-main')]/div[1]"));
        js.executeScript("arguments[0].scrollIntoView();",image); //Scrolling till we find the webelement
        
        
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //Scrolling till Bottom
        
        
        
        		
        

	}

}
