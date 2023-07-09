package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.*;
import pageObjects.LandingPage;
import utils.TestContextSetup;

import java.io.IOException;
public class LandingPageStepDefination {
    TestContextSetup testContextSetup;
    LandingPage landingPage;
public LandingPageStepDefination(TestContextSetup testContextSetup){
    this.testContextSetup =testContextSetup;
//    this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
}
    @Given("^User in on GreenCart Landing page$")
    public void user_in_on_greencart_landing_page() throws IOException {
//   ss    testContextSetup.testBase.WebDriverManger();
//        Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
    }
    @When("^user search with shortname (.+) and extracted actual name of product$")
    public void user_search_with_shortname_something_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        landingPage = testContextSetup.pageObjectManager.getLandingPage();
           landingPage.SearchItem(shortName);
        Thread.sleep(2000);
        testContextSetup.LandingPageProductName = landingPage.GetProductName().split("-")[0].trim();
        System.out.println(testContextSetup.LandingPageProductName + " ----" );
    }
    @When("Added {string} items of the selected product to cart")
    public void Added_item_products(String  Quantity){
landingPage.incrementQuantity(Integer.parseInt(Quantity));
landingPage.addToCart();
    }
    }
