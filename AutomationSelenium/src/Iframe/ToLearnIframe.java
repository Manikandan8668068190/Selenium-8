package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnIframe {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
//		driver.switchTo().frame("send-sms-iframe");
//		WebElement iframeeg = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
//		driver.switchTo().frame(iframeeg);
		driver.findElement(By.id("regEmail")).sendKeys("9791524283");
		
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
	}
}
