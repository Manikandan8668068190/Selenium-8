package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTF = driver.findElement(By.id("username"));
		
		Thread.sleep(3000);
		usernameTF.clear();
		Thread.sleep(2000);
		usernameTF.sendKeys("testing");
		
		
       WebElement PasswordTF = driver.findElement(By.id("password"));
		
		Thread.sleep(3000);
		PasswordTF.clear();
		Thread.sleep(2000);
		PasswordTF.sendKeys("test ");
		
		
		
	}
}
