package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test(priority=0)
	public void test1() {
		System.out.println("Test Annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Annotation");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Annotation");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class Annotation");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Annotation");
	}
	
	@AfterSuite
	public void afterSuote() {
		System.out.println("After Suite Annotation");
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("Test2");
	}
	
}
