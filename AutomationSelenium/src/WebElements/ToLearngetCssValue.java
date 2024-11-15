package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		WebElement errormeg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		String color = errormeg.getCssValue("color");
		String fontsize = errormeg.getCssValue("font-size");
		String fontfamily = errormeg.getCssValue("font-family");
		
		System.out.println(color);
		System.out.println(fontsize);
		System.out.println(fontfamily);*/
		
		driver.get("https://demowebshop.tricentis.com/register");
		String cssValue = driver.findElement(By.xpath("//input[@value='Register']")).getCssValue("color");
		System.out.println(cssValue);
	}
}
