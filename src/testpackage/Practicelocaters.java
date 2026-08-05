	package testpackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practicelocaters {
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
		String baseUrl = "https://www.demo.guru99.com/";
		driver.get(baseUrl);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//driver.findElement(By.linkText("Big Spring Sale")).click();
driver.findElement(By.xpath("//input[@name='btnLogin']")).click();



}
}

	