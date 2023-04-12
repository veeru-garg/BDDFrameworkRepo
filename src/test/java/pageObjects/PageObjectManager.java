package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public LandingPage landingPage;
    public OfferPage offerPage;
    public WebDriver driver;
    public CheckOutPage checkOutPage;

    public PageObjectManager(WebDriver driver){
        this.driver= driver;
    }

    public LandingPage getLandingPage(){
        return landingPage = new LandingPage(driver);
    }

    public OfferPage getOfferPage(){
        return offerPage = new OfferPage(driver);
    }
 public CheckOutPage getCheckOutPAge(){
        return checkOutPage = new CheckOutPage(driver);
    }

}
