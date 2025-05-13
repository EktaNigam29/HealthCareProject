package testClasses;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageClasses.RecordPatientDetailsPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class RecordPatientDetailsTest extends BaseClass
{
	@Test(priority = 3, groups = {"sanity"},retryAnalyzer = utilities.RetryAnalyzer.class)
	public static void addPatVitals() throws InterruptedException {
		LoginTest.executeLoginTest();
		addExplicitWait(RecordPatientDetailsPage.clickPatName());
		driver.findElement(RecordPatientDetailsPage.clickPatName()).click();
		//Thread.sleep(3000);
		addExplicitWait(RecordPatientDetailsPage.recordVitals());
		driver.findElement(RecordPatientDetailsPage.recordVitals()).click();
		addExplicitWait(RecordPatientDetailsPage.temprature());
		driver.findElement(RecordPatientDetailsPage.temprature()).sendKeys("35");;
		addExplicitWait(RecordPatientDetailsPage.systolic());
		driver.findElement(RecordPatientDetailsPage.systolic()).sendKeys("120");
		addExplicitWait(RecordPatientDetailsPage.diastolic());
		driver.findElement(RecordPatientDetailsPage.diastolic()).sendKeys("80");
		addExplicitWait(RecordPatientDetailsPage.heartRate());
		driver.findElement(RecordPatientDetailsPage.heartRate()).sendKeys("15");
		addExplicitWait(RecordPatientDetailsPage.RespRate());
		driver.findElement(RecordPatientDetailsPage.RespRate()).sendKeys("16");
		addExplicitWait(RecordPatientDetailsPage.SPO());
		driver.findElement(RecordPatientDetailsPage.SPO()).sendKeys("98");
		addExplicitWait(RecordPatientDetailsPage.Weight());
		driver.findElement(RecordPatientDetailsPage.Weight()).sendKeys("68");
		addExplicitWait(RecordPatientDetailsPage.Height());
		driver.findElement(RecordPatientDetailsPage.Height()).sendKeys("172");
		addExplicitWait(RecordPatientDetailsPage.BMI());
		driver.findElement(RecordPatientDetailsPage.BMI()).sendKeys("23");
		addExplicitWait(RecordPatientDetailsPage.MUAC());
		driver.findElement(RecordPatientDetailsPage.MUAC()).sendKeys("28");
		addExplicitWait(RecordPatientDetailsPage.submitDetails());
		driver.findElement(RecordPatientDetailsPage.submitDetails()).click();
		addExplicitWait(RecordPatientDetailsPage.getVitalsText());
		driver.findElement(RecordPatientDetailsPage.getVitalsText());
		addExplicitWait(RecordPatientDetailsPage.getBiometericsText());
		driver.findElement(RecordPatientDetailsPage.getBiometericsText());
		addExplicitWait(RecordPatientDetailsPage.endVisit());
		driver.findElement(RecordPatientDetailsPage.endVisit()).click();
		addExplicitWait(RecordPatientDetailsPage.confirmEndVisit());
		driver.findElement(RecordPatientDetailsPage.confirmEndVisit()).click();
		addExplicitWait(RecordPatientDetailsPage.closeVisit());
		driver.findElement(RecordPatientDetailsPage.closeVisit()).click();
		addExplicitWait(RecordPatientDetailsPage.getHomeText());
		driver.findElement(RecordPatientDetailsPage.getHomeText());
		
		
	}
	


}
