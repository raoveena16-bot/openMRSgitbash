package testpackage;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) { 
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    //String baseURL = "https://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Selecting Items in a Multiple SELECT elements
		//driver.get("http://jsbin.com/osebed/2");
		//Select fruits = new Select(driver.findElement(By.id("fruits")));
		//fruits.selectByVisibleText("Banana");
		//fruits.selectByIndex(1);
		
		

}
}
