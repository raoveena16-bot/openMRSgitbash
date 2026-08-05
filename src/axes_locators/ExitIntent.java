package axes_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExitIntent {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	@Test
	public void exitIntent() {
		driver.findElement(By.xpath("//a[text()='Exit Intent']")).click();
		// Move the mouse to the top of the page to trigger the exit intent
		Actions actions = new Actions(driver);
		actions.moveByOffset(0, -900).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ouibounce-modal")));
		
		String modalText = driver.findElement(By.id("ouibounce-modal")).getText();
		System.out.println(modalText);
		
		driver.findElement(By.xpath("//div[@class='modal-footer']/p")).click();
		System.out.println("Modal closed");
	}
	

}
