package stepDefinitions;
import io.cucumber.java.After;
import utils.TestContextSetup;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
public class Hooks {
    TestContextSetup testContextSetup;
    public Hooks(TestContextSetup testContextSetup){

        this.testContextSetup = testContextSetup;

    }
    @After
    public void AfterScenario() throws IOException {
      testContextSetup.testBase.WebDriverManger().quit();
    }
   
    @AfterStep    
    public void  AfterStep(Scenario scenario) throws IOException {
    	WebDriver driver =  testContextSetup.testBase.WebDriverManger();
    	if(scenario.isFailed()) {

    	File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	byte[] FileContent =FileUtils.readFileToByteArray(sourcePath);
    	scenario.attach(FileContent, "image/png", "image");
    	
    	}
    	
    	
    	
    }
}
