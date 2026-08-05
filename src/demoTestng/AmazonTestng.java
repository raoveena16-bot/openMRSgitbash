package demoTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AmazonTestng {
	
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	@BeforeTest
	public void launchBrowser() {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

	
	@Test(priority = 0)
	public void Cart() {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-cart-text-container")).click();
		expected = "Cart";
		actual = driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		Assert.assertEquals(actual, expected);
		
	}
	
	
	
    
    public void terminateBrowser() {
	driver.close();
}
     }

