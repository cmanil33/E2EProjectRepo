package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("//div/div/h2");
	By contact = By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[8]/a");
	By popup = By.xpath("//button[text()='NO THANKS']");
	
	
	public WebElement getLogIn()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getContact()
	{
		return driver.findElement(contact);
	}
	
	public int getPopupSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}
}
