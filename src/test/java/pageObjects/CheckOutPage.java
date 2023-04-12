package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    WebDriver driver;
    public CheckOutPage(WebDriver driver){
        this.driver =driver;
    }

  By cartBag = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
    By checkOutButton = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
    By promoButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/button");
    By placeOrderButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
public void CheckOutItems(){
    driver.findElement(cartBag).click();
    driver.findElement(checkOutButton).click();
}
public Boolean VerifyPromoButton(){
    return driver.findElement(promoButton).isDisplayed();
}
public Boolean VerifyPlaceOrderButton(){
    return driver.findElement(placeOrderButton).isDisplayed();
}
}
