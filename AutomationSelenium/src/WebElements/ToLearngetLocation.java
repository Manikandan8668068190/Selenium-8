package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetLocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Point location = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		System.out.println("X :"+location.getX());
		System.out.println("Y :"+location.getY());
	}
}
