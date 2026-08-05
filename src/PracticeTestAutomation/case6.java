package PracticeTestAutomation;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class case6 {
	public static void main(String []args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		WebElement resetButton = driver.findElement(By.xpath("//button[@id='resetFilters']"));
		Assert.assertTrue(resetButton.isDisplayed());
		System.out.println("Reset button becomes visible");
		
		
		driver.findElement(By.xpath("//button[@id='resetFilters']")).click();
		
		WebElement language = driver.findElement(By.xpath("//input[@value='Any']"));
		Assert.assertTrue(language.isSelected());
		System.out.println("Language = Any");
		
		List<WebElement> Levels = driver.findElements(By.name("level"));

		for (WebElement AllLevel : Levels) {
		    Assert.assertTrue(AllLevel.isSelected());
		}

		System.out.println("All Levels are checked");
		
		String EnrollAny = driver.findElement(By.xpath("//span[text()='Any']")).getText();
		Assert.assertEquals(EnrollAny, "Any");
		
		System.out.println("Min enrollments = Any");
		
		WebElement reset = driver.findElement(By.xpath("//button[@id='resetFilters']"));
		Assert.assertFalse(reset.isDisplayed());
		System.out.println("Reset button is Not visible");


		

		
		
		
	}

}
