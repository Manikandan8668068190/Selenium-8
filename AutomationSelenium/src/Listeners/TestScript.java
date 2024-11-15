    package Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerImplementation.class)
public class TestScript extends BaseClass{
	@Test
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Ak@14gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Yugesh11");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home Page is Not displayed" );
		Reporter.log("Home Page is Displayed", true);
	}
}
