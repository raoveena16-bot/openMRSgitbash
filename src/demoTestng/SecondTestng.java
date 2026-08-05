package demoTestng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.*;

public class SecondTestng {
	
	public String baseUrl = "https://www.techlistic.com/p/selenium-practice-form.html#google_vignette";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("launchind chrome browser");
   //System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
	driver = new ChromeDriver();
		driver.get(baseUrl);
	}

@Test
public void WebElement () {
	driver.findElements(By.className("nav-drop-title-wrap"));
	System.out.println("Number of elements");
}
	
	
	@AfterTest
	public void terminateBrowser() {
driver.close();
}
}
	


