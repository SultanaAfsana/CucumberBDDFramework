package TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFailedTestCases {
	@Test()
	public void getTest1() {
		AssertJUnit.assertTrue(true);
		System.out.println("Test1 Actions");
		
	}
	@Test()
	public void getTest2() {
		AssertJUnit.assertTrue(true);
		System.out.println("Test2 Actions");
		
	}
	@Test()
	public void getTest3() {
		AssertJUnit.assertTrue(true);
		System.out.println("Test3 Actions");
		
	}
	@Test()
	public void getTest4() {
		AssertJUnit.assertTrue(true);
		System.out.println("Test4 Actions");
		
	}
}
