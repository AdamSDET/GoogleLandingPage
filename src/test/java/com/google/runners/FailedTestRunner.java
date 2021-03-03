package com.google.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "src/test/java/com/google/steps"
)
public class FailedTestRunner {
}
