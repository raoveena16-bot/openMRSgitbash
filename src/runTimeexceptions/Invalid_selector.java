package runTimeexceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_selector {
	
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//String Text = driver.findElement(By.xpath("//a[@aria-label='Amazon']")).getText();
		//InvalidSelectorException: Compound class names not permitted
		String logoText = driver.findElement(By.className("nav-sprite nav-logo-base")).getText();
		System.out.println("logoText");
		
		
		

		
	
	}

}
