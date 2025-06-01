package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertWithTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
	     
	     driver.get("https://demo.automationtesting.in/Alerts.html");
	     
	     driver.findElement(By.xpath("(//a[normalize-space()='Alert with Textbox'])[1]")).click();
	     
	     driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();

	     Thread.sleep(2000);
	     
	     driver.switchTo().alert().sendKeys("OM SAI RAM");
	     
	         
	     driver.switchTo().alert().accept();
	     
	     driver.quit();


	}

}
