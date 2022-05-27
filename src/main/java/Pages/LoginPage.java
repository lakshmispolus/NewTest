package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage extends BaseClass {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement twotabsearchtextbox;

	@FindBy(id = "nav-search-submit-button")
	private WebElement navsearchsubmitbutton;

	@FindBy(xpath = "(//input[@class='a-button-input'])[1]")
	private WebElement dontChange;

	@FindBy(xpath = "//*[contains(text(),'Xiaomi Redmi Note 9 Pro 128GB + 6GB RAM, 6.67\" FHD+ DotDisplay, 64MP AI Quad Camera, Qualcomm Snapdragon 720G LTE Factory Unlocked Smartphone - International Version (Tropical Green)')]")
	private WebElement iteamName;

	@FindBy(id = "quantity")
	private WebElement quantity;

	@FindBy(id = "add-to-cart-button")
	private WebElement addtocartbutton;

	public void searchTextbox(String value) {
		twotabsearchtextbox.sendKeys(value);
		twotabsearchtextbox.sendKeys(Keys.ENTER);
	}

	public void navSearchSubmitButton() {
		navsearchsubmitbutton.click();
	}

	public void itemClick() {
		iteamName.click();
	}

	public void dontChange() {
		dontChange.click();

	}

	public void addToCartButton() {
		addtocartbutton.click();

	}

}
