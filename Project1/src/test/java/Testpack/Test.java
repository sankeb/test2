package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomModules.ForgotPassword;
import PomModules.LoginOrSignUpPage;

public class Test {
public static void main(String[] args) {

	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium file\\chromedriver_win32\\chromedriver.exe");
		
	   WebDriver driverTest = new ChromeDriver();
	   
	driverTest.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	driverTest.manage().window().maximize();
	driverTest.get("https://www.facebook.com/");
	
	
	LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
	loginOrSignUpPage.sendUserName("sdsxvsx");
	loginOrSignUpPage.sendPasswordName();
	loginOrSignUpPage.clickOnLoginButton();
	
	ForgotPassword forgotPassword = new ForgotPassword(driverTest);
	
	forgotPassword.getTextMessage();
	forgotPassword.enterEmailOrPhoneNumber("Velocity@gmail.com");
	forgotPassword.clickOnSearch();
	
	
	
	
}
}
