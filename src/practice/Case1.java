package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case1 {
	
	WebDriver driver;
	
	@Test
	public void languageFilter() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().window().maximize();
		
		WebElement radioButton = driver.findElement(By.xpath("//label[contains(text(),' Java')]"));
		radioButton.click();
		System.out.println("Java is selected");
		
		List<WebElement>coulumn = driver.findElements(By.xpath("//table[@id='courses_table']/tbody/tr/td[3]"));
		
		List <String> Java = new ArrayList<String>();
		
		for(int i=0; i<coulumn.size(); i++) {
			String LanguageList = coulumn.get(i).getText();
			Java.add(LanguageList);
			System.out.println("Actual list" + LanguageList);
			
			Assert.assertTrue(Java.contains("Java"), "Java is not present in the list");
		
	}

}
}
