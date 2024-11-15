package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("abcdef@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
