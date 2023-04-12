package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
    public  WebDriver driver;
    public OfferPage(WebDriver driver){
        this.driver = driver;
    }
    private final By searchTextField = By.xpath("//*[@id=\"search-field\"]");
    private final By ProductNameElement = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/table/tbody/tr/td[1]");


    public void searchItem(String ItemName){
        driver.findElement(searchTextField).sendKeys(ItemName);
    }
    public  String getProductName(){
        return driver.findElement(ProductNameElement).getText();
    }

}
