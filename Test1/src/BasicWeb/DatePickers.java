//package BasicWeb;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DatePickers {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		
//		String month = "March 2024";
//		String day = "20";
//		
//		 WebDriver driver = new ChromeDriver();
//
//		
//	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
//
//	     driver.get("https://www.phptravels.net/hotels");
//	     
//	     driver.manage().window().maximize();
//
////	     driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']")).click();
//	     
//	     
//	     driver.findElement(By.xpath("//input[@id='checkin']")).click();
//	     
//	     
//	     Thread.sleep(2000);
//	     
//	     while(true) {
//	    	 
//	    	 String text = driver.findElement(By.xpath("//input[@id='checkin']")).getText();
//	    	 
//	    	 if(text.equals(month)) {
//	    		 break;
//	    	 }
//	    	 
//	    	 else {
//	    		 driver.findElement(By.xpath("//body/div[4]/div[1]/table[1]/thead[1]/tr[1]/th[3]//*[name()='svg']")).click();
//	    	 }
//	    	 	    	 
//	    	 driver.findElement(By.xpath("//body[1]/div[4]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),\"20\")]")).click();
//	    	 
//	    	 
//	     }
//
//	   
//	}
//
//}







package BasicWeb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		String month = "March 2024";
//		String day = "20";
		
		 WebDriver driver = new ChromeDriver();

		
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");

	     driver.get("https://www.spicejet.com/");
	     
	     driver.manage().window().maximize();

//	     driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']")).click();
	     
	   
	        // Switch to the alert
	        Alert alert = driver.switchTo().alert();

	        // Get the text of the alert
	        String alertText = alert.getText();
	        System.out.println("Alert Text: " + alertText);

	        // Accept the alert (click on OK)
	        alert.accept();

	     
//	     
//	     driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1v8vaea r-eqz5dr r-1d2f490 r-u8s1d r-zchlnj r-1pozq62']")).click();
//	     
//	     
//	     Thread.sleep(2000);
//	     
//	     while(true) {
//	    	 
//	    	 String text = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1v8vaea r-eqz5dr r-1d2f490 r-u8s1d r-zchlnj r-1pozq62']")).getText();
//	    	 
//	    	 if(text.equals(month)) {
//	    		 break;
//	    	 }
//	    	 
//	    	 else {
//	    		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]")).click();
//	    	 }
//	    	 	    	 
//	    	 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]")).click();
//	    	 
//	    	 
//	     }
//
//	   
	}

}



















