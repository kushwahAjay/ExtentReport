package Reprting;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Sample {
	
	@Test
	public void Test()
	{
		Reporter.log("test",true);
	}
	@BeforeMethod
	public void precondition()
	{
		Reporter.log("before method",true);
	}
	@AfterMethod
	public void postcondition()
	{
		Reporter.log("after method",true);
	}
	
}
