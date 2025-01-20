package com.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.cucumber.steps",
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "json:target/cucumber-reports.json",
                "junit:target/cucumber-reports.xml"},
        monochrome = true,
        tags = "@smoketest"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
