package axes_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicControls {
	
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
	}
	
@Test
 public void dynamicControls() {
	 driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
	 driver.findElement(By.xpath("//button[text()='Remove']")).click();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
	 String message = driver.findElement(By.id("message")).getText();
	 System.out.println(message);

	 WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
	 add.isEnabled();
	 System.out.println("Add button is enabled: " + add.isEnabled());
	 
	 
}

public void dynamicControls2() {
	 driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
	 driver.findElement(By.xpath("//button[text()='Enable']")).click();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
	 String message = driver.findElement(By.id("message")).getText();
	 System.out.println(message);

	 WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
	 inputField.isEnabled();
	 System.out.println("Input field is enabled: " + inputField.isEnabled());




}
}
