package smart.usa.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import smart.usa.Base.BaseClass;
import smart.usa.Utility.CommonUtility;

public class MyHooks extends BaseClass{
	@Before
	public void getSetUp() {
		log.info(">>>>>>>>>>>>>>>>>>> Automation started here <<<<<<<<<<<<<<<<<<<");
		BaseClass.initialization();
	}
	
	@After
	public void getTearDown(Scenario scenario) {
		log.info(">>>>>>>>>>>>>>>>>>>> Automation ended! <<<<<<<<<<<<<<<<<<<<<<");
		if (scenario.isFailed()) {
			CommonUtility.captureScreenshot(driver, "failed test");
		}
		driver.quit();
	}

}
