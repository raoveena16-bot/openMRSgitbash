package testpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropdown {
	public static void main (String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = ("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select drpContinent = new Select(driver.findElement(By.xpath("//select[@class=\"input-xlarge\"][1]")));
		drpContinent.selectByVisibleText("Africa");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		
		
	}
	

}
