package TestNgpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass4 {
    
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("before Suite -TestClass_4");
	}
	
	@BeforeTest
	public void beforeTest() {
	System.out.println("before Test -TestClass_4");
	}
	
	@BeforeClass
	public void beforeClass() {
	  System.out.println("Before Class - TestClass_4");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	 System.out.println("Before Method -TestClass_4");
	}
	
	@Test(priority = 3)
	public void testA() {
	 System.out.println("Test A  -TestClass_4");
	}
	
	
	@Test
	public void testB() {
	 System.out.println("Test B -TestClass_4");
	}
	@Test
	public void testC() {
	 System.out.println("Test C -TestClass_4");
	}
	
	@Test(priority = 2)
	public void testD() {
	 System.out.println("Test D -TestClass_4");
	}
	@AfterMethod
	public void afterMethod() {
	 System.out.println("After Method -TestClass_4");
	}
	
	@AfterClass
	public void afterClass() {
	 System.out.println("After Class -TestClass_4");
	}
	
	@AfterTest
	public void afterTest() {
	System.out.println("After Test -TestClass_4");
	}
	@AfterSuite
	public void afterSuite() {
	System.out.println("after Suite -TestClass_4");
	}
	
}
