package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginDemo.feature", glue = {"StepDefinitions"},
monochrome = true,
plugin= {"pretty", 
		"junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/Cucumber/HtmlReports",
		"summary"}

		)
public class TestRunner {

}


// to run test 1.right click 2. Run As 3 JUnit Test