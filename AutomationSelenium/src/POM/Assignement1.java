package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignement1 {
	public static void main(String[] args) throws IOException {
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
		String ER = WB.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get(URL);
		
		Welcomepage WP=new Welcomepage(driver);
		WP.getSignInLink().click();
		
		RegisterPage RP=new RegisterPage(driver);
		RP.getGenderRadioButton().click();
		RP.getFirstnameTextField().sendKeys(firstname);
		RP.getLastnameTextField().sendKeys(lastname);
		RP.getEmailTextField().sendKeys(email);
		RP.getPasswordTextField().sendKeys(password);
		RP.getConfirmPassword().sendKeys(cp);
		RP.getRegisterButton().click();
	    String text = RP.getActualResult().getText();
		
		
		
		if(text.contains(ER))
			System.out.println("Successfully Registred");
		else
			System.out.println("Not Registred");
	}
}
