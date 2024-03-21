package cucum.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import Utility.dataReaderforExcel;
import baseClass.excelBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;

public class StepDefinitionforExcel extends excelBase{
	
	WebDriver driver;
	loginPage logginIn = new loginPage(driver);
	
	@When("User opens the application")
	
	public void user_opens_the_application() throws IOException {
		loginPage app = launch_Application();		    
	}

	
	@When("Enter email and {string} from {string}")
	public void enter_email_and_from(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		dataReaderforExcel excelReader = new dataReaderforExcel();
		List<Map<String,String>> LoginData= 
				excelReader.getData(ReadConfig.EXCEL, sheetName);

			

	String Username= LoginData.get(rowNumber).get("Username");
	String Password= LoginData.get(rowNumber).get("Password");


	loginPage loginPage = new loginPage(driver);
	loginPage.setuser(Username);
	loginPage.setpassword(Password);
	loginPage.clickloginbtn();	
	   
	}

	@Then("user is able to login")
	public void user_is_able_to_login() {
	   
	}




}
