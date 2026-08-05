package demoTestng;

import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Yahoo {
	
	public String baseURL = "https://www.yahoo.com/";
	
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching the browser");
		Map<String, Object> prefs = new HashMap<String, Object>();

		// Pass 1 to ALLOW, 2 to BLOCK, 0 to keep DEFAULT
		prefs.put("profile.default_content_setting_values.notifications", 2);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		// Optional: Simplified argument to block them entirely
		// options.addArguments("--disable-notifications");

		//WebDriver driver = new ChromeDriver(options);
		//driver.get("https://yahoo.com");
		driver = new ChromeDriver();
		driver.get(baseURL);
	}
	
	@BeforeMethod
	public void verifyHomepageTitle() {
		String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 0)
	
	public void SignIn() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.linkText("Sign in")).click();
		String expectedTitle = "Login - Sign in to Yahoo";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

		
	}
	@Test(priority = 1)
	 
	 public void Createaccount() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 driver.findElement(By.linkText("Create an account")).click();
		 String expectedTitle = "Create an account";
		 String actualTitle = driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
	 }

//@AfterMethod
//public void goBackToHomepage() {
      //driver.findElement(By.linkText("Home")).click() ;
}


	
	
	


