package Configuration;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assigment1 extends BaseclassA1 {
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
