package axes_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkboxes {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void checkboxes() {
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		WebElement check1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		check1.click();
		System.out.println("Checkbox1 is selected");
		
		
		WebElement check2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		check2.click();
		System.out.println("Checkbox2 is unselected");
		
		
		
		
	}

}
