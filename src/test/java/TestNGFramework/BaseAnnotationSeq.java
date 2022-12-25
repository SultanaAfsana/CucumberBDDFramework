package TestNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseAnnotationSeq {

	@BeforeSuite
	public void getBeforeSuite() {
		System.out.println("getBeforeSuite");
	}

	@AfterSuite
	public void getAfterSuite() {
		System.out.println("getAfterSuite");
	}

	@BeforeTest
	public void getBeforeTest() {
		System.out.println("getBeforeTest");
	}

	@BeforeClass
	public void getBeforeClass() {
		System.out.println("getBeforeClass");
	}

	@BeforeMethod
	public void getBeforeMethod() {
		System.out.println("getBeforeMethod");
	}

	@AfterTest
	public void getAfterTest() {
		System.out.println("getAfterTest");
	}

	@Test
	public void getTest() {
		System.out.println("getTest");
	}

	@AfterClass
	public void getAfterClass() {
		System.out.println("getAfterClass");
	}

	@AfterMethod
	public void getAfterMethod() {
		System.out.println("getAfterMethod");
	}

}
