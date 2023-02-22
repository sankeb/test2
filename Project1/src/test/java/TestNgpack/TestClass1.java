package TestNgpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	@BeforeClass
	public void beforeClass() {
	  System.out.println("Before Class - TestClass_1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	 System.out.println("Before Method -TestClass_1");
	}
	
	@Test(priority = 3)
	public void test1() {
	 System.out.println("Test 1 -TestClass_1");
	}
	
	
	@Test
	public void test2() {
	 System.out.println("Test 2 -TestClass_1");
	}
	@Test
	public void test3() {
	 System.out.println("Test 3 -TestClass_1");
	}
	
	@Test(priority = 2)
	public void test4() {
	 System.out.println("Test 4 -TestClass_1");
	}
	@AfterMethod
	public void afterMethod() {
	 System.out.println("After Method -TestClass_1");
	}
	
	@AfterClass
	public void afterClass() {
	 System.out.println("After Class -TestClass_1");
	}
	
	
	
	
	
	
	
	
	
}
