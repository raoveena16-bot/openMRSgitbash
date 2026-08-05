package axes_locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Authentication {
	WebDriver driver;
	
	
@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	}
	


@Test
public void alertInput() {
    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    //driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]"));
    Assert.assertTrue(driver.getPageSource().contains("Congratulations! You must have the proper credentials."));
    System.out.println("Authentication successful");

}

	
}


		
		
		
		



