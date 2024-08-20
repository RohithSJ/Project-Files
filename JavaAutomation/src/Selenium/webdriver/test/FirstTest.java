package Selenium.webdriver.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver", "D://Java automation practice//chromedriver-win64//chromedriver-win64//chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

	}
	
	
	
}
