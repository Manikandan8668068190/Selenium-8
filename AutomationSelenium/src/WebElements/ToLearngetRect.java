package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetRect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle rect = driver.findElement(By.id("small-searchterms")).getRect();
		
		System.out.println("Height :"+rect.getHeight());
		System.out.println("Width :"+rect.getWidth());
		System.out.println("X :"+rect.getX());
		System.out.println("Y :"+rect.getY());
	}
}