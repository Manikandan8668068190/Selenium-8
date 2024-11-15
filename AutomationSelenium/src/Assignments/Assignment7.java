package Assignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String url = driver.getCurrentUrl();
		
		Point position = driver.manage().window().getPosition();
		System.out.println("x :"+position.getX());
		System.out.println("Y :"+position.getY());
		
		driver.navigate().refresh();
	}
}
