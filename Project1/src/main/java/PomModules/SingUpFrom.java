package PomModules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingUpFrom {
  private WebDriver driver;
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy (xpath = "//input[contains(@name,'email')]")
	private WebElement emailId;
	
	@FindBy (xpath = "//input[contains(@type,'password')])[2]")
	private WebElement newPassword;
	
	@FindBy (xpath = "//select[@Id='day']")
	private WebElement dayOfBirth;
	
	@FindBy (xpath = "//select[@Id='month']")
	private WebElement monthOfBirth ;
	
	@FindBy (xpath = "//select[@Id='year']")
	private WebElement yearOfBirth ;
	
	@FindBy (xpath = "//select[@type='radio'])[1]")
	private WebElement femaleRadioButton ;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]")
	private WebElement maleRadioButton;

	@FindBy (xpath = "(//input[@type='radio'])[3]")
	private WebElement customRadioButton;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement submitButton;
	
	@FindBy (xpath = "(//a[text()= 'Terms'])[2]")
	private WebElement TermsLink;
	
	@FindBy (xpath = "(//a[text()= 'Privacy Policy'])[2]")
	private WebElement PrivacyPolicy;
	
	@FindBy (xpath = "//a[text()= 'Cookies Policy']")
	private WebElement  CookiesPolicy;
	
	private Actions act;
	public SingUpFrom(WebDriver driver)
	{ 
	  PageFactory.initElements(driver, this);
	  this.driver = driver ;
	  act = new Actions(driver);// initialize the global driver
	}
	public void clickOnTermsLink() {
		TermsLink.click();
	}
	public void clickOnPrivacyPolicy() {
		PrivacyPolicy.click();
		}  
	public void clickOnCookiesPolicy() {
		CookiesPolicy.click();
		}  
	//Scenario 1==> waithing for both element is diffrent
	public void sendFirstName(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(firstName));
	   firstName.sendKeys(name);
	}
	
	public void sendLastName(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);//..........same time use then( private aWevDriverWait wait;)..59,66
		wait.until(ExpectedConditions.visibilityOf(lastName));
		lastName.sendKeys(name);
	}
	public void sendEmailOrMobileNumber(String emailOrPhone)
	{
	   emailId.sendKeys(emailOrPhone);
	   JavascriptExecutor js = ( JavascriptExecutor)driver;
	   js.executeAsyncScript("argument[0].scrollIntoView(true);",emailId);
	   
	}
	
	public void sendNewPassword(String password)
	{
	   emailId.sendKeys(password);
	}
	
	public void selectDayOfBirth(String name)
	{
	   Select s = new Select(dayOfBirth);
	   s.selectByVisibleText("15");
	}
	
	public void selectMonthOfBirth(String name)
	{
	   Select s = new Select(monthOfBirth);
	   s.selectByVisibleText("Apr");
	}
	
	public void selectYearOfBirth(String name)
	{
	   Select s = new Select(yearOfBirth);
	   s.selectByVisibleText("2000");
	}
	
	public void selectFemaleRadioButton() {
	  femaleRadioButton.click();
	}
	
	public void selectMaleRadioButton() {
		  maleRadioButton.click();
		}
		
	public void selectCustomRadioButton() {
		 // customRadioButton.click();
	//	Actions act = new Actions(driver);...............45,50 line
		act.moveToElement(customRadioButton).click().build().perform();
		}
	
	public void clickOnSubmitButton() {
		// submitButton.click();
		// Actions act = new Actions(driver);........45,50 line
		 act.moveToElement(submitButton).click().build().perform();
		}  
	
}
