package stepDefinations;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.TestContextSetup;

public class OfferPageStepDefination {
	public String offerPageProdName;
	TestContextSetup testContextSetUp;
	
	public OfferPageStepDefination(TestContextSetup testContextSetUp){
		this.testContextSetUp=testContextSetUp;
	}

	@Then("^user search for (.+) short name in offer page$")
	public void user_search_for_same_shortname_in_ofder_page_to_check_if_prodcut_exist(String shortName) {
		LandingPage landingPage= testContextSetUp.pageObjectManager.getLandingPage();
		landingPage.clickOnTopDealsPage();
		testContextSetUp.genricUtils.switchToChildWindow();
		OfferPage offerPage =testContextSetUp.pageObjectManager.getOfferPage();
		offerPage.searchItemOnofferPage(shortName);
		offerPageProdName=offerPage.getProductNameOnOfferPage();   
	}
	
	
	@Then("validate product name in offer page matches with Landing page")
	public void validate_product_name_in_offer_page_matches_with_landing_page() {
		
	    Assert.assertEquals(offerPageProdName, testContextSetUp.landingPageProdName, "Not Equal");
	}
}
