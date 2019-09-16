package amazonPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

	public WebDriver driver;
	public AmazonHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By getUserNameText = By.xpath("//div[@id='nav-tools']/a[2]/span[1]");  
	//header/div/div[1]/div[2]/div/a[2]/span[1]
	By categoryDropdown = By.xpath("//*[@id='searchDropdownBox']");
	By searchTextBox = By.xpath("//input[@id='twotabsearchtextbox']");
	By submitBtn = By.xpath("//input[@type='submit'][@value='Go']");
	By topPaneText = By.xpath("//div[@id='search']/span/h1/div/div[1]/div/div/span[4]");
	By firstBookLink = By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");
	
	public WebElement getUserName()
	{
		return driver.findElement(getUserNameText);
	}

	public WebElement clickCategoryDropdown()
	{
		return driver.findElement(categoryDropdown);
	}

	public WebElement clickSearchTextBox()
	{
		return driver.findElement(searchTextBox);
	}
	
	public WebElement clickSubmitBtn()
	{
		return driver.findElement(submitBtn);
	}
	
	public WebElement getTopPaneText()
	{
		return driver.findElement(topPaneText);
	}
	
	public WebElement clickFirstBookLink()
	{
		return driver.findElement(firstBookLink);
	}
	
	
	
	
	
	
}
