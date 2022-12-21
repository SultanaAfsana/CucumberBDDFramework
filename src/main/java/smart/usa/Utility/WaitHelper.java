package smart.usa.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import smart.usa.Base.BaseClass;

public class WaitHelper extends BaseClass{
	
	public static void getSeleniumWait(WebElement ele,long time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
	    wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}
