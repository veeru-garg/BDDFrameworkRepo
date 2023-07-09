package stepDefinitions;
import io.cucumber.java.en.Then;
import org.testng.*;
import pageObjects.CheckOutPage;
import utils.TestContextSetup;

public class CheckOutPageStepDefination {
    public CheckOutPage checkOutPage;
    TestContextSetup testContextSetup;
public CheckOutPageStepDefination(TestContextSetup testContextSetup){
    this.testContextSetup =testContextSetup;
    this.checkOutPage = testContextSetup.pageObjectManager.getCheckOutPAge();
}

   @Then("verify user has ability to enter promo code and place the order")
    public void verify_user_has_ability_to_enter_promo_code_and_place_the_order(){

       Assert.assertTrue(checkOutPage.VerifyPromoButton());
       Assert.assertTrue(checkOutPage.VerifyPlaceOrderButton());
    }

    @Then("^user proceeds to Checkout and validate the (.+) items in checkout page$")
    public void User_proceeds_to_Checkout_and_validate_the_items_in_checkout_page(String name) throws InterruptedException {
    checkOutPage.CheckOutItems();
    }
    }
