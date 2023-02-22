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

public class TestClass3 {
     
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("before Suite -TestClass_3");
	}
	@BeforeTest
	public void beforeTest() {
	System.out.println("before Test -TestClass_3");
	}
	
	@BeforeClass
	public void beforeClass() {
	  System.out.println("Before Class - TestClass_3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	 System.out.println("Before Method -TestClass_3");
	}
	
	@Test(priority = 3)
	public void test1() {
	 System.out.println("Test 1 -TestClass_3");
	}
	
	
	@Test
	public void test2() {
	 System.out.println("Test 2 -TestClass_3");
	}
	@Test
	public void test3() {
	 System.out.println("Test 3 -TestClass_3");
	}
	
	@Test(priority = 2)
	public void test4() {
	 System.out.println("Test 4 -TestClass_3");
	}
	@AfterMethod
	public void afterMethod() {
	 System.out.println("After Method -TestClass_3");
	}
	
	@AfterClass
	public void afterClass() {
	 System.out.println("After Class -TestClass_3");
	}
	
	@AfterTest
	public void afterTest() {
	System.out.println("After Test -TestClass_3");
	}
	
	@AfterSuite
	public void afterSuite() {
	System.out.println("After Suite -TestClass_3");
	}
}
