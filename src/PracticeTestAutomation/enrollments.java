package PracticeTestAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class enrollments {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='enrollDropdown']/div")).click();
		driver.findElement(By.xpath("//ul[@role='listbox']/li[text()='10,000+']")).click();
		


        
		selectAnyValue("5,000+");
		selectAnyValue("50,000+");
	}
	public static void selectAnyValue(String value)
	{
		driver.findElement(By.xpath("//div[@id='enrollDropdown']/div")).click();
		driver.findElement(By.xpath("//ul[@role='listbox']/li[text()='"+value+"']")).click();

	}

		
		
	}


