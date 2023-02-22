package ParelleEx;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.Browser;
import PomModules.LoginOrSignUpPage;
import PomModules.SingUpFrom;

public class TestNgPack123 extends Browser{
	
		private WebDriver driver;
		private LoginOrSignUpPage loginOrSignUpPage;
		private SingUpFrom singUpFrom;
		private static ExtentTest test;
		private static ExtentHtmlReporter reporter;
		
		@Parameters("browser123")
		@BeforeTest
			public void launchBrowser(String browser)
			{
			reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
			ExtentReports extend = new ExtentReports();
			extend.attachReporter(reporter);
			System.out.println("Before Test");
			
				if(browser.equals("Chrome")) 
				{	
			      driver = openChromeBrowser ();
			    }
				if(browser.equals("Edge")) 
				{
					 driver = openEgdeBrowser ();
			    }

			   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			   driver.manage().window().maximize();
} 
			@BeforeClass
			public void  CreatPOMObjects() {
			 loginOrSignUpPage = new LoginOrSignUpPage(driver);
			         singUpFrom = new SingUpFrom (driver);
}
			@BeforeMethod
			public void openSignUpFrom() {
			
			
			  driver.get("https://www.facebook.com/");
			  //LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
				
				loginOrSignUpPage.openSingUpPage();
			  
			}
			
			@Test
			public void verifyTermLinkOnSignUpForm() {
			
			 	//SingUpFrom singUpFrom = new SingUpFrom (driver);
			 	singUpFrom.clickOnTermsLink();
			 	
			 	ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
			      driver.switchTo().window(addr.get(1));
			 	
			String expectedURL = "https://www.facebook.com/legal/terms/update";
			String actualURL   = driver.getCurrentUrl();
			
			if(expectedURL.equals(actualURL))
			{
			  System.out.println("pass");
			}
			else
			{
			  System.out.println("Fail");
			}
			}
			@Test
			public void verifyPrivacyPolicyLinkOnSignUpForm() {
			
			 	//SingUpFrom singUpFrom = new SingUpFrom (driver);
			 	singUpFrom.clickOnTermsLink();
			
			String expectedURL = "https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
			String actualURL   = driver.getCurrentUrl();
			
			if(expectedURL.equals(actualURL))
			{
			  System.out.println("pass");
			}
			else
			{
			  System.out.println("Fail");
			}
			}
			

				
			
			@AfterMethod
			public void goBackToMainPage() {
			ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(addr.get(0));		
		}
			@AfterClass
			public void test12()
			{
			loginOrSignUpPage = null ;	
			      singUpFrom  = null ;
			}
			@AfterTest
			public void closedTheBrowser() {
				driver.quit();
				driver=null;
				System.gc();
			}
			}
		

