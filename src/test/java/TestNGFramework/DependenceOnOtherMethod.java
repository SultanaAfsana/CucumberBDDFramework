package TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenceOnOtherMethod {
	@Test()
	public void getTest3() {
		Assert.assertTrue(false);
		System.out.println("Test3 Actions");
		
	}
	@Test(dependsOnMethods= {"getTest3"})
	public void getTest4() {
		System.out.println("Test4 runs depends on Test3 Method");
	}

}
