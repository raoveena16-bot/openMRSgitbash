package runTimeexceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		//NoSuchElementException
		String Value = driver.findElement(By.id("twotabsearchtextbox")).getText();
		System.out.println(Value);
		
	}
}
