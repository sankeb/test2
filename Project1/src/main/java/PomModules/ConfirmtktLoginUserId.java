package PomModules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmtktLoginUserId {

	@FindBy (xpath="//input[@id='user-name']")
	private WebElement UserName;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password ;
	
	@FindBy (xpath = "//input[@id='login-button']")
	private WebElement Loginbutton;
	
	@FindBy (xpath = "//input[@name='username']")
	private WebElement Username ;
	
	@FindBy (xpath = "//input[@aria-label='Password']")
	private WebElement Password ;
	
	@FindBy (xpath = "//button[text()='Sign up']")
	private WebElement Signup;
	
	@FindBy (xpath = "//select[@title='Month:']")
	private WebElement month ;
	
	@FindBy (xpath = "(//select[@title='Day:']")
	private WebElement day;

	@FindBy (xpath = "(//select[@title='Year:']")
	private WebElement year;
	
	@FindBy (xpath = "(//div[@style='width: 100%;'][2]")
	private WebElement Next;
	
}
