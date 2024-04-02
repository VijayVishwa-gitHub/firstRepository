package cucum.stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.excelBase;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps extends excelBase{
	public static WebDriver driver;
	/*
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
	
	}*/


	
	

	@Given("the user is on eCommerce Login page")
	public void the_user_is_on_e_commerce_login_page() throws IOException {
		driver = launch_Application();
	//driver = initializeBrowser();
	//a.initializeBrowser();
	//driver = new ChromeDriver();
	//driver.get("https://rahulshettyacademy.com/client");
	//driver.manage().window().maximize();
	}
	    
	

	@When("the user enters valid credentials\\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_password(String username, String pwd) {
		driver.findElement(By.id("userEmail")).sendKeys(username);
		driver.findElement(By.id("userPassword")).sendKeys(pwd);
	    
	  
	}

	@When("the user clicks login button")
	public void the_user_clicks_login_button() {
		driver.findElement(By.id("login")).click();
	  
	}

	@Then("the user is taken to My Account page")
	public void the_user_is_taken_to_my_account_page() {
	    System.out.println(driver.getTitle());
	    
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(2));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[class='m-2 blink_me']")));
		System.out.println(driver.findElement(By.cssSelector("label[class='m-2 blink_me']")).getText());
	    boolean status=driver.findElement(By.cssSelector("label[class='m-2 blink_me']")).isDisplayed();
	    Assert.assertEquals(status, true);
	}
	
	@When("the user enter credentials {string} and {string}")
	public void the_user_enter_credentials_and(String string, String string2) {
		driver.findElement(By.id("userEmail")).sendKeys(string);
		driver.findElement(By.id("userPassword")).sendKeys(string2);
	}

	@Then("the login is failed")
	public void the_login_is_failed() {
	    boolean y = driver.findElement(By.cssSelector("label[class='m-2 blink_me']")).isDisplayed();
	    Assert.assertEquals(y, false);
	}

	@Then("user should see failed message")
	public void user_should_see_failed_message() {
	    WebDriverWait wa = new WebDriverWait(driver, Duration.ofSeconds(1));
	    wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='toast-container']")));
	    System.out.println(driver.findElement(By.xpath("//*[@id='toast-container']")).getText());
	}
	@After(order=1)
    public void addScreenshot(Scenario scenario) throws IOException {
        
    	// this is for cucumber junit report
        if(scenario.isFailed()) {
        	System.out.println("working");
        	 TakesScreenshot scrShot =((TakesScreenshot)driver);

                     File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

                     FileUtils.copyFile(SrcFile, new File("ss.png"));
        	            
        }
       
         
        
      
    }
	


}
