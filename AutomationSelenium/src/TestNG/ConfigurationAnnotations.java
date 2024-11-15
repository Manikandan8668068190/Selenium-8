package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations
{
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("@BeforeSuite ",true);
	}
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("@BeforeTest ",true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("@BeforeClass", true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("@BeforeMethod", true);
	}
	@Test
	public void demo()
	{
		Reporter.log("@Test(Demo)executed",true);
	}
	@Test
	public void sample()
	{
		Reporter.log("@Test(Sample)", true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("@AfterMethod", true );
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("@AfterClass", true);
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("@AfterTest ",true);
	}
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("@AfterSuite",true);
	}
	

}
