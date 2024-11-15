package WebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoMethodCreation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/products_page/2339");
		Thread.sleep(50000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		switchToWindow(driver,"flipkart");
		Point flipkartposition = driver.manage().window().getPosition();
		
		switchToWindow(driver, "ebay");
		Point ebayposition = driver.manage().window().getPosition();
		
		driver.manage().window().setPosition(flipkartposition);
		
		switchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(ebayposition);
	}

	private static void switchToWindow(WebDriver driver, String url) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String actualurl = driver.getCurrentUrl();
			if(actualurl.contains(url)) {
				break;
			}
		}
		
	}
}
