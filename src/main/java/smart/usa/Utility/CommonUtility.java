package smart.usa.Utility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


import smart.usa.Base.BaseClass;


public class CommonUtility extends BaseClass{
	public static void getMouseHover(WebElement ele) {
		//in order to handle the mouse hover we have to take the Actions class obj and then call 
		//the pre-defined method moveToElement(), build(), perform().
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}
	//if element is not clickable, how would to resolve this issue?
	//Ans: 1) click() 
	//     2) With the help of Actions class
	//     3) With the help of javaScript Executer
	//     4) with the help of looping concept
	//     5) If the above fuctions dont work then there must be other issue i.e., Iframe,popUpWindow, etc.
	
	
	public static void getActionClick(WebElement ele) {
		//in order to click the element we can take the help from Actions class to create an object.
		//and we can call the click() method, build(), perform() method.
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
		
	}
	
	

	 public static void getAssert(String actual, String expected) { 
		 //in order to compare the expected and actual result we need to use the assertion //from
	 //either testNG, jUnit, NUnit, etc. In my current project, I use testNG Unit
	 //testing framework //So, I verify the requirement using testNG assertion.
	 //Assert.assertEquals(actual, expected);
	 log.info("************* Verified text **************** "+ expected); }
	 
	public static void getJsClick(WebElement element) {
		//java script executer is an interface which creates an instance and 
		//then call the method executeScript() pass the click argument, then it can click
		//however we dont use the JavascriptExecutor becuase the performance is slow 
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	public static void getContinuouslyClickUntilElementFound(WebElement ele) {
		// How to click btn by looping until find element
				WebElement buttonClick = ele;
				for (int i = 0; i <= 299; i++) {
					buttonClick.click();
					break;
				}
	}
	
	public static void getSelectValues(WebElement ele,String text) {
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}
	public static void WindowHandle() throws Throwable {
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			System.out.println(driver.getTitle());
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				// Closing the Child Window.
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
	}
	
	//fluent wait
	public static Actions getAction() {
		Actions ac = new Actions(driver);
		return ac;
		
	}

	public static void waitThenClick(WebElement element, WebDriver driver) {
		try {
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.elementToBeClickable(element));
			if (element.isDisplayed() && element.isEnabled()) {
				getAction().moveToElement(element);
				getAction().click(element).build().perform();
			}
		} catch (TimeoutException toe) {
			log.log(Level.WARN, " Interrupted! ", toe);
			Thread.currentThread().interrupt();
		} catch (Exception e) {
			log.log(Level.WARN, "Interrup ted!", e);
			Thread.currentThread().interrupt();
		}
	}
	
	//test data 
	public static String getRandomStringValue() {
		String name= RandomStringUtils.randomAlphabetic(5);
		System.out.println(name);
		return name ;
	}
	public static String getRandomNumericValue() {
		String num = RandomStringUtils.randomNumeric(10);
		System.out.println(num);
		return num;
	}
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./ScreenShot/" + screenshotName + ".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}
	
	
	
}
