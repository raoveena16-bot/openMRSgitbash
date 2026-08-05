package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.findElement(By.className("nav-drop-title-wrap")).click();
	}

	
}
