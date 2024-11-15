package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment1 {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://automationexercise.com/");
		Assert.assertEquals(driver.getTitle(),"Automation Exercise","Welcome page is not displayed");
		Reporter.log("Welcome page is displayed", true);
		
		driver.findElement(By.linkText(" Signup / Login")).click();
	}
}
