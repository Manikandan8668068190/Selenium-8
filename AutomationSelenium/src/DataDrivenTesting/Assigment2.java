package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assigment2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis1=new FileInputStream("./TestData/common.properties");
		FileInputStream fis2=new FileInputStream("./TestData/TestScriptData.xlsx");
		
		Properties prop=new Properties();
		prop.load(fis1);
		Workbook WB = WorkbookFactory.create(fis2);
		
		String URL = prop.getProperty("url");
		String firstname = WB.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String lastname = WB.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String email = WB.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String password = WB.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String cp = WB.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get(URL);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cp);
		driver.findElement(By.id("register-button")).click();
	}
}
