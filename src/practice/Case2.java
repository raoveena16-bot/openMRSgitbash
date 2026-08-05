package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case2 {

	WebDriver driver;
	
	@Test
	
	public void beginnerFilter() {
		
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text()=' Intermediate']")).click();
		driver.findElement(By.xpath("//label[text()=' Advanced']")).click();

		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='courses_table']/tbody/tr/td[4]"));
		
		List <String> cell = new ArrayList<String>();
		
		for (int i =0; i<column.size(); i++) {
			String Beginners = column.get(i).getText();
			cell.add(Beginners);
			System.out.println("Actual list" + Beginners);
			Assert.assertTrue(cell.contains("Beginner"), "Beginner is not present in the list");
		}
	}
	
	
}
