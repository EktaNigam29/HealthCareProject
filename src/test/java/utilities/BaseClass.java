package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pageClasses.AppointmentPatientPage;

public class BaseClass {

//declare WebDriver

	public static WebDriver driver;
	
    
   @BeforeMethod(alwaysRun = true)
	public void openBrowser() throws IOException {
		String browserName = FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();

		}

		if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();
		}
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
			driver.manage().window().maximize();
			addImpicitWait();
		}

	}

	public static void addExplicitWait(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void addImpicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");
	}
public static void selectVisitTimeOption()
{
	Select visitTimeDropdown = new Select(driver.findElement(AppointmentPatientPage.selectVisitTime()));
	visitTimeDropdown.selectByVisibleText("On time");
}
	
	
	@AfterTest(alwaysRun = true)
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();

	}

	

}
