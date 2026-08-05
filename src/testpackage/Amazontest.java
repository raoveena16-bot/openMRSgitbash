package testpackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Amazontest {
 public static void main (String[] args) {
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.amazon.com/");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite'] ")).click();
   System.out.println("Test passed");
   
   
}
}