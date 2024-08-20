package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
	     
	     driver.get("https://www.facebook.com/signup");
	     
	     System.out.println("Title of the 1st link is:"+driver.getTitle());
	     
	    WebElement email = driver.findElement(By.name("reg_email__"));
	    
	    WebElement pass = driver.findElement(By.name("reg_passwd__"));
	    
	    if(email.isDisplayed() && email.isEnabled()) {
	    	
	    	email.sendKeys("rohithsj201629@gmail.com");
	    }
	    
        if(pass.isDisplayed() && pass.isEnabled()) {
	    	
	    	pass.sendKeys("SuryaNarayanaSwami");
	    }

   
     System.out.println(driver.findElement(By.className("_58mt")).isSelected());
     
     System.out.println(driver.findElement(By.className("_58mt")).isSelected());


     
     if(driver.findElement(By.className("_58mt")).isSelected()==false) {
    	 
    	driver.findElement(By.className("_58mt")).click();
    
     }
     
     
  
     
     
     
     
	}

}
