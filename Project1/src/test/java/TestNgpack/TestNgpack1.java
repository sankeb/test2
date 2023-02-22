package TestNgpack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomModules.LoginOrSignUpPage;
import PomModules.SingUpFrom;

public class TestNgpack1 {


public class TestNgClass {
private WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
	  System.out.println("BeforeClass");
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium file\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	}
	@BeforeMethod
	public void openSignUpFrom()
	{
	
	  driver.get("https://www.facebook.com/");
	  LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		
		loginOrSignUpPage.openSingUpPage();
	  
	}
	
	@Test
	public void verifyTermLinkOnSignUpForm() {
	
	 	SingUpFrom singUpFrom = new SingUpFrom (driver);
	 	singUpFrom.clickOnTermsLink();
	 	
	 	ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
	      driver.switchTo().window(addr.get(1));
	 	
	String expectedURL = "https://www.facebook.com/legal/terms/update";
	String actualURL   = driver.getCurrentUrl();
	
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(actualURL, expectedURL);
	soft.assertAll();
	}
	@Test
	public void verifyPrivacyPolicyLinkOnSignUpForm() {
	
	 	SingUpFrom singUpFrom = new SingUpFrom (driver);
	 	singUpFrom.clickOnTermsLink();
	
	String expectedURL = "https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
	String actualURL   = driver.getCurrentUrl();
	
	SoftAssert soft = new SoftAssert();
	boolean result =actualURL.equals(expectedURL);
	soft.assertTrue(result);
    soft.assertAll();
	}
	

		
	
	@AfterMethod
	public void goBackToMainPage() {
	ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(addr.get(0));		
}
	@AfterClass
	public void closedTheBrowser() {
		driver.quit();
	}
}
}