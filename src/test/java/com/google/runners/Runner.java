package com.google.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"target/test-classes/features"},
        glue = {"com/google/steps"},
        plugin = {"html:target/cukes", "json:target/cucumber-report.json",
                "junit:target/cucumber-report.xml", "pretty", "rerun:target/rerun.txt"},
        strict = true,
        //tags = {"@smoke"},
        dryRun = false,
        monochrome = true)
public class Runner extends AbstractTestNGCucumberTests{
}
