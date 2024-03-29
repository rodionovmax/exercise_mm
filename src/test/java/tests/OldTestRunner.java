package tests;
//
//import io.cucumber.testng.CucumberFeatureWrapper;
//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.TestNGCucumberRunner;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//
//@CucumberOptions(
//        features = "src/test/resources/features",
//        glue = {"stepdefs"},
//        tags = {"~@Ignore"},
//        format = {  "pretty",
//                    "html:target/cucumber-reports/cucumber-pretty",
//                    "json:target/cucumber-reports/CucumberTestReport.json",
//                    "rerun:target/cucumber-reports/rerun.txt" }
//        )

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(plugin = "pretty", features = {"src/test/resources/features"}, glue = "steps")
public class OldTestRunner extends AbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;

//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }

}







//    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
//    public void feature(CucumberFeatureWrapper cucumberFeature) {
//        testNGCucumberRunner.runScenario(cucumberFeature.getCucumberFeature());
//    }
//
//    @DataProvider
//    public Object[][] features() {
//        return testNGCucumberRunner.provideScenarios();
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//        testNGCucumberRunner.finish();
//    }
//}

//
//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = "pretty", features = "src/test/resources/hellocucumber")
//public class RunCucumberTest
//{
//}