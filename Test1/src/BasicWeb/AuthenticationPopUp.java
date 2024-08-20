package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
	     
//	     driver.get("https://the-internet.herokuapp.com/basic_auth");
	     
         driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

         String text = driver.findElement(By.cssSelector("p")).getText();
        		 
         System.out.println(text);
  

	}

}
