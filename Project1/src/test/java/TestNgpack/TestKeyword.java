package TestNgpack;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestKeyword {

	@BeforeClass
	public void beforeClass()
	{
	  System.out.println();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
	  System.out.println();
	}
	
	@Test(invocationCount = 2,priority = 2)
	public void test1() {
	System.out.println("Test 1");
	}
	
	@Test (priority = 4)
	public void test2() {
	System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
	System.out.println("Test 3");
	}
	
	@Test (priority = 3)
	public void test4() {
	System.out.println("Test 4");
	}
	
	
	
	
	
	
	
}
