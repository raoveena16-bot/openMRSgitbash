package axes_locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EntryAd {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	@Test
	 public void addPopUp() {
		 driver.findElement(By.xpath("//a[text()='Entry Ad']")).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal")));
		 //driver.switchTo().frame(driver.findElement(By.id("modal")));
		 driver.findElement(By.xpath("//div[@class='modal-footer']/p")).click();
		 System.out.println("Alert accepted");
		 
		 driver.navigate().refresh();
		 Assert.assertTrue(driver.findElement(By.id("modal")).isDisplayed(), "Modal is not displayed");
		 System.out.println("Modal is not displayed");
		 
		 

}
}

