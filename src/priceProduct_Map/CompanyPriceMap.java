package priceProduct_Map;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CompanyPriceMap {
	WebDriver driver;
	
	@Test
	public void getStockNamePrice() {
		launchApp();
		fetchAllStockName();
		fetchAllCurrentPrice();
		mapStockNamePrice();
	}
	
	
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
	}
	
	public List<WebElement> fetchAllStockName() {
		List<WebElement> StockName = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		return StockName;
	}

	public List<WebElement> fetchAllCurrentPrice() {
		List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		return CurrentPrice;
	}
	
	public void mapStockNamePrice() {
		List<WebElement> StockName = fetchAllStockName();
		List<WebElement> CurrentPrice = fetchAllCurrentPrice();
		
		for (int i = 0; i < StockName.size(); i++) {
			System.out.println(StockName.get(i).getText() + "----" + CurrentPrice.get(i).getText());
		}
	}
}
