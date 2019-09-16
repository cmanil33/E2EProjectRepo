package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions_login extends base {
	
	@Given("^Initialize the browser with Chrome$")
	public void initialize_the_browser_with_Chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on login lin in home page to land on secure sign in page$")
	public void click_on_login_lin_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage lp = new LandingPage(driver);
		if(lp.getPopupSize()>0) {
			lp.getPopup().click();
		}
		lp.getLogIn().click();
	}
	 @When("^User enter (.+) and (.+) and logs in$")
	    public void user_enter_and_and_logs_in(String username, String password) throws Throwable {
		 LoginPage lo = new LoginPage(driver);
			lo.getEmail().sendKeys(username);
			lo.getPassword().sendKeys(password);
			lo.getLogin().click();
	    }
//	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
//	public void user_enter_and_and_logs_in(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		LoginPage lo = new LoginPage(driver);
//		lo.getEmail().sendKeys(arg1);
//		lo.getPassword().sendKeys(arg2);
//		lo.getLogin().click();
//	}

	@Then("^verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PortalHomePage p = new PortalHomePage(driver);
	    Assert.assertTrue(p.getSearchBox().isDisplayed());
	}


    @And("^close the browsers$")
    public void close_the_browsers() throws Throwable {
        driver.close();
    }

}
