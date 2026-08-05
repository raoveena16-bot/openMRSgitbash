package runTimeexceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoframeException {
	
	public static void main(String args[]) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		Integer size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
	    //driver.switchTo().frame("google_ads_top_frame");
	    driver.switchTo().frame("google frame");

		System.out.println("Switching the frame");
		driver.findElement(By.xpath("//iframe[@id='google_ads_top_frame']")).click();
		System.out.println("Clicked on the frame");
		
    }
		
		;
		
	}


