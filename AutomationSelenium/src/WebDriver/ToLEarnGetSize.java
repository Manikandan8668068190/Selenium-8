package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLEarnGetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		
		driver.get("https://www.agoda.com/en-in");
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height :"+size.getHeight());
		System.out.println("Width :"+size.getWidth());
	}
}
