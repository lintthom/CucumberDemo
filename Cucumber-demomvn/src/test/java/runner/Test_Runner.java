package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Login\\login.feature"},
glue=  {"step_definition"},
monochrome= true, //to make the console output look better
dryRun = false,
strict=true,
plugin= {"html:testoutput/cucucmber.html","junit:testoutput/cucmber.xml", "json:testoutput/cucumber.json"})

public class Test_Runner {

}
