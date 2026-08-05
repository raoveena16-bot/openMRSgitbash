package axes_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class DynamicLoad {

	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	public void dynamicLoad() {
		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		// Wait for the element to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		
		String text = driver.findElement(By.id("finish")).getText();
		System.out.println(text);
	}
	
	
	
	
	
	
	
}



