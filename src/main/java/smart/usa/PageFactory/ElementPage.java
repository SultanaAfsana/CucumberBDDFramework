package smart.usa.PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import smart.usa.Base.BaseClass;
import smart.usa.Utility.CommonUtility;
import smart.usa.Utility.WaitHelper;

public class ElementPage extends BaseClass{

	public ElementPage() {
		PageFactory.initElements(driver, this);
	}
	//constant variable( doesn't change)
		final static String loopXpath= "//input[@id='email']";
		
		@FindBy(xpath = "(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]")
		@CacheLookup
		private WebElement clickSignInBTN;
		
		public WebElement getClickSignInBTN() {
			return clickSignInBTN;
		}

		@FindBy(xpath = "//input[@id='email']")
		@CacheLookup
		private WebElement user_name;
		
		public WebElement getUser_name() {
			return user_name;
		}
		
		@FindBy(xpath = "(//input[@id='pass'])[1]")
		@CacheLookup
		private WebElement password;

		public WebElement getPassword() {
			return password;
		}

		
		@FindBy(xpath = "(//button[@id='send2'])[1]")
		@CacheLookup
		private WebElement clickLogInBTN;
		
		public WebElement getClickLogInBTN() {
			return clickLogInBTN;
		}
		
		
		@FindBy(xpath = "(//*[text() ='Welcome, MUHANA TRISHA!'])[1]")
		@CacheLookup
		private WebElement verify;
		
		public WebElement getVerifyUserInfo() {
			return verify;
		}
		
		@FindBy(xpath = "//*[text()='Men']")
		@CacheLookup
		private WebElement mouseHoverMen ;
		
		public WebElement getMouseHoverMen() {
			return mouseHoverMen;
		}
		@FindBy(xpath = "(//*[text()='Tops'])[2]")
		@CacheLookup
		private WebElement mouseHoverTops ;
		
		public WebElement getMouseHoverTops() {
			return mouseHoverTops;
		}
		
		@FindBy(linkText = "Jackets")
		@CacheLookup
		private WebElement selectJacket ;
		
		public WebElement getSelectJacket() {
			return selectJacket;
		}
		
		@FindBy(linkText = "Jupiter All-Weather Trainer")
		@CacheLookup
		private WebElement verifyJupiterJacket ;
		
		public WebElement getVerifyJupiterJacket() {
			return verifyJupiterJacket;
		}
		//Jupiter All-Weather Trainer
		@FindBy(xpath = "(//*[text()='Jupiter All-Weather Trainer '])[1]")
		@CacheLookup
		private WebElement jupiterJacket;
		
		public WebElement getJupiterJacket() {
			return jupiterJacket;
		}
		@FindBy(xpath = "(//*[@index='2'])[1]")
		@CacheLookup
		private WebElement selectSize;
		
		public WebElement getSelectSize() {
			return selectSize;
		}
		@FindBy(xpath = "(//*[@index='0'])[2]")
		@CacheLookup
		private WebElement selectColor;
		
		public WebElement getSelectColor() {
			return selectColor;
		}
		@FindBy(xpath = "//*[@id='qty']")
		@CacheLookup
		private WebElement selectQuantity;
		
		public WebElement getSelectQuantity() {
			return selectQuantity;
		}
		@FindBy(xpath = "//*[text()='Add to Cart']")
		@CacheLookup
		private WebElement clickAddToCart;
		
		public WebElement getClickAddToCart() {
			return clickAddToCart;
		}
		
		@FindBy(xpath = "//*[text()='shopping cart']")
		@CacheLookup
		private WebElement clickOnShoppingCart;
		
		public WebElement getClickOnShoppingCart (){
			return clickOnShoppingCart;
		}
		
		@FindBy(xpath = "(//*[text()='Proceed to Checkout'])[2]")
		@CacheLookup
		private WebElement proceessToCheckout;
		
		public WebElement getProceessToCheckout(){
			return proceessToCheckout;
		}
		

