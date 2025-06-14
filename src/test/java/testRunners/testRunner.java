package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"./featureFile/practiceFeature.feature"}, tags = "@tag2",
                               glue={"seleniumCucumber"}, plugin = "html:target/test-output/report.html",
dryRun = false, monochrome = true, publish = false)
 

public class testRunner {
	
//Checking GitHub
}
