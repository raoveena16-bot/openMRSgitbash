package demoTestng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class w3schools {
	
	String baseurl = "https://www.w3schools.com/";
	WebDriver driver;
	String expected = null;
	String actual = null;
	
	@BeforeTest
	public void LaunchBrowser() {
	driver = new ChromeDriver();
	driver.get(baseurl);
	System.out.println("Lanching the browser");
	}
	
	@BeforeMethod
	public void verifyHomepageTitle() {
		String expectedTitle = "W3Schools Online Web Tutorials";
		String actualTitle = driver.getTitle();
		System.out.println("The title of the page is: " + actualTitle);
		assertEquals(actualTitle, expectedTitle);
	}
		
		
	@Test(priority = 0)
	public void JavaTab() {
		driver.findElement(By.xpath("(//a[normalize-space()='JAVA'])[1]")).click();
		String expectedTitle = "Java Tutorial";
		String actualTitle = driver.getTitle();
		System.out.println("The title of the page is: " + actualTitle);
		assertEquals(actualTitle, expectedTitle);
	}
		
		@Test(priority = 1)
		public void scrollDown() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
		
		@AfterMethod
		public void goBackToHomepage() {
			driver.findElement(By.xpath("//i[@class='fa fa-logo ws-hover-text-green']")).click();
		}
		
		//@AfterTest
		//public void terminateBrowser() {
			//driver.close();
		//}
	
		
	}
	
	
	
	
	
	
	


