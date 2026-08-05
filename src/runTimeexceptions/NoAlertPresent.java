package runTimeexceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAlertPresent {
WebDriver driver;
	@BeforeTest
	public void launchApp() {
		
		 driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
		@Test
		public void bankProject() {
		driver.findElement(By.xpath("//a[normalize-space()='Bank Project']")).click();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("abc@gmail");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz");
		//driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		String alertMessage= driver.switchTo().alert().getText();		
		
        System.out.println(alertMessage);

		
		driver.switchTo().alert().accept();


}

}
