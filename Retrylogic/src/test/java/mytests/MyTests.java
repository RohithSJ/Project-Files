package mytests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
//	retryAnalyzer = Analyzer.RetryAnalyzer.class
	
	@Test()
	public void Test1() {
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void Test2() {
		Assert.assertEquals(false, true);
	}
	

}
