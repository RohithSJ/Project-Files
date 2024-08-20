package AshotAPI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class YahooMailTest {
	
	
	@BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: Setup global test environment");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Launch Browser");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Login email");
    }

    @Test
    public void testMethod1() {
        System.out.println("Compose email test");
        // Your test code here
        assert true;
    }

    @Test
    public void testMethod2() {
        System.out.println("Delete mail test");
        // Your test code here
        assert true;
        int i = 9/0;
    }
    
    @Test
    public void testMethod3() {
        System.out.println("Delete cookies");
        // Your test code here
        assert true;
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("logout");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Quit browser");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Cleanup global test environment");
    }
    
    
}
	
	

