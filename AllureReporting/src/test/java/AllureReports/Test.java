package AllureReports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tests {
	
   WebDriver driver;
   
   @BeforeClass
   public void setup() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   driver.get("https://www.amazon.com/");
	   driver.manage().window().maximize();	   
   }
   
   @Test(priority=1)
   public void logoPresence() {
	   
	   
   }
   
   @Test(priority=2)
   public void loginTest() {
	   
	   

   }
   
   @Test(priority=3)
   public void registrationTest() {

	   
	   
   }

   @AfterClass
   public void teardown() {
	  
	   
	   
   }
}
