package TestNgpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeClass
	public void beforeClass() {
	  System.out.println("Before Class - TestClass_2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	 System.out.println("Before Method");
	}
	
	@Test
	public void testA() {
	 System.out.println("Test A - TestClass2");
	}
	
	
	@Test
	public void testB() {
	 System.out.println("Test B - TestClass2");
	}
	@Test
	public void testC() {
	 System.out.println("Test C - TestClass2");
	}
	
	@Test
	public void testD() {
	 System.out.println("Test D - TestClass2");
	}
	@AfterMethod
	public void afterMethod() {
	 System.out.println("After Method - TestClass2");
	}
	
	@AfterClass
	public void afterClass() {
	 System.out.println("After Class - TestClass2");
	}
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

