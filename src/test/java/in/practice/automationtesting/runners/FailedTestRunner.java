package in.practice.automationtesting.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/failed-html-report.html"},
        features = "@target/failedRerun.txt",
        glue = {"in/practice/automationtesting/stepdefinitions"}
)

public class FailedTestRunner {
}
