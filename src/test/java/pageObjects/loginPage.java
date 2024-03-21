package pageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;


public class loginPage {
	
	

	
	  public WebDriver driver;

		public loginPage(WebDriver driver) {

			this.driver=driver;

			PageFactory.initElements(driver, this);

		}

		

	    By user_name = By.id("userEmail");
		By pass_word= By.id("userPassword");
		By login = By.id("login");

		public void URL() {
			driver.get("https://rahulshettyacademy.com/client/auth/login");
			driver.manage().window().maximize();
		}

		public void setuser (String Username) {
			driver.findElement(user_name).sendKeys(Username);	
		}	

		public void setpassword (String Password) {
			driver.findElement(pass_word).sendKeys(Password);	
		}

		 public void clickloginbtn (){
			driver.findElement(login).click();

		}

	}




