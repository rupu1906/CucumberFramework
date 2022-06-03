package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	private By getName = By.cssSelector("tr td:nth-child(2) p");
	private By applyBtn = By.xpath("//*[text()='Apply']");
	private By placeOrderBtn = By.xpath("//*[text()='Place Order']");
	private By cartBag = By.cssSelector("[alt='Cart']");
	private By proceedToCheckout = By.xpath("//*[text()='PROCEED TO CHECKOUT']");
	//private By promoBtn = By.cssSelector(".promoCode");
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void checkoutItem() {
		driver.findElement(cartBag).click();
		driver.findElement(proceedToCheckout).click();
	}
	
	public String getPlacedOrderItemName() {
		return driver.findElement(getName).getText();
	}
	
	public boolean checkApplyPromoBtnIsDisplayed() {
		return driver.findElement(applyBtn).isEnabled();
	}
	
	
	public boolean checkPlaceOrderButtonIsDisplayed() {
		return driver.findElement(placeOrderBtn).isEnabled();
	}	

}
