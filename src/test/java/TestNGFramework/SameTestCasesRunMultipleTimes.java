package TestNGFramework;

import org.testng.annotations.Test;

public class SameTestCasesRunMultipleTimes {
	@Test(invocationCount=5)
	public void getTest5() {
		System.out.println("Test5 Actions");
	}
}
