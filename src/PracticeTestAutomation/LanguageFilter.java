package PracticeTestAutomation;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LanguageFilter{
	WebDriver driver;
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	public void FilterJava() {
		driver.findElement(By.xpath("//input[@value='Java']")).click();
	}
		
	public void ActualFilter() {	
		List<WebElement> Language = driver.findElements(By.xpath("//table[@id='courses_table']/tbody/tr/td[3]"));
        List<String> Java = new ArrayList<String>();
        
			for (int i=0; i<Language.size();i++) {
				String LanguageList = Language.get(i).getText();
			   Java.add(LanguageList);
			    
			    System.out.println("Actual list" + LanguageList);
			}

	}

}
