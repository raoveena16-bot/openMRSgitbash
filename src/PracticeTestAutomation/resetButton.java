package PracticeTestAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class resetButton {
	
	public static void main(String []args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-table/");
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='Beginner']"));
		checkBox.click();
		
		Duration d = Duration.ofSeconds(10);
		
		WebDriverWait wait = new WebDriverWait(driver,d);
		WebElement reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetFilters")));
		reset.click();
		System.out.println("Reset button is visible");
	}
		
		
		
		
		
	}


