package StepsForHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/HooksDemo/HooksDemo.feature",glue= {"StepsForHooks"},
monochrome = true,
plugin = {"json:target/cucumber.json"}

		)
public class TestRunnerForHooks {

}
