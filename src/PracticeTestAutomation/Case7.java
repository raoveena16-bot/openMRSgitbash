package PracticeTestAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case7 {
	WebDriver driver;
	List<String> actualList = new ArrayList<>();
	List<String> expectedList = new ArrayList<>(actualList);
	
	@Test
	
	public void SortEnrollment() {
		launchApp();
		SortBy();
		ActualEnrollementList();
		ExpectedEnrollementList();
		Assert();
		
	}
	
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().window().maximize();
	}
	
	public void SortBy() {
		//driver.findElement(By.xpath("//select[@id='sortBy']")).click();
		driver.findElement(By.xpath("//option[@value='col_enroll']")).click();
	}
	
	public void ActualEnrollementList() {
	List<WebElement> Enroll	= driver.findElements(By.xpath("//table[@id='courses_table']/tbody/tr/td[5]"));
	List<Integer> ActualList = new ArrayList<>();
	for(int i=0;i<Enroll.size();i++) {
		String enrollmentList = Enroll.get(i).getText();
		ActualList.add(Integer.parseInt(enrollmentList));
		System.out.println("Actual Enrollement List" + ActualList);
	}
	}
	
	public void ExpectedEnrollementList() {
		List<WebElement> Enroll	= driver.findElements(By.xpath("//table[@id='courses_table']/tbody/tr/td[5]"));
		List<Integer> ExpectedList = new ArrayList<>();
		for(int i=0;i<Enroll.size();i++) {
			String enrollmentList = Enroll.get(i).getText();
			ExpectedList.add(Integer.parseInt(enrollmentList));
		Collections.sort(ExpectedList);
		
		System.out.println("Expected Enrollement List" + ExpectedList);}
		
		}
		
			
		private void Assert() {
		
		Assert.assertEquals(actualList, expectedList); 
		System.out.println("Test Passed");
		
	}
	

}
