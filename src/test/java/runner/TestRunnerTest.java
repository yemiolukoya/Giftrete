package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		//features = "Feature"
		features = "/Users/yemioluv/eclipse-workspace/com.giftrete/src/test/java/features/CreateAnAccount.feature"
		,glue={"steps"},
				format={"pretty", "html:test-output", "json:json_output/cuccmber.json", "junit:junit_xml/cucumber.xml" },
		monochrome = true,
		strict = true
//				dryRun = true
		
		)

public class TestRunnerTest {

}
