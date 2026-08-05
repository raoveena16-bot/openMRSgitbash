package axes_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public static void main(String []args) {
		
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
		Select option = new Select(driver.findElement(By.id("dropdown")));
	option.selectByVisibleText("Option 2");
	System.out.println("Second option is selected");
	
	
	
	}

}
