package seleniumCucumber;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class App 
{
	WebDriver driver;
	@Test
	public void initializingEdgeDriver() {
		System.setProperty("driver.edge.driver","C:\\Users\\admin\\Downloads\\Selenium\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://support.atlassian.com/bitbucket-cloud/docs/git-and-mercurial-commands/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
	@AfterTest
	public void closingBrowser() {
		driver.quit();
	}
	
}

