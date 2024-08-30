package tek.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        tags = "@Smoke",
        dryRun = false,
        monochrome = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "html:target/cucumber-report/report.html",
                "pretty",
        }
)

public class TestRunner {
}