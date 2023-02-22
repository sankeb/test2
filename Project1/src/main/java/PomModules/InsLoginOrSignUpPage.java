package PomModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InsLoginOrSignUpPage {


	@FindBy (xpath=("//span[@class='_aacl _aaco _aacw _aad0 _aad7']"))
	private WebElement SignUp;
	
	@FindBy (xpath = "//input[@name='emailOrPhone']")
	private WebElement MobileNumber ;
	
	@FindBy (xpath = "//input[@name='fullName']")
	private WebElement Full;
	
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
	
	public InsLoginOrSignUpPage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	  public void SignUp () {  
	  SignUp.click();
	  }
	  public void MobileNumber () {
	   MobileNumber.sendKeys("9284842092");
	  }
	  public void Full () {
	   
	 Full.sendKeys("sanket bhosale");
	  }
	  public void Username () {
	 Username.sendKeys("sanketbhosale706");
	  }
	 public void Password () {
	 Password.sendKeys("satara@123");
	 }
	 public void Signup () {
	 Signup.submit();
	 }
	 public void month () {
	  Select s = new Select (month);
	 s.selectByValue("12");

	 }
	 
	 public void day () {
	 Select d = new Select (day);
	  d.selectByValue("12");
	 day.click();
	 }
	 public void year () {
	 Select y = new Select(year);
	  y.selectByValue("1997");
	 year.click();
	 }
	 public void Next () {  
	  Next.click();
	 }
	  
	 
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
