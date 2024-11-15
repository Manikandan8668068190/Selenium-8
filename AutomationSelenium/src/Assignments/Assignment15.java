package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		if(driver.getTitle().contains("vtiger"))
		{
			System.out.println("User Navigated Succesfully");
		}
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Testing");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
}
