package in.practice.automationtesting.stepdefinitions;

import in.practice.automationtesting.utility.Driver;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.File;
import java.time.Duration;

public class Hooks {
    @Before
    public void beforeMethod() {
        System.out.println("Before method initializing");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void afterMethod(Scenario scenario) {
        System.out.println("After method initializing");
        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            File file = ts.getScreenshotAs(OutputType.FILE);

            String destine = System.getProperty("user.dir") + "/test-output/Screenshots" + "failed" + scenario.getName() + ".png";

            try {
                FileUtils.copyFile(file, new File(destine));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            scenario.attach(screenshot, "image/png", "screenshots");
        } else {
            System.out.println("Test.feature complete");
        }
        System.out.println("scenario.getName() = " + scenario.getName());
        Driver.close();
    }
}
