package priceProduct_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff_CompanyNamePrice {
	WebDriver driver;
	
	@Test
	
	public void getStockNamePrice() {
		launchApp();
		fetchAllStockName();
		fetchAllCurrentPrice();
		mapStockNamePrice();
	}
	
	public void launchApp() {
		driver =new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
	}
	
	public List<WebElement> fetchAllStockName() {
		 List<WebElement> CompanyName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		return CompanyName;
		
	}
   public List<WebElement> fetchAllCurrentPrice() {
	   List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	   return CurrentPrice;
   }
   
   
   public Map<String, Double> mapStockNamePrice() {
	   List<WebElement> StockName = fetchAllStockName();
	   List<WebElement> CurrentPrice = fetchAllCurrentPrice();
	   
	   Map<String, Double> StockNamePrice = new HashMap <String, Double>();
	   for (int i =0;i<StockName.size();i++) {
		   StockNamePrice.put(StockName.get(i).getText(), Double.valueOf(CurrentPrice.get(i).getText().replace(",","")));
		   
		   
		   System.out.println(StockName.get(i).getText() +"----"+ CurrentPrice.get(i).getText());
	   }
	   return StockNamePrice;
   }
}
