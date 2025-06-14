package seleniumCucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	
	@Before
	public void runningBeforeHook() {
		System.out.println("Before Hook");
	}
	@Before(order =1)
	public void runningBeforeHookWithOrder() {
		System.out.println("Order 1 Before Hook");
	}
	
	@After
	public void runningAfterHook() {
		System.out.println("After Hook");
	}
	@After(order=2, value = "@tag2")
	public void runningAfterHookWithOrderAndValue() {
		System.out.println("Order 2 After Hook. Value given as tag2");
	}
	@After(order=2)
	public void runningAfterHookWithOrder() {
		System.out.println("Order 2 After Hook");
	}
	
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Given of tag1");
	}

	@And("some other precondition")
	public void some_other_precondition() {
		System.out.println("And of tag1");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("when statement of tag1");
	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with_name1(String name) {
		System.out.println("Printing name: " +name);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_int1_in_step(Integer values) {
		System.out.println("Printing value: " +values);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_status_in_step(String status) {
		System.out.println("Printing status: " +status);
	}
	@Given("There are multiple tags available")
	public void there_are_multiple_tags_available() {
	    System.out.println("Running Multiple Tags: tag1");
	}

	@Then("Print statetment will be executed")
	public void print_statetment_will_be_executed() {
		 System.out.println("Running Multiple Tags: tag2");
	}






}
