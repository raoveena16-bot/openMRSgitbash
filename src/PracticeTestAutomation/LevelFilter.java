package PracticeTestAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LevelFilter {
       public static void main(String[] args) {
    	   WebDriver driver = new ChromeDriver();
    	   driver.get("https://practicetestautomation.com/practice-test-table/");
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	   driver.findElement(By.xpath("//input[@value='Intermediate']")).click();
    	   driver.findElement(By.xpath("//input[@value='Advanced']")).click();
    	   
    	   List<WebElement> Level = driver.findElements(By.xpath("//th[@id='col_level']"));
    	   
    	   for (WebElement column : Level) {
    		   Assert.assertEquals(column.getText(), "Beginner");
    		   
    		   System.out.println("Test passed");    	   
    		   
    	   }
    	  
    			   

       }
}

