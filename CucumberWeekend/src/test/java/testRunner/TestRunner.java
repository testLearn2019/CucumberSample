package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Features/orangeHRMLogin.feature" , glue = {"stepDefinition"}, plugin= {"html:target/cucumber-reports"})
public class TestRunner {

}
