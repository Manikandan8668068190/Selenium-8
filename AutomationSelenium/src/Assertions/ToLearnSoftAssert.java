package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Demo Web","Welcome Page is Not Displayed");
		Reporter.log("Welcome Page is dispalyed",true);
		
		driver.findElement(By.linkText("Log in")).click();
		soft.assertEquals(driver.getTitle(),"Demo Web Shop" ,"Login Page is Not displayed");
		Reporter.log("Login Page is dispalyed",true);
		
		driver.findElement(By.id("Email")).sendKeys("Ak@14gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Yugesh14");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		soft.assertEquals(driver.getTitle(),"Demo Web Shop" ,"Home Page is Not displayed");
		Reporter.log("Home page is displayed",true);
		
		soft.assertAll();
	}
}
