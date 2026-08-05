package PracticeTestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class combinedFilters {
	static WebDriver driver;
	
	public static void main(String[] args) {
	 driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		//driver.findElement(By.xpath("//input[@value='Python']")).click();
		//driver.findElement(By.xpath("//input[@value='Intermediate']")).click();
		//driver.findElement(By.xpath("//input[@value='Advanced']")).click();
		
		valueType("Python");
		valueType("Intermediate");
		valueType("Advanced");	
		
		
		
		
		driver.findElement(By.xpath("//div[@id='enrollDropdown']/div")).click();

        driver.findElement(By.xpath("//ul[@role='listbox']/li[text()='10,000+']")).click();
		
		
	}
public static void valueType(String value) {
	
	driver.findElement(By.xpath("//input[@value='"+value+"']")).click();

	
}
}
