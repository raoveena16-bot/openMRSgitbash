package axes_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDropDown {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	@Test
	public void selectDropDown() {
		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
		Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		dropdown.selectByVisibleText("Option 1");
		
		
		System.out.println("Option 1 is selected");
	}

}
