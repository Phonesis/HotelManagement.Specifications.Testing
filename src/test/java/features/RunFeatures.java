package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by MPoole on 26/03/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src//test//java///features//EntryCreationAndDeletion.feature", format = { "pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" }, tags = "@EntryTest",
        glue = "steps")
public class RunFeatures {
}
