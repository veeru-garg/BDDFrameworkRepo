package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        if(webDriver == null){
            if(properties.getProperty("browser").equalsIgnoreCase("Chrome")){
                webDriver = new ChromeDriver();
                webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            }
            if (properties.getProperty("browser").equalsIgnoreCase("Firefox")) {
                System.out.println("code for firfox");
            }
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            webDriver.get(url);
        }
        return  webDriver;
    }

}
