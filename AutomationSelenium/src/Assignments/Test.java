package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		WebElement county = driver.findElement(By.xpath("//select[@title='India']"));
		Select sl=new Select(county);
		sl.selectByVisibleText("Zimbabwe");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/Test.png");
		FileHandler.copy(temp, dest);
		
		driver.findElement(By.partialLinkText("Oracle.com Terms of Use")).click();
		
		System.out.println(windowHandles);
		
		
		
		List<WebElement> name = driver.findElements(By.tagName("h3"));
		
		for (String windows :windowHandles) {
			driver.switchTo().window(windows);
			
		}
		for(WebElement name1:name) {
			System.out.println(name1.getText());
		}
	}
}
