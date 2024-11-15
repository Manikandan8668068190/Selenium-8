package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height :"+size.getHeight());
		System.out.println("Width :"+size.getWidth());
	}
}
