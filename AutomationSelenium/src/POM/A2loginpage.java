package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A2loginpage {
	@FindBy(id = "email")
	private WebElement emailTextFeild;
	
	@FindBy(id = "password")
	private WebElement passwordTextFeild;
	
	@FindBy(id = "last")
	private WebElement loginButton;
	
	public A2loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}
