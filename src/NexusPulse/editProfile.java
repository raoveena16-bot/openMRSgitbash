package NexusPulse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class editProfile {
	WebDriver driver;
	
	@Test

	public void Profile() {
		driver = new ChromeDriver();
		
		launchApp();
		login();
		profileTab();
		submit();
		
	}
	
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("http://82.197.92.72:8080/patient/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void login() {
		driver.findElement(By.name("username")).sendKeys("patient1");
		driver.findElement(By.name("password")).sendKeys("Mmp@2025!Patient#93");
		driver.findElement(By.xpath("//button[@class='btn-primary']")).click();
	}
	
	public void profileTab() {
		
		driver.findElement(By.xpath("//a[@href='/patient/profile']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='firstName']")).clear();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Bob");
		
        driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("David");
		
        driver.findElement(By.xpath("//input[@id='phone']")).clear();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("4444444444");

		}
	
	public void submit() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String alertText = driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
	}
	

}
