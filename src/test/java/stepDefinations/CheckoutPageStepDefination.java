package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefination {

	public WebDriver driver;
	TestContextSetup testContextSetUp;
	public CheckoutPage checkoutPage;
	
	public CheckoutPageStepDefination(TestContextSetup testContextSetUp){
		this.testContextSetUp=testContextSetUp;
		checkoutPage = testContextSetUp.pageObjectManager.getCheckoutPage();
	}
	
	@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) {
		checkoutPage.checkoutItem();
		Assert.assertTrue(checkoutPage.getPlacedOrderItemName().contains(name));
	}
	
	@Then ("Verify if user has ability to enter promo code and place the order")
	 public void verify_if_user_has_ability_to_enter_promo_code_and_place_the_order(){
		
		Assert.assertTrue(checkoutPage.checkApplyPromoBtnIsDisplayed());
		Assert.assertTrue(checkoutPage.checkPlaceOrderButtonIsDisplayed());
		
	}
}
