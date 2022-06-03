package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		   //path of feature file
		   features = "src/test/java/features",
		   //path of step definition file
		   glue = "stepDefinations",
		   monochrome = true,
		//	 tags= "@SmokeTest or @RegressionTest",
		//   tags = "@MobileTest or @WebTest",
		   plugin={"pretty","html:target/cucumber.html",
				   "json:target/cucumber-reports/CucumberTestReport.json",
				   "junit:target/cukes.xml",
				   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				   "rerun:target/failed_scenario.txt"},
		   dryRun= false
		  
		   )
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel= true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
