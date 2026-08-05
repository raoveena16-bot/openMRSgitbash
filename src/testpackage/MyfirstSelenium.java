package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyfirstSelenium {


	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
		
		//String baseUrl = "https://www.amazon.com/";
        driver.get("https://www.amazon.com/"); 

		String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = "";
        //driver.get("https://www.amazon.com/"); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        
        //driver.close();


        actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
        } else {
        System.out.println("Test Failed");
        }
        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
        
        driver.close();
        }
}

	




