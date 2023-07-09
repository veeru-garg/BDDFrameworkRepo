package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.*;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;


public class OfferPageStepDefination {
      public String OfferPageProductName;

    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;
    public OfferPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup =testContextSetup;
    }

    @Then("^user searched for (.+) shortname in offers page$")
    public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
        switchToOffersPage();
        OfferPage offerPage = testContextSetup.pageObjectManager.getOfferPage();
        offerPage.searchItem(shortName);
        Thread.sleep(2000);
        OfferPageProductName = offerPage.getProductName();
    }

    public void switchToOffersPage(){
        LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
        landingPage.selectTopDealsPage();
        testContextSetup.genricUtils.switchWindowToChild();
    }
    @Then("^Validate product name in offers page matches with Landing page$")
    public void Validate_product_name_in_offers_page_matches_with_Landing_page() {
        Assert.assertEquals(OfferPageProductName, testContextSetup.LandingPageProductName);
    }
    }
