package TestNGFramework;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import smart.usa.Base.BaseClass;

public class TestNGParallelTesting extends BaseClass {
	
	@Test
	public void getTest1() throws InterruptedException {
		log.info("******* Test Execute on Chrome Browser  ********");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[text()='Elements']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void getTest2() throws InterruptedException {
		log.info("******* Test Execute on Chrome Browser  ********");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[text()='Elements']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void getTest3() throws InterruptedException {
		log.info("******* Test Execute on Chrome Browser  ********");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[text()='Elements']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

	public void getTest4() throws InterruptedException {
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[text()='Elements']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	

}
