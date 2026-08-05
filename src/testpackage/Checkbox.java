package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	public static void main (String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		String baseURL = ("https://demo.guru99.com/test/facebook.html");
		driver.get(baseURL);
		WebElement ChkFb = driver.findElement(By.xpath("//input[@id='persist_box']"));
		//for(int i=0; i<2; i++) {
			ChkFb.click();
			System.out.println(ChkFb.isSelected());
		//}
		
		
	}

}
