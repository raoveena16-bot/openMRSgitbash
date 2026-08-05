package openMRS_patientPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	
	private By userNameLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By continueButtonLocator = By.xpath("//button[text()='Continue']");
	private By loginButtonLocator = By.xpath("//button[text()='Log in']");
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://openmrs.org/demo/");
		driver.manage().window().maximize();
	}
	
	public void login() {
		driver.findElement(By.xpath("//a[text()='Explore OpenMRS 3']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='-esm-login__login__container___SmdkR']")));

		
		driver.findElement(userNameLocator).sendKeys("admin");
		driver.findElement(continueButtonLocator).click();
		driver.findElement(passwordLocator).sendKeys("Admin123");
		driver.findElement(loginButtonLocator).click();
		
	}
}
