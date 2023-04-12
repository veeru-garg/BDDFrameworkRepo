package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver =driver;
    }

    By search = By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/input");
    By productName = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/h4");
    By TopDealLink = By.linkText("Top Deals");
    By increment = By.cssSelector("a.increment");
    By addToCart = By.cssSelector(".product-action button");
    public void SearchItem(String name){
        driver.findElement(search).sendKeys(name);
    }

    public  void  incrementQuantity(int quantity){
        int i = quantity-1;
        while (i>0){
            driver.findElement(increment);
            i--;
        }
    }
    public  void  addToCart(){
        driver.findElement(addToCart).click();
    }
    public String GetProductName(){
        return driver.findElement(productName).getText();
    }
    public void selectTopDealsPage(){
        driver.findElement(TopDealLink).click();
    }
    public String getTitleLandingPage(){
        return  driver.getTitle();
    }
}
