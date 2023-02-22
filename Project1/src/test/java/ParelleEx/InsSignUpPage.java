package ParelleEx;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Browser;
import PomModules.InsLoginOrSignUpPage;
import utils.Utility;


public class InsSignUpPage extends Browser{

	private WebDriver driver;
	private InsLoginOrSignUpPage insLoginOrSignUpPage;
    String testID ;
    
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
	public void CreatPOMObjects()
	{
		insLoginOrSignUpPage = new InsLoginOrSignUpPage(driver);
		           
	}
		
   @BeforeMethod
   public void beforeMethod() {
	  System.out.println("BeforeMethod");
	  driver.get("https://www.instagram.com/");
	  
	}
	
	@Test
	public void test1()
	{
		testID = "T103";
	 System.out.println("Test 1");
		
	  insLoginOrSignUpPage.Signup();
	  insLoginOrSignUpPage.MobileNumber();
	  insLoginOrSignUpPage.Full();
	  insLoginOrSignUpPage.Username();
	  insLoginOrSignUpPage.Password();
	  insLoginOrSignUpPage.Signup();
	  insLoginOrSignUpPage.month();
	  insLoginOrSignUpPage.day();
	  insLoginOrSignUpPage.year();
	}
		@AfterMethod
		public void afterMethod(ITestResult result) throws IOException
	{
			if(ITestResult.FAILURE==result.getStatus())
			{
				Utility.captureScreenshot(testID, driver);
			}
	  System.out.println("AfterMethod");
	  System.out.println("Next");
	}
	
	@AfterClass
	public void test123 () {
		insLoginOrSignUpPage = null ;	
	
	}
	
	@AfterTest
	public void afterClass()
	{
	 System.out.println("AfterClass");
	  driver.close();
	  driver = null;
	  System.gc(); 
	}
}


