package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPageFlipkart;
import Utilities.BaseClass;


public class LoginFlipKart extends BaseClass{
	LoginPageFlipkart loginpage;
  @Test
  public void addToCart() { 	 
	  loginpage = new LoginPageFlipkart(driver);
	 
	 loginpage.username("standard_user");
	  loginpage.password("secret_sauce");
	 loginpage.login();
	 loginpage.filtering();
	 loginpage.itemSelecting();
	 loginpage.addTocart();
	 loginpage.cart();
	 loginpage.continueShopping();
	 loginpage.filtering();
	 loginpage.cart();
	 loginpage.checkout();
	 loginpage.firstName("Lax");
	 loginpage.lastName("Nair");
	 loginpage.postalcode("686631");
	 loginpage.continueBtn();
	 loginpage.finish();
	 loginpage.backToHome();
	 String expected="PRODUCTS";
	 String result=loginpage.pdtName();	 
	 Assert.assertEquals(expected, result);
	 driver.close();
  }
 
  
  @BeforeTest
  @Parameters({ "Browser" })
	public void beforeTest(String Browser) throws InterruptedException, IOException {	
		driver = launchBrowser1("https://www.saucedemo.com/");

	}
}
