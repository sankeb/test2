package TestNgpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomModules.LoginOrSignUpPage;

public class TestNgClass {
private WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
	  System.out.println("BeforeClass");
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
	  System.out.println("BeforeMethod");
	  driver.get("https://www.facebook.com/");
	  LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		
		loginOrSignUpPage.sendUserName("9423930570");
		loginOrSignUpPage.sendPasswordName("sanket@123");
		loginOrSignUpPage.clickOnLoginButton();
	  
	}
	
	@Test
	public void test1()
	{
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
	public void afterMethod()
	{
	  System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass()
	{
	 System.out.println("AfterClass");
	}
}
