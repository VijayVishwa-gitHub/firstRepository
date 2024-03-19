package cucum.stepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	
	@Given("the user is on eCommerce Login page")
	public void the_user_is_on_e_commerce_login_page() {
	    driver = new EdgeDriver();
	    driver.get("https://rahulshettyacademy.com/client");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	   
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

	private void quitBrowser() {
		// TODO Auto-generated method stub
		
	}
	


}
