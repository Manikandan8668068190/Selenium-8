package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WelecomePage WP=new WelecomePage(driver);
		WP.getLoginLink().click();
		
		LoginPage LP=new LoginPage(driver);
		LP.getEmailTextField().sendKeys("yugesh@14gmail.com");
		LP.getPasswordTextField().sendKeys("yugesh5109");
		LP.getRegisterButton().click();
	}
}
