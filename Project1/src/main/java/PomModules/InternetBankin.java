package PomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetBankin {

	// Variable
	
	@FindBy (xpath ="//span[text()='Accounts']")
	private WebElement account ;
	
	@FindBy (xpath ="(//span[text()='Cards'])[1]")
	private WebElement cards;
	
	@FindBy (xpath ="//span[text()='Loans']")
	private WebElement loans ;
	
	// Constructor
	
	public InternetBankin(WebDriver driver)
	{
	   PageFactory.initElements(driver,this);
	}
	
	 // Methods
	
	public void clickOnAccounts() {
	 account.click();
	}
	
	public void clickOnCards() {
	  cards.click();
	}
	  public void sendLoanAmount() {
	    loans.sendKeys("123");
	  }
	public void moveToAccount() {
		Actions act = new Actions(driver);
		act.moveToElement(account).perform();
		
	}
}
