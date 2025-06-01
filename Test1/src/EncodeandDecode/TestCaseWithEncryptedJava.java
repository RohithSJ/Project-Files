package EncodeandDecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithEncryptedJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    WebDriver driver = new ChromeDriver();
	        
	        // Set the system property for the ChromeDriver before creating the WebDriver instance
		    System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");

	        driver.get("https://github.com/mozilla/geckodriver/releases");
	        
	        driver.manage().window().maximize();
	        

	}

}
