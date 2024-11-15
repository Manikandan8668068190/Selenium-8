package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(20000);
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		for(String w:windows) {
			System.out.println(w);
		}
		
	}
}
