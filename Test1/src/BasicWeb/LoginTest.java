package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
	     
	     driver.get("https://demo.guru99.com/test/newtours/");
	     
	     driver.findElement(By.name("userName")).sendKeys("mercury");
	     
	     driver.findElement(By.name("password")).sendKeys("mercury");
	     
	     driver.findElement(By.name("submit")).click();
	     

   
	}

}
