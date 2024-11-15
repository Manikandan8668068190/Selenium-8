package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignement1 {
	
	@Test(dataProviderClass = DataStorage1.class,dataProvider = "registerData")
	
	public void register(String[] cred) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/login.php?type=register");
	driver.findElement(By.name("firstname")).sendKeys(cred[0]);
	driver.findElement(By.name("email")).sendKeys(cred[1]);
	driver.findElement(By.name("repassword")).sendKeys(cred[2]);
	driver.findElement(By.name("lastname")).sendKeys(cred[3]);
	driver.findElement(By.name("password")).sendKeys(cred[4]);
	}
}
