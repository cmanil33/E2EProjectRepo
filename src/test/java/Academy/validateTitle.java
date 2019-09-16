package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialzed");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
		System.out.println("B");
	}
	
	@Test
	public void basePageNavigation() throws IOException {
		LandingPage lp = new LandingPage(driver);
		String actualTitle = lp.getTitle().getText();
		Assert.assertEquals(actualTitle, "FEATURED COURSES");
		log.info("done validating text msg");
		boolean contactResult = lp.getContact().isDisplayed();
		Assert.assertTrue(contactResult);
		log.info("Contact is displayed");
		System.out.println("done validating");
	}
	
	@Test
	public void sample() {
		LandingPage lp = new LandingPage(driver);
		System.out.println(lp.getTitle().getText());
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("A");
		driver.close();
		driver=null;
		
	}

}
