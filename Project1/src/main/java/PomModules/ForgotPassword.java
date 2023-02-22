package PomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

	// Variable
	
	@FindBy (xpath = "//table//tr[1]//td[2]//div")
	private WebElement forgotMessage ;
	
	@FindBy (xpath = "(//input[@name='email'])[2]")
	private WebElement emailOrPhoneNumber ;
	
	@FindBy (xpath = "//a[text()='Cancel']")
	private WebElement cancelButton ;
	
	@FindBy (xpath = "//button[text()='Search']")
	private WebElement searchButton ;
	
	// Constructor
	
	public ForgotPassword(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	// Method
	
	public String getTextMessage()  {
	  String text = forgotMessage.getText();
	  System.out.println(text);
	  return text;
	}
	
	public void enterEmailOrPhoneNumber(String email) {
	emailOrPhoneNumber.sendKeys(email);
	}	 
	
	public void clickOnCancel() {
	  cancelButton.click();
		}	 
	
	public void clickOnSearch() {
		  searchButton.click();
			}	 
		
	
	
}
