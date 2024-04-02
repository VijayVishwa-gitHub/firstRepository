package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucum.stepDefinition.check;
import cucum.stepDefinition.steps;

public class excelBase {
	
	public static WebDriver driver;
	
	public WebDriver initializeBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fil = new FileInputStream("C:\\Users\\Vijay\\Documents\\GitHub\\selenium.cucumber\\src\\main\\java\\seleniumCucumber\\global.properties");
		prop.load(fil);
		String name = prop.getProperty("browser");
		
		
		if(name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Downloads\\Selenium Grid\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
		}
		else if(name.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.msedge.driver", "C:\\Users\\Vijay\\Downloads\\Selenium Grid\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
		return driver;
	
	}
	public WebDriver launch_Application() throws IOException {
	
		driver = initializeBrowser();
		check a = new check(driver);
		a.getURL();
		return driver;
		
		
		
	}
	

}
