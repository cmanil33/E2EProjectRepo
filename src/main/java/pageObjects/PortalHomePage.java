package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {

	public WebDriver driver;
	public PortalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By searchBox = By.name("query");
	
	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
	
}
