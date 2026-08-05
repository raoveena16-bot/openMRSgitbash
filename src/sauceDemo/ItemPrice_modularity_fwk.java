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

public class ItemPrice_modularity_fwk {
	WebDriver driver;
	public String baseUrl = "https://www.saucedemo.com/";
	List<Double> Expectedprices = new ArrayList<>();
	List<Double> Actualprices = new ArrayList<>();
	
	@Test
		
		public void validateSortItemPrice() {
		launchApp();
		login( );
		FetchAllPrice( );
		FetchActualPrice();
		Assert();
	}
	
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		}

		public void login( ) {

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		}

		public List<Double> FetchAllPrice( ) {
			List<WebElement> Price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
			//List<Double> prices = new ArrayList<>();

			for (WebElement element : Price) {
			    String priceText = element.getText().replace("$", "");
			    double priceValue = Double.parseDouble(priceText);
			    Expectedprices.add(priceValue);
			}

			Collections.sort(Expectedprices);
			System.out.println("Sorted Expected Prices" + Expectedprices);
			return Expectedprices;
		 }

			public List<Double> FetchActualPrice() {
		 
			
		   WebElement ActualPrice = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
			Select AscendingPrice = new Select(ActualPrice);
			AscendingPrice.selectByVisibleText("Price (low to high)");
			
			 List<WebElement> Price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
			
			 //List<Double> Actualprices = new ArrayList<>();
		 
			 for (WebElement element : Price) {
			    String priceText = element.getText().replace("$", "").trim();
			    double priceValue = Double.parseDouble(priceText);
			    Actualprices.add(priceValue);
			}	

			Collections.sort(Actualprices);
			System.out.println("Sorted Actual Prices" + Actualprices);
			return Actualprices;
			}
			
			public void Assert() {
			
			Assert.assertEquals(Actualprices, Expectedprices); 
			System.out.println("Test Passed");
			}

}