		@FindBy(xpath = "//*[text()='New Address']")
		@CacheLookup
		private WebElement clickOnAddNewAddress;
		
		public WebElement getClickOnAddNewAddress(){
			return clickOnAddNewAddress;
		}
		
		//Address detailed elements 
		@FindBy(xpath = "(//*[@type='text'])[2]")
		@CacheLookup
		private WebElement enterFirstName;
		
		public WebElement getEnterFirstName(){
			return enterFirstName;
		}
		
		@FindBy(xpath = "(//*[@type='text'])[3]")
		@CacheLookup
		private WebElement enterLastName;
		
		public WebElement getEnterLastName(){
			return enterLastName;
		}
		
		@FindBy(xpath = "(//*[@type='text'])[4]")
		@CacheLookup
		private WebElement enterCompanyName;
		
		public WebElement getEnterComapnyName(){
			return enterCompanyName;
		}
		
		@FindBy(xpath = "(//*[@type='text'])[5]")
		@CacheLookup
		private WebElement enterAddress;
		
		public WebElement getEnterAddress(){
			return enterAddress;
		}
		
		@FindBy(xpath = "(//*[@type='text'])[8]")
		@CacheLookup
		private WebElement enterCityName;
		
		public WebElement getEnterCityName(){
			return enterCityName;
		}
		
		@FindBy(xpath = "(//*[@class='select'])[1]")
		@CacheLookup
		private WebElement selectState;
		
		public WebElement getSelectState(){
			return selectState;
		}
		
		@FindBy(xpath = "(//*[@type='text'])[10]")
		@CacheLookup
		private WebElement enterZipCode;
		
		public WebElement getEnterZipCode(){
			return enterZipCode;
		}
		
		@FindBy(xpath = "(//*[@class='select'])[2]")
		@CacheLookup
		private WebElement selectCountryName;
		
		public WebElement getSelectCountryName(){
			return selectCountryName;
		}
		
		@FindBy(xpath = "(//*[@type='text'])[11]")
		@CacheLookup
		private WebElement enterPhoneNumber;
		
		public WebElement getEnterPhoneNumber(){
			return enterPhoneNumber;
		}
		
		@FindBy(xpath = "//*[text()='Ship here']")
		@CacheLookup
		private WebElement clickOnShipHere;
		
		public WebElement getClickOnShipHere(){
			return clickOnShipHere;
		}
		
		@FindBy(xpath = "(//*[@type='radio'])[1]")
		@CacheLookup
		private WebElement selectShippingMethod;
		
		public WebElement getSelectShippingMethod(){
			return selectShippingMethod;
		}
		
		@FindBy(xpath = "(//*[@type='submit'])[2]")
		@CacheLookup
		private WebElement clickOnNextBTN;
		
		public WebElement getClickOnNextBTN(){
			return clickOnNextBTN;
		}
		
		@FindBy(xpath = "//*[text()='Place Order']")
		@CacheLookup
		private WebElement clickOnPlaceOrder;
		
		public WebElement getClickOnPlaceOrder(){
			return clickOnPlaceOrder;
		}
		
		@FindBy(xpath = "//*[text()='Your order number is: ']")
		@CacheLookup
		private WebElement orderNumber;
		
		public WebElement getOrderNumber(){
			return orderNumber;
		}
		
		@FindBy(xpath = "//*[text()='Thank you for your purchase!']")
		@CacheLookup
		private WebElement verifyOrderConfirmationText;
		
		public WebElement getVerifyOrderConfirmationText(){
			return verifyOrderConfirmationText;
		}
		
