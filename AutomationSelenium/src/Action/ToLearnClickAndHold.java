package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("test@12345");
		
		WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions act=new Actions(driver);
		act.moveToElement(eyeicon).clickAndHold().pause(2000).release().perform();
//		act.clickAndHold(eyeicon).perform();
//		Thread.sleep(4000);
//		act.release().perform();
	}
}
