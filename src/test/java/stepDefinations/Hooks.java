package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	

	TestContextSetup testContextSetUp;
	
	public Hooks(TestContextSetup testContextSetUp){
		this.testContextSetUp=testContextSetUp;
	}
	
	
	@After
	public void tearDown() throws IOException {
		testContextSetUp.testBase.WebDriverManager().quit();;
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
		WebDriver driver = testContextSetUp.testBase.WebDriverManager();
		if(scenario.isFailed()) {
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent= FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}

}
