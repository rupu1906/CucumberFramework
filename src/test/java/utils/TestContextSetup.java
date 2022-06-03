package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProdName;
	public TestBase testBase;
	public GenericUtils genricUtils;
	
	public PageObjectManager pageObjectManager;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genricUtils = new GenericUtils(testBase.WebDriverManager());
	}
}
