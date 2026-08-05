package openMRS_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import openMRS_patientPage.LoginPage;
import openMRS_patientPage.StartVisit;

public class AddPatientToTheQueue {
	
	
	LoginPage page;
	StartVisit startVisit;
	
	
	@Test(priority=0)
	public void AddPatient() {
		
		WebDriver driver = new ChromeDriver();
		//using Page Object Model
		page = new LoginPage(driver);
		page.launchApp();
		page.login();
		
		startVisit = new StartVisit(driver);
		
		startVisit.startVisit();
		
		startVisit.visitType();
		startVisit.billing();
		startVisit.category();
		startVisit.submit();
		
	}
	
	
	
	
}
