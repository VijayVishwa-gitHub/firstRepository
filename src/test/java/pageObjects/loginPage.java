package pageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;


public class loginPage {
	
	

	
	  public static WebDriver driver;

		public loginPage(WebDriver driver) {

			loginPage.driver=driver;

			PageFactory.initElements(driver, this);

		}

		

	    By user_name = By.id("userEmail");
		static By pass_word= By.id("userPassword");
		static By login = By.id("login");

		public void URL() {
			driver.get("https://rahulshettyacademy.com/client/dashboard/dash");
			driver.manage().window().maximize();
		}

		public void setuser (String Username) {
			driver.findElement(user_name).sendKeys(Username);	
		}	

		public static void setpassword (String Password) {
			driver.findElement(pass_word).sendKeys(Password);	
		}

		 public static void clickloginbtn (){
			driver.findElement(login).click();

		}

	}




