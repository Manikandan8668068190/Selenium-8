package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnswitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String id:allwindows) {
			driver.switchTo().window(id);
			Thread.sleep(3000);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
//			if(url.equals("https://www.flipkart.com/"))
			if(url.contains("ebay"))
			{
				break;
			}
		}
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight()); 
		System.out.println(size.getWidth()); 
	}

}
