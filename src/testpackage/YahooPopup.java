package testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class YahooPopup {
public static void main(String[] args) {
// Create a map to store preferences
Map<String, Object> prefs = new HashMap<String, Object>();

// Pass 1 to ALLOW, 2 to BLOCK, 0 to keep DEFAULT
prefs.put("profile.default_content_setting_values.notifications", 2);

ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("prefs", prefs);

// Optional: Simplified argument to block them entirely
// options.addArguments("--disable-notifications");

WebDriver driver = new ChromeDriver(options);
driver.get("https://yahoo.com");
}
}



