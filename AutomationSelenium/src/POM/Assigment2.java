package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assigment2 {
	@Test
	public void sillary() throws IOException {
		Reporter.log("Welcome to Sillarypage", true);
		
		FileInputStream fis1=new FileInputStream("./TestData/skillary.properties");
		FileInputStream fis2=new FileInputStream("./TestData/skillary test data.xlsx");
		
		Properties prop=new Properties();
		prop.load(fis1);
		Workbook WB = WorkbookFactory.create(fis2);
		
		String URL = prop.getProperty("url");
		String email = WB.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String password = WB.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get(URL);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("last")).click();
	}
}
