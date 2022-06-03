package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	private By search= By.xpath("//input[@class=\'search-keyword\']");
	private By productName= By.cssSelector("h4.product-name");
	private By topDeals= By.xpath("//*[text()='Top Deals']");
	private By increment = By.xpath("//*[@class='increment']");
	private By addToCartButton = By.xpath("//*[text()='ADD TO CART']");
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public String getTitleOfHomePage() {
		return driver.getTitle();
	}
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void clickOnTopDealsPage() {
		driver.findElement(topDeals).click();
	}
	
	public void IncrementItems(int num) {
		
		for(int i=1;i<num;i++) {
		driver.findElement(increment).click();
		}
	}
	
	public void clickOnAddToCart() {
		driver.findElement(addToCartButton).click();
	}
	
}

