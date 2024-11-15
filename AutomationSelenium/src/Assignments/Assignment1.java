package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("")) {
			System.out.println("Welcome page is displayed");
		}
		else {
			System.out.println("Welcome page is not displayed");
		}
	}
}
