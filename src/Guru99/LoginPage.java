package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By Emailid= By.xpath("//input[@name='emailid']");
	By Submit = By.xpath("//input[@name='btnLogin']");
	By Newsletter = By.xpath("//body/p[@class='barone']/a[4]/img[1]");
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void Email(String id) {
		
		driver.findElement(Emailid).sendKeys(id);
		
		
	}
	
	public void Click() {
		
		driver.findElement(Submit).click();
		
		
	}
	
	
	public void NewsLetterLogo() {
		
		driver.findElement(Newsletter).click();
	}
	}



