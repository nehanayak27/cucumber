package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"E:\\Batch251Selenium\\Selenium1\\seleniumPrac\\Cucumber\\src\\test\\resources\\features"},
glue= {"Glue"}, 
tags="@smoke",
monochrome=true,
plugin= {"pretty","html:target/smoketestres","rerun:target/failedsmoketestscenarios.txt"}


		)
public class smoke extends AbstractTestNGCucumberTests {

}
