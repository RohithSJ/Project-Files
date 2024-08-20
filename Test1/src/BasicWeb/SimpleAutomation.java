package BasicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		 WebDriver driver = new ChromeDriver();
	        
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
	     
	     driver.get("https://demo.guru99.com/test/newtours/");
	     
	     
	     Thread.sleep(5000);
	     
	     
	     driver.quit();

	}

}
