package runner;


//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features/problem.feature"}, plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}, glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}

