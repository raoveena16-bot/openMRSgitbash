package testpackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElements {

		public static void main(String[] args) {

		    System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.guru99.com/");
		    //List<WebElement> elements = driver.findElements(By.name("name"));
		    List<WebElement> elements = driver.findElements(By.className("nav-drop-title-wrap"));
		    System.out.println("Number of elements:" +elements.size());

		    for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
		    }


}
}
