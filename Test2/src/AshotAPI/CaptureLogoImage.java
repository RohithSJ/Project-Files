package AshotAPI;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		    WebDriver driver = new ChromeDriver();
	        
	        // Set the system property for the ChromeDriver before creating the WebDriver instance
		    System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	        driver.manage().window().maximize();
	        
	      WebElement logoImageElement = driver.findElement(By.xpath("//img[@alt='company-branding']"));
	      
	      Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
	        
	        
	      ImageIO.write(logoImageScreenshot.getImage(), "png", File("D://Java automation practice/Logos/logo.png"));
	        
	     

	}

	private static ImageOutputStream File(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	

}













