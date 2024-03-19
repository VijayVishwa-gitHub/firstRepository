package seleniumCucumber;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class App 
{
	WebDriver driver;
	@Test(priority=1)
	public void initializingEdgeDriver() {
		System.setProperty("driver.edge.driver","C:\\Users\\admin\\Downloads\\Selenium\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
	@AfterTest
	public void closingBrowser() {
		driver.quit();
	}
	
}

