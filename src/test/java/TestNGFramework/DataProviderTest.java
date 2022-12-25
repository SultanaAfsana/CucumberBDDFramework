package TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
//I have to create multi-dimension array return method, inside the return 
//statement i have to initialize the value/data. then, write down the data
//provider annotation before the method and pass the parameter as method name
	
	@DataProvider(name="dataProvider")
	public Object [][] dpMethod(){
		return new Object[][] {{"Afsana"},{"winner"}};
	}
	
	//In my test i have to pass the parameter inside the test annotation 
	//dataprovider = methodName so that i can pass the data to my application 
	//using testNG data provider
	@Test(dataProvider="dataProvider")
	public void getMyTest(String value) {
		System.out.println("pass parameter is : "+value);
		
	}
}
