package amazonPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSignInPage {

	public WebDriver driver;
	public AmazonSignInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By emailId = By.xpath("//input[@type='email']");
	By continueBtn = By.xpath("//input[@id='continue']");
	By password = By.xpath("//input[@id='ap_password']");
	By logInBtn = By.xpath("//input[@id='signInSubmit']");
	
	
	public WebElement getEmailId()
	{
		return driver.findElement(emailId);
	}
	
	public WebElement clickContinueBtn()
	{
		return driver.findElement(continueBtn);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	
	public WebElement clickLogInBtn()
	{
		return driver.findElement(logInBtn);
	}
}
