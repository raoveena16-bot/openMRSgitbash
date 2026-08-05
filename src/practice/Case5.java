package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case5 {

	WebDriver driver;
	@Test(priority = 1)
	public void noResultState() {
		
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()=' Python']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Beginner')]")).click();
		
		
		WebElement ele = driver.findElement(By.id("noData"));
		String text = ele.getText();
		System.out.println(text);

	}
	
	@Test(priority = 2)
	public void toggleFilter() {
		driver.findElement(By.xpath("//label[text()=' Python']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Beginner')]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//table[@id='courses_table']"));
		String text = ele.getText();
		Assert.assertTrue(text.contains("Python"), "Python is not present in the list");
		System.out.println("Table is not empty");
		
	}
	
	
}
