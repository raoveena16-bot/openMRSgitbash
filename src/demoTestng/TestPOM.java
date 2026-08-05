package demoTestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Guru99.LoginPage;

import org.openqa.selenium.WebDriver;

public class TestPOM {
	
	
	@Test
	
	public void VerifyEmail () {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/");
	
	LoginPage login = new LoginPage(driver);
	login.Email("abc@gmail.com");
	login.Click();
	
	}
    

}

