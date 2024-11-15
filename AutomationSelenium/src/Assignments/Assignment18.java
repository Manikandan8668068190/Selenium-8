package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment18 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		boolean status = driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed();
		System.out.println(status);
		
		Rectangle rect = driver.findElement(By.id("newsletter-subscribe-button")).getRect();
		System.out.println("Height :"+rect.getHeight());
		System.out.println("Width :"+rect.getWidth());
		System.out.println("X :"+rect.getX());
		System.out.println("Y :"+rect.getY());
	}
}
