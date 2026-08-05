package openMRS_patientPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StartVisit {
	
	private By addPatientButtonLocator = By.xpath("//button[contains(text(),'Add patient')]");
	private By searchPatientInputLocator = By.xpath("//input[@placeholder='Search for a patient by name or identifier number']");
	private By searchResultsLocator = By.xpath("//div[@data-openmrs-role='Search Results']");
	private By startVisitButtonLocator = By.xpath("//button[@aria-label='Start visit'][normalize-space()='Start visit']");
	
	WebDriver driver;
	
	public StartVisit(WebDriver driver) {
		this.driver = driver;
	}

	public void startVisit() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addPatientButtonLocator));
		driver.findElement(addPatientButtonLocator).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.presenceOfElementLocated(searchPatientInputLocator));

		driver.findElement(searchPatientInputLocator).sendKeys("John Doe");

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(
				searchResultsLocator));
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(
		    By.xpath("(//button[@aria-label='Start visit'][normalize-space()='Start visit'])[2]")));
		
		

		WebElement startVisit = driver.findElement(startVisitButtonLocator);
		startVisit.click();
		
		
	}
	
	public void selectLocation() {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='cds--list-box__menu-item__option']")).click();
					
		driver.findElement(By.xpath("//div[text()='Mobile Clinic']")).click();
		String selected = driver.findElement(By.xpath("//div[@class='cds--list-box__field']")).getText();
		Assert.assertEquals(selected, "Mobile Clinic");
		System.out.println("Selected location: " + selected);

}
	
	public void visitType() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement radioButton = driver.findElement(By.xpath("//span[text()='Home Visit']"));
		radioButton.click();
		System.out.println("Selected visit type: " + radioButton.getText());
	}
	
	public void billing() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement radioButton = driver.findElement(By.xpath("//span[text()='Non paying']"));
		radioButton.click();
		System.out.println("Selected billing option: " + radioButton.getText());
	}
    public void category() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement categoryInput = driver.findElement(By.id("patientCategory"));
		categoryInput.click();
		categoryInput.sendKeys("Student");

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement option = wait.until(
		    ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@id,'downshift')]/li[normalize-space()='Student']")));

		option.click();

		String selected = driver.findElement(By.id("patientCategory")).getText();
		
		
		System.out.println("Patient category: " + selected);
    }
    
    public void submit() {
    	driver.findElement(By.xpath("//button[@class='-esm-patient-chart__visit-form__button___DrzMe cds--btn cds--btn--primary']")).click();
    }
    

}
