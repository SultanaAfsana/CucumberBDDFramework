package TestNGFramework;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import smart.usa.Base.BaseClass;

public class CrossBrowserTesting extends BaseClass {

	@BeforeMethod
	@Parameters("browser") // This is testNG advance annotation
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("Safari")) {
			log.info("******* Test Execute on Safari Browser  ********");
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			log.info("******* Test Execute on Chrome Browser  ********");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("FireFox")) {
			log.info("******* Test Execute on Edge Browser  ********");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			log.info("******* Incorrect Browser path or another version ********");
			throw new Exception("Incorrect Browser");
		}
	}

	@Test
	public void getTest() throws InterruptedException {
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[text()='Elements']")).click();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void getTearDown() {
		driver.quit();
	}
}
