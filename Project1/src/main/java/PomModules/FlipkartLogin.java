package PomModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin {
     
     private Actions act ;
     
	@FindBy (xpath = "//span[text()='Account & Lists']")
	private WebElement accAndList;
	
	@FindBy (xpath = "//span[text()='Sign in'])[1]")
	private WebElement signin;
	
	@FindBy (xpath = "//input[@type='email']")
	private WebElement phone;
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	private WebElement Signin ;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement SearchClick;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement Search ;
	
	@FindBy (xpath = "(//input[@id='nav-search-submit-button']")
	private WebElement SearchButton;

	@FindBy (xpath = "(//span[@class='a-price-whole'])[1]")
	private WebElement Mobile;
	
		public FlipkartLogin(WebDriver driver)
		{
	        PageFactory.initElements(driver, this);
	        act = new Actions(driver);
		}	
	
	public void accAndList() {
		act.moveToElement(accAndList).click();
	}
	
	public void signin() {
		act.moveToElement(Signin).click();
	}
	public void phone () {
	phone.sendKeys("9284842092");
	}
	public void Continue() {
		Continue.click();
	}
	public void password (String pass) {
		password.sendKeys("sanket@123");
	}
	public void Signin () {
		Signin.click();
	}
	public void SearchClick () {
		SearchClick.click();
	}
	
	public void Search (String mobile) {
		Search.sendKeys("mobile");
	}
	
	public void SearchButton () { 
		SearchButton.click();
	}
	
	public void Mobile () {
		Mobile.click();
	}
}
