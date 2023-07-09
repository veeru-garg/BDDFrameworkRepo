package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public WebDriver webDriver;
    public WebDriver WebDriverManger() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String url = properties.getProperty("QAurl");
        String  browser_property = properties.getProperty("browser");
        String  system_property = System.getProperty("browser");
        String  browser =system_property!=null ? system_property : browser_property;
        
        if(webDriver == null){
        	
            if(browser.equalsIgnoreCase("Chrome")){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                webDriver = new ChromeDriver(options);
                webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            }
            if (browser.equalsIgnoreCase("firefox")){
            	
                webDriver = new FirefoxDriver();
                webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            }
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            webDriver.get(url);
        }
        return  webDriver;
    }

}
