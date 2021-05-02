package com.tricentis.automation.test.functional;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:/features",
        glue = {"com.tricentis.automation.test.functional"},
        plugin = {"pretty", "json:target/cucumber/tricentis.json"})
public class TricentisRunCucumber {

}