package testpackage;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.*;

public class RadioButton {
	public static void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html#google_vignette");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='profession-0']"));
		//WebElement radio2 = driver.findElement(By.id("profession-1"));
		
		radio1.click();
		System.out.println("Radio Button 1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//radio2.click();
		//System.out.println("Radio Button 2");
		
	}

}
