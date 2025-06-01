package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFilesUsingFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Additional settings for firefox browser
		
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference("browers.helperApps.NeverAsk.saveToDisk", "text/plain, application/pdf"); //MIME Types
		
		
		
		FirefoxOptions option = new FirefoxOptions();
        option.setProfile(profile);
		
		
		
		
		 WebDriver driver = new FirefoxDriver(option);
	        
	     System.setProperty("webdriver.gecko.driver", "D:\\Java automation practice\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
	     
	     driver.get("https://demo.automationtesting.in/FileDownload.html");
	     
	     driver.findElement(By.id("textbox")).sendKeys("testingfiles");
	     
	     driver.findElement(By.id("createTxt")).click();
	     
	     driver.findElement(By.id("link-to-download")).click();
	     
	    
	     
	     
	     
	   



	}

}
