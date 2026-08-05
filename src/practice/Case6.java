package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case6 {
	
	WebDriver driver;
	@Test(priority = 1)
	public void resetButton() {
		
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text()=' Python']")).click();
		
		WebElement button = driver.findElement(By.xpath("//button[@id='resetFilters']"));
		button.isDisplayed();
		System.out.println("Reset button is displayed");
	}
	
	@Test(priority = 2)
		public void restored() {
		
		driver.findElement(By.xpath("//button[@id='resetFilters']")).click();
		
		WebElement any = driver.findElement(By.xpath("//label[contains(text(),' Any')]"));
		Assert.assertFalse(any.isSelected(), "Any is not selected");
		System.out.println(" Default logic is restored");
		}
		
		
			
	}


