package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
	     
	     driver.get("https://demo.automationtesting.in/Alerts.html");
	     
//	     driver.findElement(By.xpath("(//button[contains(text(),'click the button to display an')])[1]")).click();
	     
	     
//	     driver.findElement(By.xpath("(//a[normalize-space()='Alert with OK & Cancel'])[1]")).click();
//	     
//	     Thread.sleep(2000);
//	     
//	     driver.findElement(By.xpath("(//button[normalize-space()='click the button to display a confirm box'])[1]")).click();
//	     
//	     Thread.sleep(2000);
	     
	     
//	     
//	     driver.findElement(By.xpath("(//a[normalize-space()='Alert with Textbox'])[1]")).click(); //Indexpath
//	     
//	     Thread.sleep(3000);

//	      driver.findElement(By.xpath("(//button[normalize-space()='click the button to demonstrate the prompt box'])[1]")).click();
//	     
//	     WebElement promptAlert = driver.switchTo().alert();
//	        promptAlert.sendKeys("Hi");
//
//	        // Accept the prompt alert
//	        promptAlert.accept();
//
//	        promptAlert.accept();
//
//	        Thread.sleep(2000);
//
//	        // Close the browser
//	        driver.quit();

	     
	     
	     driver.findElement(By.xpath("(//a[normalize-space()='Alert with OK & Cancel'])[1]")).click();
	     
	     Thread.sleep(2000);
	     
	     
	     String ExpTextOk = "You pressed Ok"; 

	     
	     driver.findElement(By.xpath("(//button[normalize-space()='click the button to display a confirm box'])[1]")).click();
	     driver.switchTo().alert().accept();

	    
	     
         String Acttext = driver.findElement(By.xpath("(//p[@id='demo'])[1]")).getText();
	     
        
	     if(ExpTextOk.equals(Acttext)==true){
	    	 
	    	 System.out.println("Test is passed");
	     }
	     
	     Thread.sleep(3000);

	     driver.findElement(By.xpath("(//button[normalize-space()='click the button to display a confirm box'])[1]")).click();

	     
	     String ExpTextcancel = "You Pressed Cancel";
	     driver.switchTo().alert().dismiss();

  
         Acttext = driver.findElement(By.xpath("(//p[@id='demo'])[1]")).getText();

	     
         if(ExpTextcancel.equals(Acttext)==true){
	    	 
	    	 System.out.println("Test is passed");
	     }
	     
	     Thread.sleep(3000);
	     

	     driver.quit();
	     
	     
	     
	}

}
