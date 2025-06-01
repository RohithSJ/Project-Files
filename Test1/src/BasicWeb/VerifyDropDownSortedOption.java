package BasicWeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOption {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();

	
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");

	     driver.get("https://testautomationpractice.blogspot.com/");

		 driver.manage().window().maximize();
		 
		 
		 
		 driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
		 
		 
		 Thread.sleep(3000);

		 
		 Alert alert = driver.switchTo().alert();
				 
	        Thread.sleep(2000);

		 alert.sendKeys("Anjaneya swami");
		 
		    String alertText = alert.getText();
	        System.out.println("Alert Text: " + alertText);
	        
	        // Accept the alert (click on OK)
	        alert.accept();
	        
	        
	         WebElement element = driver.findElement(By.id("country"));
	         
	         Select se = new Select(element);
	         
	         List originalList = new ArrayList();
	         
	         
	        List <WebElement >options = se.getOptions();
	        
	        for(WebElement e:options) 
	        {
	        	
	            originalList.add(e.getText());
	        	
	        }
	        
	        System.out.println(originalList);
	        
	        List tempList = new ArrayList();
	        
	        
	       tempList = originalList;
	       
	        System.out.println( tempList);

	       Collections.sort(tempList);
	       
	        System.out.println("After sorting templist:" +tempList);

	        
	        

	        
	        
				 
		
	}

}
