package CrossBowserTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment1 extends BaseClassA1{
	
	@Parameters("Browser")
	@Test
	public void clickOnSales() {
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		
		if(driver.getTitle().equals("SkillRary Ecommerce")) {
			Reporter.log("Sales Page is Displayed", true);
		}
		else {
			Reporter.log("Sales Page is not displayed", true);
		}
	}
}
