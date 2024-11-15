  package Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listenerImplementation implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getName();//it will return current @test running method name
		String time = LocalDateTime.now().toString().replace(":","-");
		
		Reporter.log("TestScript is failed", true);
		
		TakesScreenshot ts=(TakesScreenshot) BaseClass.driver;//sdriver
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+methodname+time+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
