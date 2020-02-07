package com.Adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.BaseClass.BaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:\\src\\test\\resource\\com\\Adactin\\Reports\\Adactin.json",
		"junit:\\src\\test\\resource\\com\\Adactin\\Reports\\Adactin.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Report.html",
		"html:\\src\\test\\resource\\com\\Adactin\\Reports"

},

		features = "src\\test\\java\\com\\Adactin\\Feature\\Adactin.feature", glue = "com.Adactin.StepDefn", dryRun = false, strict = true)

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass

	public static void initilizeBrowser() throws Throwable {
	BaseClass.initializeBrowser("chrome");
	}

	@AfterClass
	public static void driverQuit() throws Throwable {
		BaseClass.driverQuit();
	}
//	public void extentReport() {
//		Reporter.loadXMLConfig(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\Adactin\\props\\Extent.xml");
//
//	}
	

}
