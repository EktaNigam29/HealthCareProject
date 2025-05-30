package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import constantData.ConstantData;

public class ListenerImplementation  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		WebDriver driver = BaseClass.driver;
		ITestListener.super.onTestSuccess(result);
	//	Reporter.log("My Test Case got passed");
		if(driver !=null) {
	try {	TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File(ConstantData.ScreenshotPathPass);
		FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
        Reporter.log("Driver is null. Cannot capture screenshot on success.");
    }
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		WebDriver driver = BaseClass.driver;
	//	Reporter.log("My Test Case got failed");
		if(driver !=null) {
		try{TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(ConstantData.ScreenshotPathFail);
		
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else {
            Reporter.log("Driver is null. Cannot capture screenshot on failure.");
        }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
	}

}
