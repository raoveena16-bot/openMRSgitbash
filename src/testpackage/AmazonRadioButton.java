package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import org.openqa.selenium.WebElement;


public class AmazonRadioButton {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//div[contains(text(),'EN')]")).click();
	    WebElement radio1 = driver.findElement(By.xpath("//div[3]//div[1]//label[1]//i[1]"));
		radio1.click();
		System.out.println("Radio Button 1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
