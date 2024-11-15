package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/119");
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindow = driver.getWindowHandles();//Capture child Window ids
		
		for(String id:allwindow) {
			driver.switchTo().window(id);//switch to any window
			String url = driver.getCurrentUrl();//capture the url of the window
			if (url.contains("flipkart")) { //compare url with excepted
				break;
			}
		}
		
		driver.manage().window().maximize();
		driver.close();
		
		driver.switchTo().window(parent);
		driver.close();
	}

}
