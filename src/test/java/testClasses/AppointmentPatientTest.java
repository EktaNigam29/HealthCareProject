package testClasses;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageClasses.AppointmentPatientPage;
import pageClasses.RegisterPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class AppointmentPatientTest extends BaseClass {
	@Test(priority = 2, groups = { "sanity" }, retryAnalyzer = utilities.RetryAnalyzer.class)
	public static void appointmentPatient() throws InterruptedException {
		LoginTest.executeLoginTest();
		addExplicitWait(AppointmentPatientPage.takeAppointmentButton());
		driver.findElement(AppointmentPatientPage.takeAppointmentButton()).click();
		addExplicitWait(AppointmentPatientPage.createAppointment());
		driver.findElement(AppointmentPatientPage.createAppointment()).click();
		addExplicitWait(AppointmentPatientPage.searchPatName());
		driver.findElement(AppointmentPatientPage.searchPatName()).sendKeys("Joshua Thomas");
		addExplicitWait(AppointmentPatientPage.clickStartVisit());
		driver.findElement(AppointmentPatientPage.clickStartVisit()).click();
		addExplicitWait(AppointmentPatientPage.clickOfficialVisit());
		driver.findElement(AppointmentPatientPage.clickOfficialVisit()).click();
	//	addExplicitWait(AppointmentPatientPage.selectVisitTime());
		//driver.findElement(AppointmentPatientPage.selectVisitTime());
		
		addExplicitWait(AppointmentPatientPage.selectStartVisit());
		driver.findElement(AppointmentPatientPage.selectStartVisit()).click();
		addExplicitWait(AppointmentPatientPage.clickHome());
		driver.findElement(AppointmentPatientPage.clickHome()).click();
		addExplicitWait(AppointmentPatientPage.validatePatID());
		driver.findElement(AppointmentPatientPage.validatePatID());

	}

}
