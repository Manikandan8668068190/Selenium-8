package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/Register.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		String FN = prop.getProperty("Firstname");
		String LN = prop.getProperty("Lastname");
		String email = prop.getProperty("Email");
		String pwd = prop.getProperty("password");
		String CP = prop.getProperty("confirmpassword");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get(URL);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CP);
		driver.findElement(By.id("register-button")).click();
		String get = driver.findElement(By.xpath("//div[contains(text(),' Your registration completed')]")).getText();
		System.out.println(get);
	}
}
