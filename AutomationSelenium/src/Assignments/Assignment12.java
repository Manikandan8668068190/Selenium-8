package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();
		
		List<WebElement> name = driver.findElements(By.tagName("h2"));
		
		
		for (WebElement name1:name) {
			System.out.println(name1.getText());
		}
	}
}
