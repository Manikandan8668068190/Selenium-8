package ActionAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@src,'https://api-prod.capcvet.org/api/embed/pda/')]"));
		driver.switchTo().frame(frame);
	    driver.findElement(By.id("region-27")).click();
	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	    
	    driver.findElement(By.id("user")).sendKeys("yugesh@14.com");
	    driver.findElement(By.id("pass")).sendKeys("Yugesh14@");
	    driver.findElement(By.id("cpass")).sendKeys("Yugesh14@");
	    driver.findElement(By.id("firstName")).sendKeys("yugesh");
	    driver.findElement(By.id("lastName")).sendKeys("yugesh");
	    driver.findElement(By.id("phone")).sendKeys("9791524283");
	    WebElement usertype = driver.findElement(By.id("user-type"));
	    
	    Select option=new Select(usertype);
	    option.selectByVisibleText("Pet Owner");
	    driver.findElement(By.id("accept-tou")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@value='Register']")).click();
	    
	}
}
