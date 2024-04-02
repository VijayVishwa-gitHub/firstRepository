package cucum.stepDefinition;

import org.openqa.selenium.WebDriver;

public class check {
	WebDriver driver;
	public check(WebDriver driver) {
		this.driver=driver;
	}

	public void getURL() {
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
	}
}
