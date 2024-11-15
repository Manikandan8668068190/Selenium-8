package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		//Step1 : Create fileInputStream object
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		
		//Step2 : Create Respective FileType Object
		Properties prop=new Properties();
		
		//Step3 : Call Read Methods
		prop.load(fis);
		String URL = prop.getProperty("url");
		String usename = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		System.out.println(URL);
		System.out.println(usename);
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(usename);
		driver.findElement(By.id("password")).sendKeys(password);
	}
}
