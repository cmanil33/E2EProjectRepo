package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class homePage extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
	}
	
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String userName,String password,String text ) throws IOException {
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getLogIn().click();

		LoginPage lo = new LoginPage(driver);
		lo.getEmail().sendKeys(userName);
		lo.getPassword().sendKeys(password);
		System.out.println(text);
		log.info(text);
		lo.getLogin().click();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		
		data[0][0] = "NonRestrictedUser@qw.com";
		data[0][1] = "123456";
		data[0][2] = "Restricted User";
		
		data[1][0] = "RestrictedUser@qw.com";
		data[1][1] = "123456";
		data[1][2] = "Non Restricted User";
		
		return data;
		
		
	}

}
