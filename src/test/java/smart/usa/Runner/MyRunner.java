package smart.usa.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin = {"pretty", "json:target/cucumber.json"},
	features = ".//Feature/",
	glue= {"smart.usa.stepDef","smart.usa.hook"},
	monochrome = true, 
	//If I added new steps if feature file, without excution we can bring out the steps using dryrun=true
	//if dryRun = true, what is the result?
	// it will stop the execution and give us the corresponding steps.
	//When dryRun=false, we can execute the test and it will give us the corresponding steps
	dryRun=false,
	tags="@Sanity"
	)
public class MyRunner extends AbstractTestNGCucumberTests{

}
