package ActionAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		
		Actions act=new Actions(driver);
		WebElement rightclick = driver.findElement(By.linkText("Right Click"));
		rightclick.click();
		
		WebElement rc=driver.findElement(By.linkText("Right Click"));
		act.contextClick(rc).perform();
		
		WebElement yes=driver.findElement(By.linkText("Yes"));
		yes.click();
	}
}
