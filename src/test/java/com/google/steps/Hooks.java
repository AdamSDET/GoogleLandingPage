package com.google.steps;

import com.google.pages.BasePage;
import com.google.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Cucumber hook steps definition class responsible for actions taken before and after test execution.
 */
public class Hooks {

    BasePage basePage = new BasePage();

    @Before
    public void beforeUITests() {
        basePage.navigateToHomePage();

    }

    @After
    public void afterUITests(final Scenario scenario) {
        if (!scenario.isFailed()) {
            Driver.closeDriver();
        } else {
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }
    }
}
