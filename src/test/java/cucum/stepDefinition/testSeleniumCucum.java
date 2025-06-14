package cucum.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import baseClass.excelBase;
	
public class testSeleniumCucum {
	public static void main(String[] args) throws IOException {
		excelBase base = new excelBase();
		WebDriver driver = base.launch_Application();
		driver.quit();
		 
		
	
		

	}

}
