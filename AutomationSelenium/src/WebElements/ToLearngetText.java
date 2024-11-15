package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String errormsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(errormsg);
		
		if(errormsg.contains("Login Was Unsuccessfully")) {
			System.out.println("Error Msg is displayed");
		}
		else {
			System.out.println("Error Msg is not displayed or incorrect");
		}
	}
}
