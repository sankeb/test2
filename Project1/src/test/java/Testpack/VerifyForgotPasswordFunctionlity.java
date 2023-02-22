package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomModules.ForgotPassword;
import PomModules.LoginOrSignUpPage;

public class VerifyForgotPasswordFunctionlity {
public static void main(String[] args) {
	
	//Step - 1
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium file\\chromedriver_win32\\chromedriver.exe");
		
	   WebDriver driverTest = new ChromeDriver();
	   
	   driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driverTest.manage().window().maximize();
	   driverTest.get("https://www.facebook.com/");
    
	   // Step - 2: Click on forgot password link
	
	LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
	
	loginOrSignUpPage.clickOnForgotPasswordLink();
	
	// Step - 3 Verify the text
	
	ForgotPassword forgotPassword = new ForgotPassword(driverTest);
	// Actual Result
	String actualMsg = forgotPassword.getTextMessage();
	if(actualMsg.equals("Please enter your email address or mobile number to search for your account."))		
	{
		System.out.println("Msg is valigated");
			
	}
	else
	{
	  System.out.println("Msg is wrong"); 
	}
	  
	// Step - 4 enter the EmailId
	
	forgotPassword.enterEmailOrPhoneNumber("sanket");
	
	// Step - 5 click on search button
	
	forgotPassword.clickOnSearch();
	
	String actualtitle = driverTest.getTitle();
	String actualurl   = driverTest.getCurrentUrl();
	
	String expectedTitle ="Forgotten Password | Can't Log In | Facebook";
	String expectedURL = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
	
	if(actualtitle.equals(expectedTitle)&& actualurl.equals(expectedURL)) {
	System.out.println("Test pass");
	}
	else
	{
	System.out.println("Test Fail");
	}
	
	
	
	
	
	
	
	
	
}
}
