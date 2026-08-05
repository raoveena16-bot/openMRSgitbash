package testpackage;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
	
	public static void main(String []args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement( By.xpath("//a[normalize-space()='SEO']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Page-1']")).click();
	
	
	
	

}
}
