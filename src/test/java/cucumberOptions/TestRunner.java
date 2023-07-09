package cucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", tags="@PlaceOrder or @OfferPage",
        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber.html","json:target/cucumber.json",
                "pretty","rerun:target/failedScenarios.txt"})
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
    	
        return super.scenarios();
        
    }
}
