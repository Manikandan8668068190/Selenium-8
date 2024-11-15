package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A2Welcomepage {
	@FindBy(linkText = "LOGIN")
	private WebElement loginLink;
	
	public A2Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginLink() {
		return loginLink;
	}
}
