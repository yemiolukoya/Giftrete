package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateAccountPage;
import pages.RegisterPage;
import util.TestBase;

public class CreateAccountStep extends TestBase{
	
	@Given("^user navigate to giftrete website$")
	public void user_navigate_to_giftrete_website() throws Throwable {
	   TestBase.initialization();
	   
	}

	@Given("^the user click on the create an account tab$")
	public void the_user_click_on_the_create_an_account_tab() throws Throwable {
		createAccountPage = new CreateAccountPage();
		createAccountPage.ClickCreateAccount();
	    
	}

	@Given("^the user fillin the register page$")
	public void the_user_fillin_the_register_page() throws Throwable {
		registerPage = new RegisterPage();
		registerPage.EnterFirstName();
		registerPage.EnterLastName();
		registerPage.EnterEmail();
		registerPage.EnterPhone();
		registerPage.EnterPassword();
		registerPage.EnterConfirmPassword();
		
		
	    
	}

	@When("^the user click register tab$")
	public void the_user_click_register_tab() throws Throwable {
		registerPage.ClickRegisteredBtn();

	    
	}

	@Then("^Account Activation By Code page should be displayed$")
	public void account_Activation_By_Code_page_should_be_displayed() throws Throwable {
	    
	}



}
