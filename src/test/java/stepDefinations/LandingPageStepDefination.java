package stepDefinations;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefination {
	public WebDriver driver;
	public String landingPageProdName;
	public LandingPage landingPage;
	TestContextSetup testContextSetUp;
	
	public LandingPageStepDefination(TestContextSetup testContextSetUp){
		this.testContextSetUp=testContextSetUp;
		 this.landingPage =  testContextSetUp.pageObjectManager.getLandingPage();
	}
	
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(landingPage.getTitleOfHomePage().contains("GreenKart"));
	}
	
	@When("^user searched with short name (.+) and extract actual name of the product$")
	public void user_searched_with_short_name_and_extract_actual_name_of_the_product(String shortName) throws InterruptedException {
		
		landingPage.searchItem(shortName);
		Thread.sleep(3000);
	    testContextSetUp.landingPageProdName=landingPage.getProductName().split("-")[0].trim();
	  
	}
	
	@When ("added {string} items of the selected product to the cart")
	public void dded_items_of_the_selected_product_to_the_cart(String num) throws InterruptedException {
		landingPage.IncrementItems(Integer. parseInt(num));
		landingPage.clickOnAddToCart();
		Thread.sleep(4);
	}
	
	
}
