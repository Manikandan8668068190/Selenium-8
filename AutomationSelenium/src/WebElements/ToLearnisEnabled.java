package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnisEnabled {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.instagram.com/");
		 Thread.sleep(3000);
		 WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		 
		 System.out.println("====Before Passing====");
		 System.out.println(loginbutton.isEnabled());
		 
		 Thread.sleep(3000);
		 driver.findElement(By.name("username")).sendKeys("1234567890");
		 driver.findElement(By.name("password")).sendKeys("Test@12345");
		 
		 Thread.sleep(4000);
		 System.out.println("====After Passing====");
		 System.out.println(loginbutton.isEnabled());
	}
}
