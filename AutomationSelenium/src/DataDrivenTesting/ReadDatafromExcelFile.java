package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadDatafromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1 : Create File Input Stream Object
		FileInputStream fis=new FileInputStream("./TestData/TestScript.xlsx");
		
		//Step 2 : Create Respective file type object
		Workbook WB = WorkbookFactory.create(fis);
		
		//Step 3 : Call read methods
		String url = WB.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = WB.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = WB.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		int price = (int) WB.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);
		
		boolean status = WB.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(status);
		
		LocalDateTime date = WB.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);
		
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);*/
	}
}
