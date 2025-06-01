package BasicWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirstTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");

		
        WebDriver driver = new ChromeDriver();
        

        driver.get("https://www.google.com");     

//        
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.quit();
        
        
          System.out.println("Title of the current_url"+" "+ driver.getCurrentUrl());
          System.out.println("Title of the current_url"+" "+driver.getTitle());

        
      

	}

}
