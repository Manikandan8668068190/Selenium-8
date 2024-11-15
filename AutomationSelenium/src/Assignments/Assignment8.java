package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.id("gender-male")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("12345");
		 driver.findElement(By.id("LastName")).sendKeys("67890");
		 driver.findElement(By.id("Email")).sendKeys("asdfgh@1234.gmailcom");
		 driver.findElement(By.id("Password")).sendKeys("abcd1234");
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd1234");
		 driver.findElement(By.id("register-button")).click();
		 Thread.sleep(2000);
		 driver.close();
	}
}
