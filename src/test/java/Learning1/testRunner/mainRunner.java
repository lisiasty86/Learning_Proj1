package Learning1.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions (
        features = {"src/test/java/Learning1/Features/"},
        glue = {"Learning1.Steps"},
        tags = {"@product"}
        )


public class mainRunner {
}