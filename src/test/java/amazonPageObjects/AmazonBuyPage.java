package amazonPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonBuyPage {

	public WebDriver driver;
	public AmazonBuyPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By addToCartBtn = By.xpath("//input[@id='add-to-cart-button']");
	By validateAddedToCartText = By.xpath("//div[@id='huc-v2-confirm-text-container']/div/h1");
	By cartIcon = By.xpath("//*[@id='nav-cart-count']");
	By author = By.xpath("//*[@id='sc-item-C5c7d021c-229c-4970-a521-a9efe5db09de']/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/span");
	By price = By.xpath("//*[@id='sc-item-C5c7d021c-229c-4970-a521-a9efe5db09de']/div[4]/div/div[2]/p/span/");
	By removeFromCart = By.xpath("//*[@id='sc-item-C5c7d021c-229c-4970-a521-a9efe5db09de']/div[4]/div/div[1]/div/div/div[2]/div/span[2]/span/input");
	By cartEmptyCheck = By.xpath("//*[@id='sc-item-C5c7d021c-229c-4970-a521-a9efe5db09de']/div[3]/div[1]/span");	
	
	
	public WebElement ValidatecartEmpty()
	{
		return driver.findElement(cartEmptyCheck);
	}
	
	public WebElement removeFromCart()
	{
		return driver.findElement(removeFromCart);
	}
	
	public WebElement getAuthor()
	{
		return driver.findElement(author);
	}
	
	public WebElement getPrice()
	{
		return driver.findElement(price);
	}
	
	public WebElement ClickAddToCartBtn()
	{
		return driver.findElement(addToCartBtn);
	}
	
	public WebElement ValidateAddedToCartText()
	{
		return driver.findElement(validateAddedToCartText);
	}
	
	public WebElement ClickCartIcon()
	{
		return driver.findElement(cartIcon);
	}
	
	
	
	
}
