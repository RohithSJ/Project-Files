//package CookieTest;
//
//import java.util.Set;
//
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class CookiesExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		 WebDriver driver = new ChromeDriver();
//	        
//	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");
//	     
//	     driver.get("https://www.amazon.com/");
//	     
//	     Set <Cookie> cookies = driver.manage().getCookies(); //Capture all cookies from the browser
//	     
//	     System.out.println("Size of Cookies: " +cookies.size()); //Print size of cookies
//	     
////	     for (Cookie cookie : cookies) {
////	    	 
////	    	 System.out.println(cookie.getName()+":"+cookie.getValue()); //Print name and values of the cookie
////	     }
//	     
//	     
////    	 System.out.println(driver.manage().getCookieNamed("session-id-time")); //print specific cookie according to the name
//	     
//	     
//	     Cookie obj = new Cookie("mycookie", "SJR");
//	     driver.manage().addCookie(obj);
//	     
//	     cookies = driver.manage().getCookies();
//	     
//	     System.out.println("Size of Cookies: " +cookies.size()); //Print size of cookies
//
//	     
//	     driver.manage().deleteCookie(obj);	  
//	     
//	     System.out.println("Size of Cookies: " +cookies.size()); //Print size of cookies
//
//	     
//	     for (Cookie cookie : cookies) {
//	    	 System.out.println(cookie.getName()+":"+cookie.getValue()); //Print name and values of the cookie
//	     }
//
//
//
//	     
//	     driver.quit();
//	     
//	     
//
//	}
//
//}






package CookieTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

    public static void main(String[] args) {
     
        // Create the WebDriver instance
        WebDriver driver = new ChromeDriver();
        
        // Set the system property for the ChromeDriver before creating the WebDriver instance
	     System.setProperty("webdriver.chrome.driver", "D:\\Java automation practice\\chromedriver-win64\\chromedriver-win64.exe");


        driver.get("https://www.amazon.com/");

        Set<Cookie> cookies = driver.manage().getCookies(); // Capture all cookies from the browser
        

        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ":" + cookie.getValue()); // Print name and values of the cookie
        }


        System.out.println("Size of Cookies: " + cookies.size()); // Print size of cookies

        
        
     
        Cookie obj = new Cookie("mycookie", "SJR");
        driver.manage().addCookie(obj);

        cookies = driver.manage().getCookies();
        

        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ":" + cookie.getValue()); // Print name and values of the cookie
        }


        System.out.println("Size of Cookies after adding: " + cookies.size()); // Print size of cookies after adding

        driver.manage().deleteCookie(obj);

        cookies = driver.manage().getCookies();

        System.out.println("Size of Cookies after deleting: " + cookies.size()); // Print size of cookies after deleting

        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ":" + cookie.getValue()); // Print name and values of the cookie
        }
        

        System.out.println("Size of Cookies after deleting: " + cookies.size()); // Print size of cookies after deleting


        driver.manage().deleteAllCookies();
        
        System.out.println("Size of Cookiel: " + cookies.size()); // Print size of cookies after deleting


        
        driver.quit();
    }
}

