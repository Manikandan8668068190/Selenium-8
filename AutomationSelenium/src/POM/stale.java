package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stale {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		SkillRarypage SRP=new SkillRarypage(driver);
		SRP.getSearchTF().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		SRP.getSearchTF().sendKeys("testing");
		
//		WebElement searchTF = driver.findElement(By.id("navbar-search-input"));
//		searchTF.sendKeys("selenium",Keys.ENTER);
//		
//		searchTF.sendKeys("testing");
	}
}
