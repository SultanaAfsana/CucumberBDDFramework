package smart.usa.stepDef;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import smart.usa.Base.BaseClass;
import smart.usa.PageFactory.ElementPage;
import smart.usa.Utility.CommonUtility;
import smart.usa.Utility.WaitHelper;



public class MyStepDef extends BaseClass{
	ElementPage pg;
	
	@Given("User is already logged in to the application and verify the user information on the landing page")
	public void user_is_already_logged_in_to_the_application_and_verify_the_user_information_on_the_landing_page() {
		// in order to configure the page factory and step definition we have to follow the below coding
		   pg = PageFactory.initElements(driver, ElementPage.class);
		   log.info("************* User is already logged in the application ****************");
		   //in order to log in the application we follow the steps below
		   pg.getLogIn();
		   log.info("************* User is able to verify the user info on the screen ****************");
		   //in order to validate the requirement we have to follow the steps bellow
		   String expected = "Welcome, MUHANA TRISHA!"; //from requirement document
		   String actual =  pg.getVerifyUserInfo().getText(); //we have to store the element and actual as a string data because 
		  Assert.assertEquals(actual,expected);
		   
	    
	}
	@When("User should be able to select {string} jacket from the men module")
	public void user_should_be_able_to_select_jacket_from_the_men_module(String string) {
		//in order to complete the selenium challenge mouse hover we follow the steps bellow
		log.info("************* User is able to mouse hover the men module ****************");
		//in order to overcome the synchronization issue we have to follow the steps below
		WaitHelper.getSeleniumWait(pg.getMouseHoverMen(), 20);
		CommonUtility.getMouseHover(pg.getMouseHoverMen());
				
		log.info("************* User is able to mouse hover the tops inside the men module ****************");
		WaitHelper.getSeleniumWait(pg.getMouseHoverTops(), 20);
		CommonUtility.getMouseHover(pg.getMouseHoverTops());
				
		//if the click method doesnt work, we can overcome the situation with the help of Actions class,
		//javascript executer, looping concept steps bellow
		log.info("************* User is able to click on jackets inside the men module ****************");
		WaitHelper.getSeleniumWait(pg.getSelectJacket(), 20);
		//CommonUtility.getActionClick(pg.getSelectJacket());
		CommonUtility.getJsClick(pg.getSelectJacket());
				
				
		log.info("************* User is able to verify the Jupiter jackets inside the men module ****************");
		WaitHelper.getSeleniumWait(pg.getVerifyJupiterJacket(), 20);
		CommonUtility.getActionClick(pg.getVerifyJupiterJacket());			
	    
	}
	@When("Verify the jacket name on the {string} list")
	public void verify_the_jacket_name_on_the_list(String string) {
		String actual = pg.getJupiterJacket().getText();
		String expected = prop.getProperty("verifiedJupiterJacket");
		Assert.assertEquals(actual,expected);
		
	}
	@When("User should be able to select the {string} and {string} and \"{int}\"then click on the add to cart")
	public void user_should_be_able_to_select_the_and_and_then_click_on_the_add_to_cart(String getSize, String getColor, Integer getQuantity) {
		log.info("************* User is able to select the jacket size ****************");
		WaitHelper.getSeleniumWait(pg.getSelectSize(), 20);
	    CommonUtility.getJsClick(pg.getSelectSize());
	   
	    log.info("************* User is able to select the jacket color ****************");
		WaitHelper.getSeleniumWait(pg.getSelectColor(), 20);
	    CommonUtility.getJsClick(pg.getSelectColor());
	    
	    log.info("************* User is able to select the jacket Quantity ****************");
		WaitHelper.getSeleniumWait(pg.getSelectQuantity(), 20);
		pg.getSelectQuantity().clear();
	    pg.getSelectQuantity().sendKeys("1");
	    
	    log.info("************* User is able to click on add to cart ****************");
		WaitHelper.getSeleniumWait(pg.getClickAddToCart(), 20);
	    CommonUtility.getJsClick(pg.getClickAddToCart());
	}

	
	@When("User should be able to click on the cart and checkout")
	public void user_should_be_able_to_click_on_the_cart_and_checkout() {
		log.info("************* User is able to click on shopping cart ****************");
		WaitHelper.getSeleniumWait(pg.getClickOnShoppingCart(), 20);
	    CommonUtility.getActionClick(pg.getClickOnShoppingCart());
	    
	    log.info("************* User is able to click on proccess to checkout ****************");
		WaitHelper.getSeleniumWait(pg.getProceessToCheckout(), 20);
	    CommonUtility.getActionClick(pg.getProceessToCheckout());
	    
	    
	    
	}
	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() throws Throwable {
		
		log.info("************* User is able to click on add to new address ****************");
		WaitHelper.getSeleniumWait(pg.getClickOnAddNewAddress(), 20);
	    CommonUtility.getJsClick(pg.getClickOnAddNewAddress());
	    
	    pg.getNewAddressDetails();
	    
	}
	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
	    
		log.info("************* User is able to verify order number ****************");
		WaitHelper.getSeleniumWait(pg.getOrderNumber(), 20);
		
		String actual= pg.getOrderNumber().getText();
		log.info("This is the new order number "+actual);
		
		
		
	}
	@Then("User should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String expected) throws IOException {
		CommonUtility.captureScreenshot(driver, "VerifyOrderNumber");
		log.info("************* User is able to verify order number ****************");
		WaitHelper.getSeleniumWait(pg.getVerifyOrderConfirmationText(), 20);
		
		String actual=pg.getVerifyOrderConfirmationText().getText();
		log.info("This is the new order number "+actual);
		Assert.assertEquals(actual,expected);
		
		
	}
}
