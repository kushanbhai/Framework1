package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Kushan\\git\\Framework1\\Framework1\\src\\main\\java\\Features\\contacts.feature",
        glue = {"StepDefinitions"},//path of the step definition files
		format = { "pretty", "html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },
		//to generate different types of reporting
		monochrome = true,//display the console output in a proper format
		strict = true,//to check any step is defined in step def file
		dryRun = false)//to check the mapping is proper bet feature file and step def file
public class TestRunner {

}
