package axes_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	WebDriver  driver;
	
	@BeforeTest
	public void launchBrowser() {
	driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void rightClick() {
		driver.findElement(By.linkText("Context Menu")).click();
		WebElement box = driver.findElement(By.id("hot-spot"));
		Actions actions = new Actions(driver);
		actions.contextClick(box).perform();
	}
	
	@Test (priority = 2)
	public void alertHandle() {
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert text: " + alertText);
		driver.switchTo().alert().accept();
	}

}
