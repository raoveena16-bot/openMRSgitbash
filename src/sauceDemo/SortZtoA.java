package sauceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortZtoA {
	
	WebDriver driver;
	List<String> expectedNames = new ArrayList<>();
	List<String> actualNames = new ArrayList<>();
	
	@Test
	
	public void sortNames() {
		launchApp();
		login();
		expected();
		actual();
		assertNames();
	}
	
	
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	public void login() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();	
	}
	
	public void expected() {
		
		
		List<WebElement> expectedList = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		List<String> textList = new ArrayList<>();

		for (WebElement element : expectedList) {
		    textList.add(element.getText().trim());
		}

		Collections.sort(textList, Collections.reverseOrder());

		expectedNames.addAll(textList);
		System.out.println("Expected Names" + expectedNames);
		return;

	}
	
	public void actual() {

	    WebElement sortDropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	    Select select = new Select(sortDropdown);
	    select.selectByVisibleText("Name (Z to A)");

	    List<WebElement> actualList = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

	    actualNames.clear(); // important if test runs multiple times

	    // Fetch the text of each element and add it to the actualNames list
	    for (WebElement element : actualList) {
	        actualNames.add(element.getText().trim());
	    }

	    System.out.println("Actual Names: " + actualNames);
	}

	
	public void assertNames() {
		Assert.assertEquals(expectedNames, actualNames);
		System.out.println("Assertion Passed: Expected and Actual Names are equal.");
	}
}