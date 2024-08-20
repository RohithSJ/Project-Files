//package BasicWeb;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BrokenLinks {
//
//	public static void main(String[] args) throws InterruptedException, IOException {
//		// TODO Auto-generated method stub
//		
//
//		 WebDriver driver = new ChromeDriver();
//	        
//	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
//	     
//	   
//	     driver.manage().window().maximize(); //Maximize page
//	     
//	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ; //Implicit wait for 10 seconds
//	     
//	     driver.get("https://demo.guru99.com/test/newtours/");
//
//	     Thread.sleep(5000);
//
//	     List <WebElement> links = driver.findElements(By.linkText("a"));
//	    		 
//	    		 for(int i=0; i<links.size(); i++) {
//	    			 WebElement element = links.get(i);
//	    					String url =  element.getAttribute("href");
//	    					
//	    			URL link = new URL(url);
//	    			
//	    			
//	    			//creating connects using url object 'links'
//	                HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
//	    			 
//	    			 Thread.sleep(2000);
//	    			 
//	    			 httpURLConnection.connect();
//	    			 
//	    			 int rescode = httpURLConnection.getResponseCode(); //return responde code if the response code above 400 : broken
//
//	    			 if(rescode>=400) {
//	    				 System.out.println(url+" - "+" is broken link ");
//	    			 }
//	    			 
//	    			 else {
//	    				 System.out.println(url+" - "+" is valid link ");
//	    			 }
//	    		 }
//	    		 
//	    		 
//	     
//	}
//
//}






package BasicWeb;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List; // Import List from java.util
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");

        driver.manage().window().maximize(); // Maximize page

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait for 10 seconds

        driver.get("https://demo.guru99.com/test/newtours/");

        Thread.sleep(5000);

        // Correcting List import
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");

            try {
                URL link = new URL(url);

                // Creating a connection using the URL object 'link'
                HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();

                Thread.sleep(2000);

                httpURLConnection.connect();

                int rescode = httpURLConnection.getResponseCode(); // Return response code, if the response code above 400: broken

                if (rescode >= 400) {
                    System.out.println(url + " - " + " is a broken link ");
                } else {
                    System.out.println(url + " - " + " is a valid link ");
                }
            } catch (Exception e) {
                System.out.println(url + " - " + " is a broken link. Exception: " + e.getMessage());
            }
        }
    }
}











