package pageClasses;

import org.openqa.selenium.By;

public class AppointmentPatientPage {
	public static By takeAppointmentButton() {
		return By.xpath("//a[text()='Appointments']");
	}

	public static By createAppointment() {
		return By.xpath("//button[contains(text(), 'Create new appointment')]");
	}

	/*public static By searchPatName() {
		return By.xpath("//input[@class='cds--search-input']");
	}*/
	public static By searchPatName() {
		
		return By.xpath("//input[contains(@data-testid, 'patientSearchBar')]");
		
	}


	public static By clickStartVisit() {
		return By.xpath("//button[text()='Start visit']");
	}

	public static By clickOfficialVisit() {
		return By.xpath("(//span[@class='cds--radio-button__appearance'])[1]");
	}

	public static By selectVisitTime() {
		return By.xpath("(//select[@class='cds--select-input'])[6]");
	}
public static By selectStartVisit()
{
	return By.xpath("//span[text()='Start visit']");
}
	public static By clickHome() {
		return By.xpath("//a[@class='cds--side-nav__link false']");
	}

	
	public static By validatePatID()
	{
		return By.xpath("//div[text()='ID Number']");
		
	}
	
	
	
	
	
}
