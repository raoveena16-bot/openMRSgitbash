package demoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Guru99.LoginPage;

public class TestPOM1 {
	
	@Test
	
	public void VerifyNewsletter() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/");
		
		LoginPage login = new LoginPage(driver);
		login.NewsLetterLogo();
	}

}
