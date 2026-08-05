package sauceDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortPrice {
	
	WebDriver driver;
	List<Double> Expectedprices = new ArrayList<>();
	List<Double> Actualprices = new ArrayList<>();
	
	@Test
	public void sortPrice() {
		launchApp();
		login();
		expectedfetchPrice();
		actualfetchPrice();
		assertPrice();
	}
	
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	public void login() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}
	
	public void expectedfetchPrice() {
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		for (WebElement element : price) {
			String priceText = element.getText().replace("$", "0");
			double priceValue = Double.parseDouble(priceText);	
			Expectedprices.add(priceValue);
			
	
		Collections.sort(Expectedprices);
		System.out.println("Sorted Expected Prices" + Expectedprices);
		}
	}
		
		public void actualfetchPrice() {
			WebElement ActualPrice = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
			Select select = new Select(ActualPrice);
			select.selectByVisibleText("Price (low to high)");
			
			List<WebElement> price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
			
			for (WebElement element : price) {
				String priceText = element.getText().replace("$", "");
				double priceValue = Double.parseDouble(priceText);	
				Actualprices.add(priceValue);
				
		
			Collections.sort(Actualprices);
			System.out.println("Sorted Actual Prices" + Actualprices);
			}
		}
			
			public void assertPrice() {
				Assert.assertEquals(Expectedprices, Actualprices);
				System.out.println("Expected and Actual Prices are same");
			}
}
