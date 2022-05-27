package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPageFlipkart extends BaseClass {
	WebDriver driver;

	public LoginPageFlipkart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement login;
	
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select")
	private WebElement filter;
	
	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	private WebElement item;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addTocart;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement cart;
	
	@FindBy(xpath = "//button[@id='continue-shopping']")
	private WebElement continueShopping;
	
	@FindBy(id = "checkout")
	private WebElement checkout;
	
	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement postalcode;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebtn;
	
	@FindBy(xpath = "//button[@id='finish']")
	private WebElement finish;
	
	@FindBy(xpath = "//button[@id='back-to-products']")
	private WebElement backToHome;
	
	@FindBy(xpath = "//span[@class='title']")
	private WebElement pddtname;

	public void username(String mobilenumber) {
		username.sendKeys(mobilenumber);
		
	}
	public void password(String passwordText) {
		password.sendKeys(passwordText);	
	}
	public void login() {
		login.click();		
	}
		
	public void filtering() {
		filter.click();
		filter.sendKeys(Keys.ARROW_DOWN);
		filter.sendKeys(Keys.ENTER);		
	}
	public void itemSelecting() {
		item.click();		
	}
	
	public void addTocart() {
		addTocart.click();			
	}
	public void cart() {
		cart.click();			
	}

	public void continueShopping() {
		continueShopping.click();			
	}
	public void checkout() {
		checkout.click();			
	}
	public void firstName(String value) {
		firstName.sendKeys(value);		
	}
	public void lastName(String value) {
		lastName.sendKeys(value);		
	}
	public void postalcode(String value) {
		postalcode.sendKeys(value);		
	}
	public void continueBtn() {
		continuebtn.click();			
	}
	public void finish() {
		finish.click();			
	}
	public void backToHome() {
		backToHome.click();			
	}
	public String pdtName() {
		String pdtname=pddtname.getText();
		return pdtname;
	}
}
