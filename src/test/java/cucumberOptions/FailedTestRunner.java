package cucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;
@CucumberOptions(features = "@target/failedScenarios.txt", glue = "stepDefinitions", 
        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber.html","json:target/cucumber.json",
                "pretty"})
public class FailedTestRunner extends AbstractTestNGCucumberTests {
    @Override
    //90249*Veeru   GARG_VEERU
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
