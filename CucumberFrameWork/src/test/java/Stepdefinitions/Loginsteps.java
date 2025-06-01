package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	
	 @Given("I am on the login page")
	    public void i_am_on_the_login_page() {
	        // Code to navigate to the login page
	        System.out.println("Navigated to login page");
	    }

	    @When("I enter valid username and password")
	    public void i_enter_valid_username_and_password() {
	        // Code to enter valid username and password
	        System.out.println("Entered valid username and password");
	    }

	    @When("I enter invalid username and password")
	    public void i_enter_invalid_username_and_password() {
	        // Code to enter invalid username and password
	        System.out.println("Entered invalid username and password");
	    }

	    @When("I click on the login button")
	    public void i_click_on_the_login_button() {
	        // Code to click the login button
	        System.out.println("Clicked on the login button");
	    }

	    @Then("I should see the homepage")
	    public void i_should_see_the_homepage() {
	        // Code to verify the homepage is displayed
	        System.out.println("Navigated to the homepage");
	    }

	    @Then("I should see an error message")
	    public void i_should_see_an_error_message() {
	        // Code to verify the error message is displayed
	        System.out.println("Displayed error message");
	    }

}
