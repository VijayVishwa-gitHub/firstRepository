package cucum.stepDefinition;

import org.openqa.selenium.WebDriver;

import baseClass.excelBase;

public class check extends excelBase {
	WebDriver driver;
	public check(WebDriver driver) {
		this.driver=driver;
	}

	

	public WebDriver getURL() {
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		return driver;
	}
}
//this worked after 3hours