package TestNGFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGEnableDisable {
	@BeforeMethod
	public void getSetUp() {
		System.out.println("Opened Browser");
	}
	@Test(enabled=false)
	public void getTest1() {
		System.out.println("Test1 Actions");
	}
	@Test(enabled=false)
	public void getTest2() {
		System.out.println("Test2 Actions");
	}
	@Test(priority=2)
	public void getTest3() {
		System.out.println("Test3 Actions");
	}
	@Test(enabled=false)
	public void getTest4() {
		System.out.println("Test4 Actions");
	}
	
	@Test(priority=0)
	public void getTest5() {
		System.out.println("Test5 Actions");
	}
	@AfterMethod
	public void getTearDown() {
		System.out.println("Closed Browser");
	}

}
