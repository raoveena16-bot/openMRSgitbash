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

public class Item_Price_DataDriven_Fwk {
	WebDriver driver;
	Item_Price_DataDriven_Fwk page;
		
		@Test (description = "Sauce demo - Sort by price (Low to High)")
		
	        public void validateSortItemPrice_LowToHigh(String lohi){
			
			Item_Price_DataDriven_Fwk page = new Item_Price_DataDriven_Fwk();
			page.launchApp("https://www.saucedemo.com/");
			page.login("standard_user", "secret_sauce" );
			page.sortBy(lohi);
				
				List<Double> expected = page.getExpectedPrices();
		        List<Double> actual = page.getActualPrices(lohi);
		        Assert.assertEquals(actual, expected); 
		       }
		
	
		@Test (description = "Sauce demo - Sort by price (High to Low)")
		
		public void validateSortItemPrice_HightoLow(String hilo) {
			
			Item_Price_DataDriven_Fwk page = new Item_Price_DataDriven_Fwk();
			page.launchApp("https://www.saucedemo.com/");
				page.login("standard_user", "secret_sauce");
		          page.sortBy(hilo);
				List<Double> expected = page.getExpectedPrices();
		        List<Double> actual = page.getActualPrices(hilo);
		        Assert.assertEquals(actual, expected);                                                                    
				
				}
	
	public void launchApp(String url){
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void login(String username, String pswd) {
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pswd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	public void sortBy(String sortByOptions){
		//Fetching the Actual Values
		
		WebElement selectOptions = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select sortBySelect = new Select(selectOptions);
		sortBySelect.selectByVisibleText(sortByOptions);
	}


	 public List<Double> getExpectedPrices() {
	        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	        List<Double> ExpectedPrices = new ArrayList<>();

	        for (WebElement element : priceElements) {
	            String priceText = element.getText().replace("$", "").trim();
	            ExpectedPrices.add(Double.parseDouble(priceText));
	        }

	        Collections.sort(ExpectedPrices);
	        System.out.println("Expected Sorted Prices: " + ExpectedPrices);
	        return ExpectedPrices;
	    }
	
	 public List<Double> getActualPrices(String sortOption) {

	       WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
	        Select select = new Select(sortDropdown);
	       select.selectByVisibleText(sortOption);

	       List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	        List<Double> ActualPrices = new ArrayList<>();

	        for (WebElement element : priceElements) {
	            String priceText = element.getText().replace("$", "").trim();
	            ActualPrices.add(Double.parseDouble(priceText));
	        }

	        Collections.sort(ActualPrices);
	        System.out.println("Actual Sorted Prices: " + ActualPrices);
	        return ActualPrices;
	 }
	        
	        
	        
	 
}
	
	
	
	
	
	
	

	


