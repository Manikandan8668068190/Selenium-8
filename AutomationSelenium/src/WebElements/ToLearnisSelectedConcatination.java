package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnisSelectedConcatination {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String rating="Excellent";
		WebElement checkBox = driver.findElement(By.xpath("//label[text()='"+rating+"']/..//input[@type='radio']"));
		
		System.out.println("====Before Clicking====");
		System.out.println(checkBox.isSelected());
		
		checkBox.click();
		System.out.println("====After Clicking====");
		System.out.println(checkBox.isSelected());

	}
}