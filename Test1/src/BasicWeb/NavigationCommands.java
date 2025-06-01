package BasicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
	     
	     driver.get("https://demo.guru99.com/test/newtours/");
	     
	     System.out.println("Title of the 1st link is:"+driver.getTitle());
	     
	     
	     try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	     
	     driver.navigate().to("https://www.rediff.com/gifts");
	     
	     System.out.println("Title of the 2nd link is:"+driver.getTitle());
	     
	     
	     try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	     
	     driver.navigate().back();
	     
	     System.out.println(driver.getTitle());
	     
	     try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	     
         driver.navigate().forward();
	     
	     System.out.println(driver.getTitle());
	     
	     try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	     
	     driver.quit();


	}

}
