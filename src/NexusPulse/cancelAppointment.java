package NexusPulse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cancelAppointment {
	WebDriver driver;

	@Test
public void appCancel() {
    driver = new ChromeDriver();
	launchApp();
	login();
	cancel();
	getStatus();
	
	
}
	
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("http://82.197.92.72:8080/patient/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void login() {
		driver.findElement(By.name("username")).sendKeys("patient1");
		driver.findElement(By.name("password")).sendKeys("Mmp@2025!Patient#93");
		driver.findElement(By.xpath("//button[@class='btn-primary']")).click();
	}

public void cancel() {
	//driver.findElement(By.xpath("//table[@class='table-styled']/tbody/tr[24]/td[6]/form[1]")).click();
	driver.findElement(By.xpath("//table[@class='table-styled']/tbody/tr[24]/td[6]")).click();
}

public void getStatus() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String getStatus = driver.findElement(By.xpath("//table[@class='table-styled']/tbody/tr[23]/td[5]")).getText();
	System.out.println(getStatus);
}


}
