package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case3 {
	WebDriver driver;
	
	@Test
	
	public void minEnrollment() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().window().maximize();
		
	driver.findElement(By.id("enrollDropdown")).click();
	driver.findElement(By.xpath("//ul[@role='listbox']/li[text()='10,000+']")).click();
	
		
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='courses_table']/tbody/tr"));
	
	

	for (WebElement row : rows) {
	    if (row.isDisplayed()) {

	        // Get ONLY the enrollment cell (td[5] in your table)
	        WebElement enrollCell = row.findElement(By.xpath("./td[5]"));
	        String enrollText = enrollCell.getText().trim();

	        System.out.println("Visible Enrollment: " + enrollText);

	        // Remove commas (e.g., "1,234,567")
	        enrollText = enrollText.replace(",", "");

	        // Validate numeric only
	        if (!enrollText.matches("\\d+")) {
	            Assert.fail("Invalid enrollment value: " + enrollText);
	        }

	        // Convert to integer
	        int enroll = Integer.parseInt(enrollText);

	        // Validate minimum enrollment
	        if (enroll < 10000) {
	            Assert.fail("FAIL: Enrollment " + enroll + " is less than 10,000");
	        }
	    }
	}


}
}
	
