package amazonStepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import resources.base;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import amazonPageObjects.AmazonBuyPage;
import amazonPageObjects.AmazonHomePage;
import amazonPageObjects.AmazonSignInPage;

@RunWith(Cucumber.class)
public class AmazonFeatureMethods extends base {

	@Given("^Initialize the browser with Chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver=initializeDriver();
	}

	@When("^User enter (.+) and click on continue button$")
	public void user_enter_and_click_on_continue_button(String emailidormobileno) throws Throwable {
		try {
			AmazonSignInPage asp = new AmazonSignInPage(driver);
			asp.getEmailId().sendKeys(emailidormobileno);
			asp.clickContinueBtn().click();
			System.out.println("Info ==>  mobileNo Entered");
		}catch(Exception e) {
			System.out.println("Error ==> Invalid username");

		}

	}

	@Then("^verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		try {
			AmazonHomePage ahp = new AmazonHomePage(driver);
			String welcomeTxt = ahp.getUserName().getText();
			//System.out.println(welcomeTxt);
			Assert.assertEquals("Hello, anil", welcomeTxt);
			System.out.println("Info ==>  successfully loggedin");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ==> unsuccessfull");
		}

	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@And("^Enter (.+) and click on Login button$")
	public void enter_and_click_on_login_button(String password) throws Throwable {
		try {
			AmazonSignInPage asp = new AmazonSignInPage(driver);
			asp.getPassword().sendKeys(password);
			asp.clickLogInBtn().click();
			System.out.println("Info ==>  password entered");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ==> Invalid credentials");
		}

	}



	@Then("^Select the 'book' from the category dropdown$")
	public void select_the_book_from_the_category_dropdown() throws Throwable {
		try {
			AmazonHomePage ahp = new AmazonHomePage(driver);
			WebElement e = ahp.clickCategoryDropdown();
			Select s1=new Select(e);
			s1.selectByValue("search-alias=stripbooks");	
			System.out.println("Info ==>  successfully clicked the book");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ==> unsuccessfull at Category dropdown");
		}
	}

	@Then("^Get the bookname Author and price details and remove the book from the cart$")
	public void get_the_bookname_author_and_price_details_and_remove_the_book_from_the_cart() throws Throwable {
		try {
			AmazonBuyPage abp = new AmazonBuyPage(driver);
			abp.ClickCartIcon().click();
			String authorName = abp.getAuthor().getText();
			String price = abp.getPrice().getText();
			abp.removeFromCart().click();
			System.out.println("Info ==> succesful in adding to cart"+authorName+" "+price);

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ==> unsuccesful in getting the values from the cart");
		}

	}



	@And("^enter (.+) and validate the 'book name' on the top pane then click on search button$")
	public void enter_and_validate_the_book_name_on_the_top_pane_then_click_on_search_button(String bookname) throws Throwable {
		try {
			AmazonHomePage ahp = new AmazonHomePage(driver);
			ahp.clickSearchTextBox().sendKeys(bookname);
			ahp.clickSubmitBtn().click();
			String actualTopPaneText = ahp.getTopPaneText().getText();
			Assert.assertEquals("\"selenium webdriver rajeev gupta\"", actualTopPaneText);
			System.out.println("Info ==>  successfully searched the book"+actualTopPaneText);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ==> unsuccessfull searched the book");
		}
	}

	@And("^Click first book link and add to cart$")
	public void click_first_book_link_and_add_to_cart() throws Throwable {
		try {
			AmazonHomePage ahp = new AmazonHomePage(driver);
			ahp.clickFirstBookLink().click();
			for (String tab : driver.getWindowHandles()) {	 
				if (tab.contains("Buy Selenium WebDriver")) {
					AmazonBuyPage abp = new AmazonBuyPage(driver);
					driver.switchTo().window(tab);
					abp.ClickAddToCartBtn().click();
					String cartText = abp.ValidateAddedToCartText().getText();
					cartText = cartText.trim();
					Assert.assertEquals("Added to Cart", cartText);

				}

			}
			System.out.println("Info ==> succesful in adding to cart");

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ==> unsuccesful in adding to cart");
		}
	}

	@And("^Validate if the cart is empty$")
	public void validate_if_the_cart_is_empty() throws Throwable {
		try {
			AmazonBuyPage abp = new AmazonBuyPage(driver);
			String cartEmptytext= abp.ValidatecartEmpty().getText();
			System.out.println("Info ==> successful in removing the order"+cartEmptytext);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error ==> unsuccessful in removing the order");
		}
			
	}



	@And("^close the browsers$")
	public void close_the_browsers() throws Throwable {
		driver.quit();
	}

}