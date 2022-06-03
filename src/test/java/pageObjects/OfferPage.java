package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OfferPage {
	
	public WebDriver driver;

//	By topDeals= By.xpath("//*[text()='Top Deals']");
	private By search = By.id("search-field");
	private By offerPageProdName= By.cssSelector("tr td:nth-child(1)");
	
	
	public OfferPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void searchItemOnofferPage(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductNameOnOfferPage() {
		return driver.findElement(offerPageProdName).getText();
	}
}
