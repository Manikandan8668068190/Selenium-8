package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Testing");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(2000);
		WebElement errormsg = driver.findElement(By.xpath("//span[@class=' failureMessage']"));
		String color = errormsg.getCssValue("color");
		System.out.println(color);
		if(color.contains("rgba(255, 0, 0, 1)")) {
			System.out.println("Red Color is displayed");
		}
		else {
			System.out.println("Red color is not displayed");
		}
	}
}
