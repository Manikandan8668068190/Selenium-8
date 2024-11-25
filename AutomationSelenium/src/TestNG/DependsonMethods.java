package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class DependsonMethods {
	@Test(priority = 3)
	public void register() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		Assert.fail();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Register is successfull", true);
		}
	@Test(priority = 2, dependsOnMethods = "register")
	public void login(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Login is successfull", true);
	}
	@Test(priority = 1, dependsOnMethods = {"register","login"})
	public void addToCart(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/cart");
		Reporter.log("Addtocart is successfull", true);
}
}