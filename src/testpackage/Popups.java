package testpackage;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popups {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//a[normalize-space()='Bank Project']")).click();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("abc@gmail");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		String alertMessage= driver.switchTo().alert().getText();		
		
        System.out.println(alertMessage);

		
		driver.switchTo().alert().accept();

		
		
	}
	
		
	}


