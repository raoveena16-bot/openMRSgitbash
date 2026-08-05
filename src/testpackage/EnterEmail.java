package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class EnterEmail {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

}
}
