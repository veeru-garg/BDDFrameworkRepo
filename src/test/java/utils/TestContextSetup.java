package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {
    public WebDriver webDriver;
    public String LandingPageProductName;
    public PageObjectManager pageObjectManager;
    public GenricUtils genricUtils;
    public TestBase testBase;
    public  TestContextSetup() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManger());
        genricUtils = new GenricUtils(testBase.WebDriverManger());

    }

}
