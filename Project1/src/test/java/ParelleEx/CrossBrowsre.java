package ParelleEx;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
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
import PomModules.ForgotPassword;
import PomModules.LoginOrSignUpPage;
import utils.Utility;

public class CrossBrowsre extends Browser {

	
	
private WebDriver driver;
private LoginOrSignUpPage loginOrSignUpPage;
private  ForgotPassword forgotPassword;
private static ExtentTest test;
private static ExtentHtmlReporter reporter;
private String testID ;
    @Parameters("browser123")
	@BeforeTest
	public void launchBrowser(String browser)
	{
    	reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
	  System.out.println("Before Class");

		if(browser.equals("Chrome")) 
		{	
	      driver = openChromeBrowser ();
	    } 
		if(browser.equals("Edge")) 
		{
			 driver = openEgdeBrowser ();
	    }  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	}
	
	@BeforeClass
	public void CreatPOMObjects()
	{
		loginOrSignUpPage = new LoginOrSignUpPage(driver);
		forgotPassword    = new ForgotPassword(driver);
	}
		
   @BeforeMethod
   public void beforeMethod() throws EncryptedDocumentException, IOException {
	  System.out.println("BeforeMethod");
	  driver.get("https://www.facebook.com/");
	 // LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		
		loginOrSignUpPage.sendUserName(Utility.getExcelSheetData("TestData", 1, 0));
		loginOrSignUpPage.sendPasswordName(Utility.getExcelSheetData("TestData", 1, 1));
		loginOrSignUpPage.clickOnLoginButton();
	  
	}
	
	@Test
	public void test1()
	 
	{
		testID = "T101";
	 System.out.println("Test 1");
        String actualtitle = driver.getTitle();
		String actualurl   = driver.getCurrentUrl();
		
		String expectedTitle ="Forgotten Home Page";
		String expectedURL = "https://www.facebook.com/home";
		 
		if(actualtitle.equals(expectedTitle)&& actualurl.equals(expectedURL)) {
			System.out.println("Test pass");
			}
			else
			{
			System.out.println("Test Fail");
			}
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
		  Utility.captureScreenshot(testID, driver);
		}
	  System.out.println("AfterMethod");
	  System.out.println("LogOut");
	}
	
	@AfterClass
	public void test123 () {
		loginOrSignUpPage = null ;	
		forgotPassword    = null ;
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


