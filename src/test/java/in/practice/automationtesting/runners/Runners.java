package in.practice.automationtesting.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin   = {"pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = {"src/test/resources/Features/"},
        glue = {"in/practice/automationtesting/stepdefinitions"},

        tags = "@US_01_TC_001",
        dryRun = false
)
public class Runners {

}
