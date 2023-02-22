package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomModules.LoginOrSignUpPage;

public class VerifyLoginFunctionality {
public static void main(String[] args) {
	

	//Step - 1
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium file\\chromedriver_win32\\chromedriver.exe");
		
	   WebDriver driverTest = new ChromeDriver();
	   
	   driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driverTest.manage().window().maximize();
	   driverTest.get("https://www.facebook.com/");
    	
	   // 2
	LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
	
	loginOrSignUpPage.sendUserName("sanketbhosale2016@gmail.com");
	loginOrSignUpPage.sendPasswordName("sanket@123");
	
	// 3
	
	loginOrSignUpPage.clickOnLoginButton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
