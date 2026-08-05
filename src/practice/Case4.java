package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case4 {

	WebDriver driver;
	
	@Test
	
	public void combinedFilter() {
		
		appLaunch();
		selectLanguage();
		uncheckLevel();
		minEnroll();
		validatePythonAndEnrollment();
		
	}
		
	public void appLaunch() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-table/");
		driver.manage().window().maximize();
		}
	
	public void selectLanguage() {
		WebElement radioButton = driver.findElement(By.xpath("//label[contains(text(),' Python')]"));
		radioButton.click();
		System.out.println("Python is selected");
		}
		
	public void uncheckLevel() {
		driver.findElement(By.xpath("//label[text()=' Intermediate']")).click();
		driver.findElement(By.xpath("//label[text()=' Advanced']")).click();
		System.out.println("Intermediate and Advanced are Unchecked ");
	}
		
	
	public void minEnroll() {
		driver.findElement(By.id("enrollDropdown")).click();
		driver.findElement(By.xpath("//ul[@role='listbox']/li[text()='10,000+']")).click();
		System.out.println("Minimum Enrollment '10,000+' is selected");
	}
		
	public void validatePythonAndEnrollment() {
		WebElement python = driver.findElement(By.xpath("//table[@id='courses_table']/tbody/tr[1]/td[3]"));
		
		if (!python.getText().equals("Python")) {
			Assert.fail("FAIL: The row does not contain Python");
		}
		else {
			System.out.println("The row contains Python");
		}
		
		WebElement cell = driver.findElement(By.xpath("//table[@id='courses_table']/tbody/tr[1]/td[5]"));
		String enrollText = cell.getText().trim();

       
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
        else {
			System.out.println("Enrollment is greater than 10,000");
		}
	}
		
	}

