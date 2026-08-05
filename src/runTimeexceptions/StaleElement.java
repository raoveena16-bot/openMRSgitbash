package runTimeexceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StaleElement {
	public static void main(String []args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Duration d = Duration.ofSeconds(10);
		WebDriverWait wait = new WebDriverWait(driver,d);
		WebElement resetWE = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetFilters")));
		resetWE.click();


		
		
		System.out.println("Reset button becomes visible");
		
		
		
		
}
}
