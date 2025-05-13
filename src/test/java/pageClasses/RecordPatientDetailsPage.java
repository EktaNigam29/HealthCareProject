package pageClasses;

import org.openqa.selenium.By;

public class RecordPatientDetailsPage {

	public static By clickPatName() {
		return By.xpath("//a[text()='Joshua Thomas']");
		
		//a[@href='/openmrs/spa/patient/be1795e1-85c3-4e1d-adee-9b05d5f424c7/chart']
	}

	public static By recordVitals() {
		return	By.xpath("//button[@class='-esm-patient-vitals__vitals-header__recordVitalsButton___kpFyI cds--btn cds--btn--sm cds--layout--size-sm cds--btn--ghost']");
	}

	public static By temprature() {
		return By.xpath("//input[contains(@name, 'Temperature')]");
	}

	public static By systolic() {
		return By.xpath("//input[@name='systolic']");
	}

	public static By diastolic() {
		return By.xpath("//input[@name='diastolic']");
	}

	public static By heartRate() {
		return By.xpath("//input[@name='Pulse']");
	}

	
	public static By RespRate() {
		return By.xpath("//input[contains(@name, 'Respiration rate')]");
	}
	
	public static By SPO() {
		return By.xpath("//input[contains(@name, 'Oxygen saturation')]");
	}
	
	
	public static By Weight() {
		return By.xpath("//input[contains(@name, 'Weight')]");
	}
	public static By Height() {
		return By.xpath("//input[contains(@name, 'Height')]");
	}
	public static By BMI() {
		return By.xpath("//input[contains(@name, 'BMI')]");
	}
	public static By MUAC() {
		return By.xpath("//input[contains(@name, 'MUAC')]");
	}
	public static By submitDetails() {
		return By.xpath("//button[@type='submit']");
	}
public static By getVitalsText()
{
	return By.xpath("//div[text()='BP (mmHg)']");
}

public static By getBiometericsText()
{
	return By.xpath("//div[text()='Height (cm)']");
}

public static By endVisit(){
	return By.xpath("//button[text()='End visit']");
}

public static By confirmEndVisit(){
	return By.xpath("//button[@class='cds--btn cds--btn--danger']");
}
public static By closeVisit()
{
return By.xpath("(//span[@class='cds--popover-container cds--popover--caret cds--popover--high-contrast cds--popover--bottom cds--tooltip cds--icon-tooltip'])[5]");
	  
	}

public static By getHomeText()
{
	return By.xpath("//a[text()='Home']");
}
}

