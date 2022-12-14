package com.Test_Runner.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base_Class.org.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\FaceBook\\org", glue = "com.Step_Definition.org", monochrome = true, dryRun = true,
//strict = true, -- This option is not available in io.cucumber, but we can use it in info.cukes.
		tags = ("@Test"), plugin = { "html:Report/Cucumber_Report.html", "json:Report/Cucumber_Report.json", "pretty" }) // "com.cucumber.listener.ExtentCucumberFormatter:Report/Facebook.html"})
public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = Base_Class.launchBrowser("Chrome");

	}

	@AfterClass
	public static void tearDown() throws Exception {

		Base_Class.closeBrowser();
	}
}
