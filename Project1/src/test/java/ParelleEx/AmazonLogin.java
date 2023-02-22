package ParelleEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Browser;
import PomModules.FlipkartLogin;
import PomModules.LoginOrSignUpPage;

public class AmazonLogin extends Browser {
    private WebDriver driver;
    
    private FlipkartLogin flipkartLogin;
    
    @Parameters("browser123")
	@BeforeTest
	public void launchBrowser(String browser)
	{
	  System.out.println("Before Class");

		if(browser.equals("Chrome")) 
		{	
	      driver = openChromeBrowser ();
	    }
		if(browser.equals("Edge")) 
		{
			 driver = openEgdeBrowser ();
	    }
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	}
	@BeforeClass
	public void CreatPOMObject()
	{
		 flipkartLogin = new FlipkartLogin(driver);
		             
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");
	driver.get("https://www.amazon.in/");
	}
     
	@Test 
	public void test1()
	{
	  System.out.println("Test 1");
	  flipkartLogin.accAndList();
	  flipkartLogin.signin();
	 
}
	@AfterMethod
	public void afterMethod()
	{
	  System.out.println("AfterMethod");
	  System.out.println("LogOut");
	}
	@AfterClass
	public void test123() {
		flipkartLogin = null;
	}
	
	@AfterTest
	public void afterClass()
	{
	  System.out.println("After Class");
	  driver.close();
	  driver = null;
	 System.gc();
}
}
 