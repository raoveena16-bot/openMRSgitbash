package PracticeTestAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case8 {
	WebDriver driver;
	List<String> actualList = new ArrayList<>();
	List<String> expectedList = new ArrayList<>(actualList);
	@Test
	
	public void SortCourseName() {
		launchApp();
		sortBy();
		ActualAtoZ();
		ExpectedAtoZ();
		 Assert();
		
	}
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().window().maximize();
	}
	
	public void sortBy() {
		driver.findElement(By.xpath("//option[text()='Course Name']")).click();
		
		System.out.println("Coursename is selected");
	}
	   
	  
	   public void ActualAtoZ() {
	   List<WebElement> sortAtoZ = driver.findElements(By.xpath("//table[@id='courses_table']/tbody/tr/td[2]"));
	   
	   //List<String> actualList = new ArrayList<>();
	   
	   for (WebElement Course : sortAtoZ) {
		    actualList.add(Course.getText().trim());
		    //System.out.println(actualList);
		    }
	   //Collections.sort(actualList);
		System.out.println("Actual List" + actualList);
		return;
	   
		}
	   
	   public void ExpectedAtoZ() {
		   
		  List<WebElement> sortAtoZ = driver.findElements(By.xpath("//table[@id='courses_table']/tbody/tr/td[2]"));
		  for (WebElement Course : sortAtoZ) {
			  expectedList.add(Course.getText().trim());
		  }
		  
		  //List<String> expectedList = new ArrayList<>(actualList);
		   Collections.sort(expectedList, String.CASE_INSENSITIVE_ORDER);
		  
		System.out.println("Sorted Expected List" + expectedList);
		return;
	   }
	   
	   public void Assert() {
		   
		   Assert.assertEquals(actualList, expectedList); 
			System.out.println("Test Passed");
		   
	   
}

}

