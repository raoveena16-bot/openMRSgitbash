package testpackage;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class WindowHandle_Demo {				

    public static void main(String[] args) throws InterruptedException {									
        	WebDriver driver=new ChromeDriver();			
        		
        	 driver.get("https://demo.guru99.com/popup.php");
             driver.manage().window().maximize();

             driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

             String mainWindow = driver.getWindowHandle();

             // Capture every open window handle
             Set<String> allWindows = driver.getWindowHandles();
             Iterator<String> iterator = allWindows.iterator();

             while (iterator.hasNext()) {
                 String childWindow = iterator.next();

                 if (!mainWindow.equalsIgnoreCase(childWindow)) {
                     // Switch to the child window
                     driver.switchTo().window(childWindow);
                     driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                     driver.findElement(By.name("btnLogin")).click();

                     // Close the child window
                     driver.close();
                 }
             }
             // Return focus to the main window
             driver.switchTo().window(mainWindow);
             driver.quit();
         }
     }