package axes_locators;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddElement {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void addButton() {
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	}

	@Test (priority = 1)
	public void buttonDisplayed() {
		driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
	
	
		WebElement button = driver.findElement(By.xpath("//button[text()='Add Element']"));
		button.click();

		WebElement delete = driver.findElement(By.xpath("//button[text()='Delete']"));
		delete.isDisplayed();
		System.out.println("Delete button is displayed");


	}
	 @Test (priority = 2)
	public void deleteButton() {
		WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
		deleteButton.click();
		List<WebElement> button = driver.findElements(By.xpath("//button[text()='Delete']"));
		
		
		Assert.assertEquals(button.size(), 0, "Button still exists");
		System.out.println("Delete button is not visible");
		
		
	
		
	}
	





}
