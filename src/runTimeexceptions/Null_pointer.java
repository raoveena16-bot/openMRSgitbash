package runTimeexceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Null_pointer {
	static WebDriver driver;
	public static void main (String[] args) {
		   //driver = new ChromeDriver();
		   driver.get("https://www.amazon.com/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite'] ")).click();
		   System.out.println("Test passed");
		   
		   
		}
		}

