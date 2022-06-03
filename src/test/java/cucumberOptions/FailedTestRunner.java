package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		   //path of feature file
		   features = "@target/failed_scenario.txt",
		   //path of step definition file
		   glue = "stepDefinations",
		   monochrome = true,
		   plugin={"pretty","html:target/cucumber.html",
				   "json:target/cucumber-reports/CucumberTestReport.json",
				   "junit:target/cukes.xml",
				   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		   dryRun= false
		  
		   )
public class FailedTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel= true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
