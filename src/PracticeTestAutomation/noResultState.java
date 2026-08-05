package PracticeTestAutomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class noResultState {
	public String expected = null;
	public String actual = null;

	public static void main(String []args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		driver.findElement(By.xpath("//input[@value='Beginner']")).click();
		
		WebElement message = driver.findElement(By.xpath("//div[@id='noData']"));
		Assert.assertEquals(message.getText(), "No matching courses.");
		
		System.out.println("Test passed");

		
		 
		 
		
		

	}

}