		public void getLogIn() {
			getClickSignInBTN().click();
			log.info("**************** User is able to click on signin button ************************");
			getUser_name().sendKeys(prop.getProperty("userName"));
			log.info("**************** User is able to enter username ************************");
			getPassword().sendKeys(prop.getProperty("textPassword"));
			log.info("**************** User is able to enter password ************************");
			getClickLogInBTN().click();
			log.info("**************** User is able to click on Login button ************************");
		}
		public void getNewAddressDetails() throws Throwable {
			log.info("**************** User is able to enter first name  ************************");
			WaitHelper.getSeleniumWait(getEnterFirstName(), 20);
			getEnterFirstName().clear();
			getEnterFirstName().sendKeys(CommonUtility.getRandomStringValue());
			
			log.info("**************** User is able to enter last name  ************************");
			WaitHelper.getSeleniumWait(getEnterLastName(), 20);
			getEnterLastName().clear();
			getEnterLastName().sendKeys(CommonUtility.getRandomStringValue());
			
			log.info("**************** User is able to enter company name as Home  ************************");
			WaitHelper.getSeleniumWait(getEnterComapnyName(), 20);
			getEnterComapnyName().clear();
			getEnterComapnyName().sendKeys(CommonUtility.getRandomStringValue());
			
			log.info("**************** User is able to enter Home Address  ************************");
			WaitHelper.getSeleniumWait(getEnterAddress(), 20);
			getEnterAddress().clear();
			getEnterAddress().sendKeys("30 Wall "+CommonUtility.getRandomStringValue());
			
			log.info("**************** User is able to enter city  ************************");
			WaitHelper.getSeleniumWait(getEnterCityName(), 20);
			getEnterCityName().clear();
			getEnterCityName().sendKeys("Manhattan"+CommonUtility.getRandomStringValue());
			
			/*
			 * Select select = new
			 * Select(driver.findElement(By.xpath("(//*[@class='select'])[1]")));
			 * //select.selectByVisibleText("New York"); //select.selectByIndex(43);
			 * select.selectByValue("43");
			 */
			log.info("**************** User is able to select state as New York  ************************");
			WaitHelper.getSeleniumWait(getSelectState(), 20);
			CommonUtility.getSelectValues(getSelectState(), "New York");
			
			log.info("**************** User is able to enter zipcode  ************************");
			WaitHelper.getSeleniumWait(getEnterZipCode(), 20);
			getEnterZipCode().clear();
			getEnterZipCode().sendKeys("10005");
			
			log.info("**************** User is able to select state as New York  ************************");
			WaitHelper.getSeleniumWait(getSelectCountryName(), 20);
			CommonUtility.getSelectValues(getSelectCountryName(), "United States");
			
			log.info("**************** User is able to enter shipper phone number  ************************");
			WaitHelper.getSeleniumWait(getEnterPhoneNumber(), 20);
			getEnterPhoneNumber().clear();
			getEnterPhoneNumber().sendKeys(CommonUtility.getRandomNumericValue());
			
			log.info("**************** User is able to click on ship here button  ************************");
			WaitHelper.getSeleniumWait(getClickOnShipHere(), 20);
			CommonUtility.getActionClick(getClickOnShipHere());
			//Alert 
			//Iframe
			//multiple window
			//fluent wait
			//refresh
			log.info("**************** User is able to select shipping method  ************************");
			driver.navigate().refresh();
			WaitHelper.getSeleniumWait(getSelectShippingMethod(), 20);
			CommonUtility.getContinuouslyClickUntilElementFound(getSelectShippingMethod());
			
			
			log.info("**************** User is able to click on next button  ************************");
			WaitHelper.getSeleniumWait(getClickOnNextBTN(), 20);
			CommonUtility.getJsClick(getClickOnNextBTN());
			
			log.info("**************** User is able to click on place order  ************************");
			WaitHelper.getSeleniumWait(getClickOnPlaceOrder(), 20);
			CommonUtility.getJsClick(getClickOnPlaceOrder());
			
			
			
		}
		//How to handle the static dropdown?
		//In order to handle the static dropdown we need the Select class. When we create the select class 
		//object, then with the help of object we can select the value
		//by visibleText,Index, values
		//How to handle the dynamic dropdown?
		//we can handle the dynamic dropdown by actions class (moveToElement)
		
}
