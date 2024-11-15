package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnWebElementScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		File temp = driver.findElement(By.id("newsletter-subscribe-button")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/image2.png");
		FileHandler.copy(temp, dest);
	}
}
