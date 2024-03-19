package seleniumCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = {".//featureFile/cucum.feature"},
                               glue="cucum.stepDefinition",
dryRun = false)
public class testRunner {
	
//Checking GitHub
}
